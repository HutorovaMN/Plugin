package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementToBeClickableAndDisplayed;

public class SwaggerPage {

    private WebDriver driver;

    public SwaggerPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By GET_REQUEST_LIST = By.xpath(" //*[text() ='Returns a list of users.']");
    private final By TRY_IT_BUTTON = By.xpath("//*[text() = 'Try it out ']");
    private final By EXECUTE_BUTTON = By.xpath("//*[text() = 'Execute']");

    public void clickRequest() {
        driver.findElement(GET_REQUEST_LIST).click();
    }

    public void clickTryIt() {
        driver.findElement(TRY_IT_BUTTON).click();
    }

    public boolean elementExecuteIsDisplayed() {
        return elementToBeClickableAndDisplayed(driver, EXECUTE_BUTTON);
    }
}
