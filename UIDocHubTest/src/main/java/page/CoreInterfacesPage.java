package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementIsDisplayed;

public class CoreInterfacesPage {

    private WebDriver driver;

    public CoreInterfacesPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By CODE_TEXT = By.xpath("//pre[starts-with(@class ,'language')]");
    private final By MARKDOWN_TEXT = By.xpath("//*[@id  = 'params-object']//following-sibling::pre[1]");

    public boolean elementTextIsDisplayed(int i) {
        return driver.findElements(CODE_TEXT).get(i).isDisplayed();
    }

    public boolean elementMarkdownTextIsDisplayed() {
        return elementIsDisplayed(driver, MARKDOWN_TEXT);
    }
}
