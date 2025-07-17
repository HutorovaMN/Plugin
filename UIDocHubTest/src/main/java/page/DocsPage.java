package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementIsDisplayed;
import static helpers.Actions.elementToBeClickableAndDisplayed;

public class DocsPage {

    private WebDriver driver;

    public DocsPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By DOCHUB_ELEMENT = By.xpath("//*[text() = 'archtool.user']");
    private static final By DOCHUB_USER_ELEMENT = By.xpath("//*[text() = 'Карточка объекта']");

    public Boolean elementDocHubIsDisplayed() {
        return elementIsDisplayed(driver, DOCHUB_ELEMENT);
    }

    public Boolean elementDocHubUserToBeClickableAndDisplayed() {
        return elementToBeClickableAndDisplayed(driver, DOCHUB_USER_ELEMENT);
    }
}
