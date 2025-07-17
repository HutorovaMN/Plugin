package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.inputText;

public class JSONataConsolePage {

    private WebDriver driver;

    public JSONataConsolePage(WebDriver driver) {
        this.driver = driver;
    }

    private final String CONSOLE_INPUT = ".mtk6";
    private final By RESULT_TEXT = By.xpath("//*[@class = 'token number']");

    public void inputFunctions() {
        inputText(driver, driver.findElement(By.cssSelector(CONSOLE_INPUT)), "$demo_summ([1,2,3,4,5,15])");
    }

    public String getTextResult() {
        return driver.findElement(RESULT_TEXT).getText();
    }
}
