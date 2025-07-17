package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementIsDisplayed;

public class PlantUMLPage {

    private WebDriver driver;

    public PlantUMLPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By PLANT_UML_SCHEMA = By.xpath(" //*[@zoomAndPan= 'magnify']");

    public boolean elementPlantUMLIsDisplayed() {
        return elementIsDisplayed(driver, PLANT_UML_SCHEMA);
    }
}
