package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementToBeClickableAndDisplayed;

public class ArchAspectsPage {

    private WebDriver driver;

    public ArchAspectsPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By RENDERING_LINK = By.xpath("//*[text()='Рендеринг документов']");

    public Boolean elementRenderingIsDisplayed() {
        return elementToBeClickableAndDisplayed(driver, RENDERING_LINK);
    }
}
