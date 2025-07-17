package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PluginsPage {

    private WebDriver driver;

    public PluginsPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By CODE_TEXT = By.xpath("//pre[starts-with(@class ,'language')]");
    private final By MARKDOWN_TEXT = By.xpath("//*[@id = 'использование']//following-sibling::pre");

    public boolean elementTextIsDisplayed(int i) {
        return driver.findElements(CODE_TEXT).get(i).isDisplayed();
    }

    public boolean elementMarkdownIsDisplayed(int i) {
        return driver.findElements(MARKDOWN_TEXT).get(i).isDisplayed();
    }
}
