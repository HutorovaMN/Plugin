package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JSONataPage {

    private WebDriver driver;

    public JSONataPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By REQUEST_ELEMENT = By.xpath("//pre[starts-with(@class ,'language')]");

    public Boolean elementIsDisplayed(int i) {
        return driver.findElements(REQUEST_ELEMENT).get(i).isDisplayed();
    }
}
