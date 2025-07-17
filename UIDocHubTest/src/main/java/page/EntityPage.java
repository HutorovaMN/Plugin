package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementIsDisplayed;
import static helpers.Actions.elementsListIsDisplayed;

public class EntityPage {

    private WebDriver driver;

    public EntityPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By CUSTOM_PATH_SCHEMA_LIST = By.xpath("//div[@class='plantuml-place']");
    private final By DEPLOYMENT_DOCHUB_SCHEMA = By.xpath("//*[text() = 'Потенциальный клиент (лид),']/ancestor-or-self::p ");

    public boolean elementInteractionsSchemaListIsDisplayed(int i) {
        return elementsListIsDisplayed(driver, CUSTOM_PATH_SCHEMA_LIST, i);
    }

    public Boolean elementDeploymentDocHubIsDisplayed() {
        return elementIsDisplayed(driver, DEPLOYMENT_DOCHUB_SCHEMA);
    }
}
