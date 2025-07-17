package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementIsDisplayed;

public class MermaidPage {

    private WebDriver driver;

    public MermaidPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By ELEMENT_C_4 = By.xpath(" //*[@role= 'graphics-document document']");

    public Boolean elementC4IsDisplayed() {
        return elementIsDisplayed(driver, ELEMENT_C_4);
    }
}
