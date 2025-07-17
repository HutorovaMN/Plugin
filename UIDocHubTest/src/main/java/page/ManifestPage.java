package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementsListIsDisplayed;

public class ManifestPage {

    private WebDriver driver;

    public ManifestPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By PLANTUML_SCHEMA = By.xpath("//div[@class='plantuml-schema']");

    public Boolean elementOnPageDisplayed(int i) {
        return elementsListIsDisplayed(driver, PLANTUML_SCHEMA, i);
    }
}
