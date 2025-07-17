package page;

import org.junit.jupiter.params.provider.Arguments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.stream.Stream;

import static helpers.Actions.elementToBeClickableAndDisplayed;


public class APIDocHubPage {

    private WebDriver driver;

    public APIDocHubPage(WebDriver driver) {
        this.driver = driver;
    }

    private static final String JSONATA_REQUEST_LIST = "//*[text() ='Выполняет произвольный запрос JSONata к данным архитектуры']";
    private static final String RELOAD_LIST = "//*[text() ='Выполняет запрос перезагрузки данным архитектуры']";
    private static final String DATA_PROFILE_LIST = "//*[contains (text() ,' https://dochub.info/docs/dochub.datasets')]";
    private static final String PROBLEMS_LIST = "//*[contains (text() ,'Возвращает перечень обнаруженных проблем')]";
    private static final String PRESENTATIONS_LIST = "//*[contains (text() ,'Вызывает специальную (upload) презентацию сущности')]";
    private final By TRY_IT_OUT_BUTTON = By.xpath("//*[text() ='Try it out ']");
    private final By EXECUTE_BUTTON = By.xpath("//*[text() ='Execute']");
    private final By JSONATA_QUERY_LIST = By.xpath("//*[text() ='JSONataQuery']/ancestor-or-self::span");
    private final By PATTERN_TEXT = By.xpath("//*[@class = 'property primitive']");

    public void clickElement(String element) {
        driver.findElement(By.xpath(element)).click();
    }

    public void clickTryItOutButton() {
        driver.findElement(TRY_IT_OUT_BUTTON).click();
    }

    public Boolean elementExecuteButtonToBeClickableAndDisplayed() {
        return elementToBeClickableAndDisplayed(driver, EXECUTE_BUTTON);
    }

    public static Stream<Arguments> getLocator() {
        return Stream.of(
                Arguments.of(JSONATA_REQUEST_LIST, "/core/storage/jsonata/{query}"),
                Arguments.of(RELOAD_LIST, "/core/storage/reload"),
                Arguments.of(DATA_PROFILE_LIST, "/core/storage/release-data-profile/{path}"),
                Arguments.of(PROBLEMS_LIST, "/core/storage/problems/"),
                Arguments.of(PRESENTATIONS_LIST, "/entities/{entity}/presentations/{presentation}")
        );
    }

    public void clickJsonataQuery() {
        driver.findElement(JSONATA_QUERY_LIST).click();
    }

    public String getTextPattern() {
        return driver.findElement(PATTERN_TEXT).getText();
    }
}

