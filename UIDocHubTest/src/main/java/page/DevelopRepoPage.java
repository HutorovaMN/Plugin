package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementIsDisplayed;

public class DevelopRepoPage {

    private WebDriver driver;

    public DevelopRepoPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By GIT_CLIENT_COMPONENT = By.xpath("//*[text()='git client']");

    public Boolean elementOnPageDisplayed() {
        return elementIsDisplayed(driver, GIT_CLIENT_COMPONENT);
    }
}
