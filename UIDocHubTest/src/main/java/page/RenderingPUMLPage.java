package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementIsDisplayed;

public class RenderingPUMLPage {

    private WebDriver driver;

    public RenderingPUMLPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By PLANTUML_SCHEMA = By.xpath("//div[@class='plantuml-schema']");
    private final By PLANTUML_COMPONENT = By.xpath("(//*[text()='SEAF.ArchTool'])[2]");

    public Boolean elementOnPageDisplayed() {
        return elementIsDisplayed(driver, PLANTUML_COMPONENT);
    }

    public Boolean plantUmlOnPageDisplayed() {
        return elementIsDisplayed(driver, PLANTUML_SCHEMA);
    }
}
