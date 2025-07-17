package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementIsDisplayed;

public class TechnologiesPage {

    private WebDriver driver;

    public TechnologiesPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By CODE_TEXT = By.xpath("//pre[@class = 'language-yaml']");
    private final By JAVA_SCRIPT_ELEMENT = By.xpath("//h1[text() ='JavaScript']");

    public boolean elementTextIsDisplayed(int i) {
        return driver.findElements(CODE_TEXT).get(i).isDisplayed();
    }

    public boolean elementJavaScriptElementIsDisplayed() {
        return elementIsDisplayed(driver, JAVA_SCRIPT_ELEMENT);
    }
}
