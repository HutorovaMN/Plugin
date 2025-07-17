package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementIsDisplayed;

public class DevToolPage {

    private WebDriver driver;

    public DevToolPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By CRUTCH_ELEMENT = By.xpath("//*[@class ='crutch']");

    public boolean elementCrutchIsDisplayed() {
        return elementIsDisplayed(driver, CRUTCH_ELEMENT);
    }
}
