package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementIsDisplayed;

public class DeploymentPage {

    private WebDriver driver;

    public DeploymentPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By COMPONENT_DIAGRAM_OF_THE_CLUSTER_OPERATION_SCHEMA = By.xpath("//*[@id='компонентная-схема-работы-кластера']/following-sibling::*");
    private final By ALGORITHM_OF_THE_CLUSTER_OPERATION_SCHEMA = By.xpath("//*[@id='алгоритм-работы-кластера']/following-sibling::*");

    public Boolean elementComponentDiagramOfTheClusterOperationIsDisplayed() {
        return elementIsDisplayed(driver, COMPONENT_DIAGRAM_OF_THE_CLUSTER_OPERATION_SCHEMA);
    }

    public Boolean elementAlgorithmOfTheClusterOperationIsDisplayed() {
        return elementIsDisplayed(driver, ALGORITHM_OF_THE_CLUSTER_OPERATION_SCHEMA);
    }
}
