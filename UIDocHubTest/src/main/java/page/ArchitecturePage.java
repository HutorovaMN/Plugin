package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static helpers.Actions.elementIsDisplayed;

public class ArchitecturePage {

    private WebDriver driver;

    public ArchitecturePage(WebDriver driver) {
        this.driver = driver;
    }

    private final By LOCAL_STORAGE_LINK = By.xpath("//*[text()='LocalStorage']");
    private final By LOCAL_STORAGE_ELEM = By.cssSelector("#elem_localstorage");

    public void clickLocalStorage() {
        new WebDriverWait(driver, Duration.ofSeconds(13))
                .until(ExpectedConditions.visibilityOfElementLocated(LOCAL_STORAGE_LINK));
        driver.findElement(LOCAL_STORAGE_LINK).click();
    }

    public boolean elementOnPageIsPresent() {
        return elementIsDisplayed(driver, LOCAL_STORAGE_LINK);
    }
}
