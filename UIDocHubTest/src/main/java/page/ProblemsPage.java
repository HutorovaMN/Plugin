package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProblemsPage {

    private WebDriver driver;

    public ProblemsPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By ERROR_BUTTON = By.xpath("//*[contains(text(), ' SEAF.ArchTool (1) ')]");
    private final By FILLING_IN_THE_FIELDS_LIST = By.xpath("//*[contains(text(), ' Отклонения ')]");
    private final By ERROR_EXPERTS_BUTTON = By.xpath("//*[contains(text(), ' Исключения ')]");

    public Boolean getProblems() {
        return driver.findElement(ERROR_BUTTON).isDisplayed();
    }

    public Boolean getFILLING_IN_THE_FIELDS_LIST() {
        return driver.findElement(FILLING_IN_THE_FIELDS_LIST).isDisplayed();
    }

    public Boolean getExpertProblems() {
        driver.findElement(FILLING_IN_THE_FIELDS_LIST).click();
        return driver.findElement(ERROR_EXPERTS_BUTTON).isDisplayed();
    }
}
