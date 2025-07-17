package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementIsDisplayed;

public class NetworkPage {

    private WebDriver driver;

    public NetworkPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By NETWORK_ELEMENT = By.xpath(" //div[@class = 'vis-network']");

    public boolean elementNetworkIsDisplayed() {
        return elementIsDisplayed(driver, NETWORK_ELEMENT);
    }
}
