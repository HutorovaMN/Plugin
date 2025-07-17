package page;

import org.junit.jupiter.params.provider.Arguments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.stream.Stream;

import static helpers.Actions.elementIsDisplayed;
import static helpers.Actions.elementToBeClickableAndDisplayed;

public class TemplatesPage {

    private WebDriver driver;

    public TemplatesPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By DOCS_MARKDOWN_ELEMENT = By.xpath("//*[text() = 'Документы']/ancestor::ul[2]");
    private final By PLANT_UML_SCHEMA = By.xpath("//div[@class = 'plantuml-schema']");
    private final By SERVER_ORDER_ELEMENT = By.xpath("//*[@id = 'server-orders']");
    private final By SERVER_PAYMENTS_ELEMENT = By.xpath("//*[@id = 'server-payments']");
    private final By OPERATION_ELEMENT = By.xpath("(//div[@class = 'text-sm text-gray-700'])[4]");
    private final By MESSAGE_ELEMENT = By.xpath("//*[@id = 'messages']");
    private final By SCHEMAS_ELEMENT = By.xpath("//*[@id = 'schemas']");
    private final static String GET_REQUEST_LIST = "(//span[@class='opblock-summary-method'])[1]";
    private final static String PAYMENT_REQUEST_LIST = "(//span[@class='opblock-summary-method'])[1]";
    private final By TRY_OUT_BUTTON = By.xpath("//*[text() = 'Try it out ']");
    private final By EXECUTE_BUTTON = By.xpath("//*[text() = 'Execute']");

    public boolean elementMarkdownIsDisplayed() {
        return elementIsDisplayed(driver, DOCS_MARKDOWN_ELEMENT);
    }

    public boolean elementPlantUMLIsDisplayed() {
        return elementIsDisplayed(driver, PLANT_UML_SCHEMA);
    }

    public boolean elementServerOrderIsDisplayed() {
        return elementIsDisplayed(driver, SERVER_ORDER_ELEMENT);
    }

    public boolean elementServerPaymentIsDisplayed() {
        return elementIsDisplayed(driver, SERVER_PAYMENTS_ELEMENT);
    }

    public boolean elementOperationIsDisplayed() {
        return elementIsDisplayed(driver, OPERATION_ELEMENT);
    }

    public boolean elementMessageIsDisplayed() {
        return elementIsDisplayed(driver, MESSAGE_ELEMENT);
    }

    public boolean elementSchemasIsDisplayed() {
        return elementIsDisplayed(driver, SCHEMAS_ELEMENT);
    }

    public void clickRequest(String element) {
        driver.findElement(By.xpath(element)).click();
    }

    public void clickTryOut() {
        driver.findElement(TRY_OUT_BUTTON).click();
    }

    public boolean elementExecuteIsDisplayed() {
        return elementToBeClickableAndDisplayed(driver, EXECUTE_BUTTON);
    }

    public static Stream<Arguments> getLocator() {
        return Stream.of(
                Arguments.of(GET_REQUEST_LIST, "Получение списка заказов"),
                Arguments.of(PAYMENT_REQUEST_LIST, "Получение списка счетов")
        );
    }
}
