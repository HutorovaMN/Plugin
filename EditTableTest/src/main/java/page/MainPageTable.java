package main.java.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageTable {

    private WebDriver driver;

    public MainPageTable(WebDriver driver) {
        this.driver = driver;
    }

    private final By MENU_BUTTON = By.cssSelector(".v-app-bar__nav-icon");
    private final By ENTER = By.xpath("//input[@id='input-18']");
    private final By CLICK_EDIT_TABLE_MENU = By.xpath("//*[text()=' 2. Вычисляемые ячейки ']");

    public void clickMainPageButton() {
        driver.findElement(MENU_BUTTON).click();
    }

    public void enterText(String text) {
        driver.findElement(ENTER).click();
        driver.findElement(ENTER).sendKeys(text);
    }

    public void clickEditTableMenu() {
        driver.findElement(CLICK_EDIT_TABLE_MENU).click();
    }
}
