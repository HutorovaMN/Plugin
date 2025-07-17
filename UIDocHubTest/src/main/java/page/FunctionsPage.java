package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementIsDisplayed;

public class FunctionsPage {

    private WebDriver driver;

    public FunctionsPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By CODE_TEXT = By.xpath("//pre[starts-with(@class ,'language')]");
    private final By THIRTY_TEXT = By.xpath("//code[contains(text(),'30')]");

    public boolean elementTextIsDisplayed(int i) {
        return driver.findElements(CODE_TEXT).get(i).isDisplayed();
    }

    public boolean elementThirtyIsDisplayed() {
        return elementIsDisplayed(driver, THIRTY_TEXT);
    }
}
