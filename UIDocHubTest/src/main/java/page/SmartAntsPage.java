package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementToBeClickableAndDisplayed;

public class SmartAntsPage {

    private WebDriver driver;

    public SmartAntsPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By SMART_ANTS_ELEMENT = By.xpath("//*[@contentstyletype = 'text/css']");
    private final By COLOR_SMART_ANTS_ELEMENT = By.xpath("//*[@style = 'opacity: 1; fill: rgb(255, 0, 0);']");

    public boolean elementSmartAntsIsDisplayed(int i) {
        return driver.findElements(SMART_ANTS_ELEMENT).get(i).isDisplayed();
    }

    public boolean elementColorIsDisplayed() {
        return elementToBeClickableAndDisplayed(driver, COLOR_SMART_ANTS_ELEMENT);
    }
}
