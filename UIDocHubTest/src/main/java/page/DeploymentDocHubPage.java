package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementIsDisplayed;

public class DeploymentDocHubPage {

    private WebDriver driver;

    public DeploymentDocHubPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By PLANTUML_SCHEMA = By.cssSelector(".plantuml-schema");

    public Boolean elementOnPageDisplayed() {
        return elementIsDisplayed(driver, PLANTUML_SCHEMA);
    }
}
