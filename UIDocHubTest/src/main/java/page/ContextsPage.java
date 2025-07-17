package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContextsPage {

    private WebDriver driver;

    public ContextsPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By PLANTUML_SCHEMA = By.xpath("//div[@class='plantuml-place']");
    private final By COMPONENTS_SCHEMA = By.xpath("//pre[@class='language-yaml']");

    public Boolean elementPlanUMLIsDisplayed(int i) {
        return driver.findElements(PLANTUML_SCHEMA).get(i).isDisplayed();
    }

    public boolean elementSchemaIsDisplayed(int i) {
        return driver.findElements(COMPONENTS_SCHEMA).get(i).isDisplayed();
    }
}
