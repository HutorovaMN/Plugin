package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementIsDisplayed;

public class ExceptionsPage {

    private WebDriver driver;

    public ExceptionsPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By CODE_TEXT = By.xpath("//pre[@class = 'language-yaml']");

    public boolean elementTextIsDisplayed() {
        return elementIsDisplayed(driver, CODE_TEXT);
    }
}
