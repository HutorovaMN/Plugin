package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementIsDisplayed;

public class AsyncApiPage {

    private WebDriver driver;

    public AsyncApiPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By SERVERS_ELEMENT = By.xpath("//*[@id = 'server-production']");
    private final By OPERATIONS_ELEMENT = By.xpath("//*[@id = 'operations']");
    private final By MESSAGE_ELEMENT = By.xpath("//*[@id = 'message-UserSignedUp']");
    private final By SCHEMAS_ELEMENT = By.xpath("//*[@id = 'schema-userSignedUpPayload']");

    public Boolean elementServersIsDisplayed() {
        return elementIsDisplayed(driver, SERVERS_ELEMENT);
    }

    public Boolean elementOperationsIsDisplayed() {
        return elementIsDisplayed(driver, OPERATIONS_ELEMENT);
    }

    public Boolean elementMessageIsDisplayed() {
        return elementIsDisplayed(driver, MESSAGE_ELEMENT);
    }

    public Boolean elementSchemasIsDisplayed() {
        return elementIsDisplayed(driver, SCHEMAS_ELEMENT);
    }
}
