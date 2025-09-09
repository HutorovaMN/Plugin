package main.java.helpers;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeoutException;

public class Actions {

    public static boolean elementToBeClickableAndDisplayed(WebDriver driver, By element) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(13)).until(ExpectedConditions.elementToBeClickable(element));
            return driver.findElement(element).isDisplayed();
        } catch (StaleElementReferenceException exception) {
            return driver.findElement(element).isDisplayed();
        }
    }

    public static boolean elementIsDisplayed(WebDriver driver, By element) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(13)).until(ExpectedConditions.visibilityOfElementLocated(element));
            return driver.findElement(element).isDisplayed();
        } catch (StaleElementReferenceException exception) {
            return driver.findElement(element).isDisplayed();
        }
    }

    public static boolean elementsListIsDisplayed(WebDriver driver, By element, int i) {
        List<WebElement> elements = driver.findElements(element);
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            wait.until(ExpectedConditions.visibilityOf(elements.get(i)));
            return true;
        } catch (StaleElementReferenceException e) {
            return false;
        }
    }

    public static String getTextMessage(String element, String page) {
        return String.format("Элемент %s на странице %s не отображается", element, page);
    }

    public static void rightClick(WebDriver driver, WebElement element) {
        new org.openqa.selenium.interactions.Actions(driver)
                .contextClick(element)
                .perform();
    }

    public static boolean elementIsNotDisplayed(WebDriver driver, By element) {
        try {
            return new WebDriverWait(driver, Duration.ofSeconds(13)).until(ExpectedConditions.invisibilityOfElementLocated(element));
        } catch (StaleElementReferenceException exception) {
            return new WebDriverWait(driver, Duration.ofSeconds(13)).until(ExpectedConditions.invisibilityOfElementLocated(element));
        }
    }

    public static void inputText(WebDriver driver, WebElement element, String jsonAta) {
        new org.openqa.selenium.interactions.Actions(driver)
                .doubleClick(element)
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.BACK_SPACE)
                .sendKeys(jsonAta)
                .perform();
    }
}
