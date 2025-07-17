package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementIsDisplayed;

public class TechnoRadarPage {

    private WebDriver driver;

    public TechnoRadarPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By PLANTUML_SCHEMA = By.xpath("//div[@class='plantuml-schema']");
    private final By WEB_COMPONENT = By.xpath("(//*[text()='SEAF.ArchTool'])[2]");

    public Boolean elementOnPageDisplayed() {
        return elementIsDisplayed(driver, WEB_COMPONENT);
    }

    public Boolean plantUmlOnPageDisplayed() {
        return elementIsDisplayed(driver, PLANTUML_SCHEMA);
    }
}
