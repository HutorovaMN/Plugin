package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementIsDisplayed;
import static helpers.Actions.elementToBeClickableAndDisplayed;

public class HTMLPage {

    private WebDriver driver;

    public HTMLPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By TABLE_PLUGIN_TEXT = By.xpath("//*[text() = 'Параметры передаваемые в плагин:']//following-sibling::table");
    private final By HTML_CODE_ELEMENT = By.xpath("//*[text() = 'Привет!']");
    private final By SAMPLE_API_ELEMENT = By.xpath("//*[text() = 'Sample API']");
    private final By GET_LIST = By.xpath("//*[@id ='operations-default-get_users']//following-sibling::*[@class ='arrow']");
    private final By TRY_IT_OUT_BUTTON = By.xpath("//*[text() = 'Try it out ']");
    private final By EXECUTE_BUTTON = By.xpath("//*[text() = 'origin']");

    public boolean elementTablePluginIsDisplayed(int i) {
        return driver.findElements(TABLE_PLUGIN_TEXT).get(i).isDisplayed();
    }

    public boolean elementHTMLCodeIsDisplayed() {
        return elementIsDisplayed(driver, HTML_CODE_ELEMENT);
    }

    public boolean elementSampleApiIsDisplayed() {
        return elementIsDisplayed(driver, SAMPLE_API_ELEMENT);
    }

    public void clickButtonGet() {
        driver.findElement(GET_LIST).click();
    }

    public void clickTryItOut() {
        driver.findElement(TRY_IT_OUT_BUTTON).click();
    }

    public boolean elementExecuteButtonIsDisplayed() {
        return elementToBeClickableAndDisplayed(driver, EXECUTE_BUTTON);
    }
}
