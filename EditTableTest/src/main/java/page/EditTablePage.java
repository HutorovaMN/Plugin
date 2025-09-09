package page;

import org.junit.jupiter.params.provider.Arguments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.stream.Stream;

public class EditTablePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public EditTablePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private final By TABLE_CELL_1 = By.xpath("(//textarea[@class='textarea'])[1]");
    private final By TABLE_CONTAINER_1 = By.xpath("(//div[@class='content-container'])[2]");
    private final By TABLE_CONTAINER_2 = By.xpath("(//div[@class='content-container'])[4]");
    private final By TABLE_CONTAINER_3 = By.xpath("(//div[@class='content-container'])[6]");

    public String enterTextCell_2_1(String text) {
        driver.findElement(TABLE_CELL_1).click();
        driver.findElement(TABLE_CELL_1).clear();
        driver.findElement(TABLE_CELL_1).sendKeys(text);
        wait.until(webDriver -> {
            WebElement el = webDriver.findElement(TABLE_CONTAINER_1);
            return !el.getText().equals("9") ? el : null;
        });

        return driver.findElement(TABLE_CONTAINER_1).getText();
    }

    public String getTextContainer_2_1() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(TABLE_CONTAINER_1));
        return element.getText();
    }

    public String getTextContainer_2_2() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(TABLE_CONTAINER_2));
        return element.getText();
    }

    public String getTextContainer_2_3() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(TABLE_CONTAINER_3));
        return element.getText();
    }

    public static Stream<Arguments> calculationTestData() {
        return Stream.of(
                Arguments.of("5", "18"),
                Arguments.of("10", "33"),
                Arguments.of("0", "3"),
                Arguments.of("-1", "0"),
                Arguments.of("10000", "30003"),
                Arguments.of("-10000", "-29997"),
                Arguments.of("abc", "Ошибка при вычислении")
        );
    }
}
