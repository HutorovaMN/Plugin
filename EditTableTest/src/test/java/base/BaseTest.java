package test.java.base;

import main.java.helpers.SingletonBrowserClass;
import main.java.page.MainPageTable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.openqa.selenium.WebDriver;
import page.EditTablePage;
import page.ExcelPage;

import java.time.Duration;

@Tag("EditTable")
public class BaseTest {

    protected WebDriver driver = SingletonBrowserClass.getInstance();
    protected MainPageTable mainPageTable = new MainPageTable(driver);
    protected EditTablePage editTablePage = new EditTablePage(driver);
    protected ExcelPage excelPage = new ExcelPage(driver);

    @BeforeEach
    public void start() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get(getURL() + getPort());
        driver.get("http://localhost:3030/main");
    }
}
