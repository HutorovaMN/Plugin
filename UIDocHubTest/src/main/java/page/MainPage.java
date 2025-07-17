package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementIsDisplayed;


public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By DOCHUB_ARCH_VER_SCHEMA = By.xpath("//*[@alt ='Управление версиями']");
    private final By DOCHUB_ARCH_DISTRIB_SCHEMA = By.xpath("//*[@alt ='Управление децентрализованной архитектурой']");
    private final By STRUCTURE_OF_THE_HOLDING_SCHEMA = By.xpath("//*[@alt ='Структура холдинга']");
    private final By DEVELOPMENT_OF_ECOSYSTEM_ARCHITECTURE_SCHEMA = By.xpath("//*[@alt ='Управление архитектурой холдинга']");
    private final By ARCHITECTURAL_FACADE_MANAGEMENT_SCHEMA = By.xpath("//*[@alt ='Архитектурные фасады']");
    private final By MIND_MAP_SCHEMA = By.xpath("//*[text()='AsyncAPI']");
    private final By MENU_BUTTON = By.cssSelector(".v-app-bar__nav-icon");

    public void clickMainPageButton() {
        driver.findElement(MENU_BUTTON).click();
    }

    public Boolean elementDocHubArchVerIsDisplayed() {
        return elementIsDisplayed(driver, DOCHUB_ARCH_VER_SCHEMA);
    }

    public Boolean elementDocHubArchDistribIsDisplayed() {
        return elementIsDisplayed(driver, DOCHUB_ARCH_DISTRIB_SCHEMA);
    }

    public Boolean elementStructureOfTheHoldingIsDisplayed() {
        return elementIsDisplayed(driver, STRUCTURE_OF_THE_HOLDING_SCHEMA);
    }

    public Boolean elementDevelopmentOfEcosystemArchitectureIsDisplayed() {
        return elementIsDisplayed(driver, DEVELOPMENT_OF_ECOSYSTEM_ARCHITECTURE_SCHEMA);
    }

    public Boolean elementArchitecturalFacadeManagementIsDisplayed() {
        return elementIsDisplayed(driver, ARCHITECTURAL_FACADE_MANAGEMENT_SCHEMA);
    }

    public Boolean elementMindMupIsDisplayed() {
        return elementIsDisplayed(driver, MIND_MAP_SCHEMA);
    }
}
