package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementIsDisplayed;

public class ArchContextPage {

    private WebDriver driver;

    public ArchContextPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By CONTEXT_LINK = By.xpath("//*[contains(@href, 'sequence')]");
    private final By EXPERT_LINK = By.xpath("//*[text()='Документ']");

    public boolean elementContextOnPageIsPresent() {
        return elementIsDisplayed(driver, CONTEXT_LINK);
    }

    public boolean elementExpertOnPageIsPresent() {
        return elementIsDisplayed(driver, EXPERT_LINK);
    }
}
