package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValidatorsPage {

    private WebDriver driver;

    public ValidatorsPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By ELEMENT_TEXT = By.xpath("//pre[starts-with(@class ,'language')]");

    public boolean elementTextIsDisplayed(int i) {
        return driver.findElements(ELEMENT_TEXT).get(i).isDisplayed();
    }
}
