package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementIsDisplayed;

public class InteractionPage {

    private WebDriver driver;

    public InteractionPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By DEPLOYMENT_LINK = By.xpath("//*[text()='Разворачивание SEAF.ArchTool']");
    private final By CHECK_DEVIATIONS_LINK = By.xpath("//*[text()='Статья на Хабре']");

    public boolean elementDeploymentOnPageIsPresent() {
        return elementIsDisplayed(driver, DEPLOYMENT_LINK);
    }

    public boolean elementDeviationOnPageIsPresent() {
        return elementIsDisplayed(driver, CHECK_DEVIATIONS_LINK);
    }
}
