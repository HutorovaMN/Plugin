package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ImportsPage {

    private WebDriver driver;

    public ImportsPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By CODE_TEXT = By.xpath("//pre[starts-with(@class ,'language')]");

    public boolean elementTextIsDisplayed(int i) {
        return driver.findElements(CODE_TEXT).get(i).isDisplayed();
    }
}
