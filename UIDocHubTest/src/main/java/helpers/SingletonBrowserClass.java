package helpers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SingletonBrowserClass {

    private static WebDriver driver;
    private static ChromeOptions chromeOptions = new ChromeOptions();

    public static WebDriver getInstance() {
        chromeOptions.addArguments("headless");
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(chromeOptions);
        }
        return driver;
    }
}
