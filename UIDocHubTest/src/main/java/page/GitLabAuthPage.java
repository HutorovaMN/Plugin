package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementIsDisplayed;

public class GitLabAuthPage {

    private WebDriver driver;

    public GitLabAuthPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By GIT_AUTH_COMPONENT = By.xpath("//*[text()='Авторизация GitLab']");

    public Boolean elementOnPageDisplayed() {
        return elementIsDisplayed(driver, GIT_AUTH_COMPONENT);
    }
}
