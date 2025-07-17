package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementIsDisplayed;

public class AdaptiveMetaModelPage {

    private WebDriver driver;

    public AdaptiveMetaModelPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By CONCEPT_IMAGE = By.xpath("//*[@id = 'концепция']//following-sibling::*");

    public Boolean elementConceptIsDisplayed() {
        return elementIsDisplayed(driver, CONCEPT_IMAGE);
    }
}
