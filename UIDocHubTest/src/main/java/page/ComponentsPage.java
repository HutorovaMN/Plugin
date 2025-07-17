package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementIsDisplayed;
import static helpers.Actions.elementToBeClickableAndDisplayed;

public class ComponentsPage {

    private WebDriver driver;

    public ComponentsPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By PLANTUML_SCHEMA = By.xpath("//div[@class='plantuml-schema']");
    private final By COMPONENTS_SCHEMA = By.xpath("//pre[@class='language-yaml']");
    private final By USER_LINK = By.xpath("//*[contains(@href,'archtool.user')]");

    public Boolean elementSchemaIsDisplayed() {
        return elementIsDisplayed(driver, PLANTUML_SCHEMA);
    }

    public boolean elementInTableIsDisplayed() {
        return elementIsDisplayed(driver, COMPONENTS_SCHEMA);
    }

    public boolean elementSchemaComponentsIsDisplayed() {
        return elementToBeClickableAndDisplayed(driver, USER_LINK);
    }
}
