package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementIsDisplayed;
import static helpers.Actions.elementToBeClickableAndDisplayed;

public class ExtensionPage {

    private WebDriver driver;

    public ExtensionPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By COMPONENTS_SCHEMA = By.xpath("//pre[@class='language-yaml']");
    private final By USER_LINK = By.xpath("//*[text()=' Неизвестный тип документа [unknown]']");

    public boolean elementInTableIsDisplayed() {
        return elementIsDisplayed(driver, COMPONENTS_SCHEMA);
    }

    public boolean elementSchemaComponentsIsDisplayed() {
        return elementToBeClickableAndDisplayed(driver, USER_LINK);
    }
}
