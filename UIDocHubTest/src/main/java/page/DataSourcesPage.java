package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementIsDisplayed;
import static helpers.Actions.elementToBeClickableAndDisplayed;

public class DataSourcesPage {

    private WebDriver driver;

    public DataSourcesPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By CRITICALITY_CLASS_TEXT = By.xpath("//*[text() = 'Уровень K1']");
    private final By QUERIES_TO_ARCHITECTURE_DATA_LINK = By.xpath("//*[text() = 'archtool.components']");
    private final By DEPENDENCE_LINK = By.xpath("//*[text()='components.$spread().']");
    private final By MULTIPLE_DEPENDENCIES_LINK = By.xpath("//*[text() = '$CRITICALLY_TO := $CRITICALLY_TO ? $CRITICALLY_TO']");

    public boolean elementCriticalityClassIsDisplayed() {
        return elementIsDisplayed(driver, CRITICALITY_CLASS_TEXT);
    }

    public boolean elementQueriesToArchitectureDataIsDisplayed() {
        return elementToBeClickableAndDisplayed(driver, QUERIES_TO_ARCHITECTURE_DATA_LINK);
    }

    public boolean elementDependenceIsDisplayed() {
        return elementToBeClickableAndDisplayed(driver,DEPENDENCE_LINK);
    }

    public boolean elementMultipleDependenciesIsDisplayed() {
        return elementToBeClickableAndDisplayed(driver, MULTIPLE_DEPENDENCIES_LINK);
    }
}
