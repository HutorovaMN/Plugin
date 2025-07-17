package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static helpers.Actions.elementIsDisplayed;
import static helpers.Actions.elementIsNotDisplayed;
import static helpers.Actions.elementToBeClickableAndDisplayed;

public class SimpleExamplePage {

    private WebDriver driver;

    public SimpleExamplePage(WebDriver driver) {
        this.driver = driver;
    }

    private final By LOGIN_LINK_ELEMENT = By.xpath("//*[text() = ' Логин и пароль ']");
    private final By LINK_ELEMENT = By.xpath("//*[contains(@id,'user->system')]");
    private final By COLLAPSE_THE_TIES_INTO_BUNDLES_BUTTON = By.xpath("//*[@title = 'Свернуть связи в жгуты']");
    private final By SHOW_ALL_LINKS_BUTTON = By.xpath("//button[@title = 'Показать все связи']");
    private final By SHOW_ONLY_THE_STRUCTURE_BUTTON = By.xpath("//*[@title = 'Показать только структуру']");
    private final By SHOW_CONNECTIONS_BUTTON = By.xpath("//*[@title = 'Показать связи']");

    public boolean elementLoginLinkIsNotDisplayed() {
        return elementIsNotDisplayed(driver, LOGIN_LINK_ELEMENT);
    }

    public void clickBundles() {
        elementToBeClickableAndDisplayed(driver, COLLAPSE_THE_TIES_INTO_BUNDLES_BUTTON);
        driver.findElement(COLLAPSE_THE_TIES_INTO_BUNDLES_BUTTON).click();
    }

    public boolean elementLoginLinkIsDisplayed() {
        return elementIsDisplayed(driver, LOGIN_LINK_ELEMENT);
    }

    public void clickShowLink() {
        elementToBeClickableAndDisplayed(driver, SHOW_ALL_LINKS_BUTTON);
        driver.findElement(SHOW_ALL_LINKS_BUTTON).click();
    }

    public void clickShowOnlyStructure() {
        elementToBeClickableAndDisplayed(driver, SHOW_ONLY_THE_STRUCTURE_BUTTON);
        driver.findElement(SHOW_ONLY_THE_STRUCTURE_BUTTON).click();
    }

    public void clickShowConnection() {
        elementToBeClickableAndDisplayed(driver, SHOW_CONNECTIONS_BUTTON);
        driver.findElement(SHOW_CONNECTIONS_BUTTON).click();
    }

    public boolean elementLinkIsNotDisplayed() {
        return elementIsNotDisplayed(driver, LINK_ELEMENT);
    }

    public boolean elementLinkIsDisplayed() {
        return elementIsDisplayed(driver, LINK_ELEMENT);
    }
}
