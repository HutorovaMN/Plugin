package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementIsDisplayed;

public class DataSetPage {

    private WebDriver driver;

    public DataSetPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By PLANTUML_SCHEMA = By.xpath("//div[@class='plantuml-schema']");
    private final By DOCHUB_COMPONENT = By.xpath("//*[text() ='SEAF.ArchTool']");

    public Boolean elementOnPageDisplayed() {
        return elementIsDisplayed(driver, DOCHUB_COMPONENT);
    }

    public Boolean plantUmlOnPageDisplayed() {
        return elementIsDisplayed(driver, PLANTUML_SCHEMA);
    }
}
