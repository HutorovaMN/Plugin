package page;

import org.junit.jupiter.params.provider.Arguments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.stream.Stream;

import static helpers.Actions.elementIsDisplayed;
import static helpers.Actions.rightClick;


public class AspectsPage {

    private WebDriver driver;

    public AspectsPage(WebDriver driver) {
        this.driver = driver;
    }

    private static final String DOCHUB_ELEMENT = "//*[@class = 'entity']";
    private final By CONTEXT_LIST = By.xpath("//*[@aria-haspopup = 'listbox']//child::div[@class= 'v-input__icon v-input__icon--append']");
    private static final String EXPERT_BUTTON = "//*[text()='Компоненты эксперта R.Piontik']";
    private static final String DOCHUB_CONTAINER_ARCHITECTURE_BUTTON = "//*[text() = 'Контейнерная архитектура SEAF.ArchTool']";
    private static final String DOCHUB_CONTAINER_ELEMENT = "//*[@class = 'entity']";
    private static final String
            GENERAL_ARCHITECTURE_OF_DOCHUB_BUTTON = "//*[text() = 'Демонстрация UML опций контекста']";
    private static By REPRESENTATION_IN_SMARTS_ANTS_BUTTON = By.xpath("//*[text() = 'Представление в SmartAnts']");
    private static By ELEMENT_SMARTS_ANTS = By.xpath("//h1[@id='архитектурные-аспекты-aspects']");

    public void clickElement(String element) {
        driver.findElement(CONTEXT_LIST).click();
        driver.findElement(By.xpath(element)).click();
    }

    public Boolean elementDocHubIsDisplayed(String element) {
        return elementIsDisplayed(driver, By.xpath(element));
    }

    public static Stream<Arguments> getLocator() {
        return Stream.of(
                Arguments.of(GENERAL_ARCHITECTURE_OF_DOCHUB_BUTTON, DOCHUB_ELEMENT, "Общая архитектура SEAF.ArchTool")
//                Arguments.of(DOCHUB_CONTAINER_ARCHITECTURE_BUTTON, DOCHUB_CONTAINER_ELEMENT, "Контейнерная архитектура SEAF.ArchTool"),
//                Arguments.of(EXPERT_BUTTON, DOCHUB_ELEMENT, "Компоненты эксперта R.Piontik")
        );
    }

    public void clickRight() {
        rightClick(driver, driver.findElement(By.xpath(DOCHUB_ELEMENT)));
    }

    public void ClickSmartAnts() {
        driver.findElement(REPRESENTATION_IN_SMARTS_ANTS_BUTTON).click();
    }

    public Boolean elementSmartAntsIsDisplayed() {
        return elementIsDisplayed(driver, ELEMENT_SMARTS_ANTS);
    }
}
