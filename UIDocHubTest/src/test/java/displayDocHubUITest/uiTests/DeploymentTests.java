package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DeploymentTests extends BaseTest {

    @DisplayName("testcase_122")
    @Description("Проверка отображения элементов  на  странице  Документы/DocHub/Развертывание   ")
    @Test
    public void elementsOnDeploymentDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Развертывание");
        menuPage.clickDeploymentButton();

        assertAll(
                () -> assertTrue(deploymentPage.elementComponentDiagramOfTheClusterOperationIsDisplayed()
                        , getTextMessage(" Компонентная схема работы кластера", "Развертывание")),
                () -> assertTrue(deploymentPage.elementAlgorithmOfTheClusterOperationIsDisplayed()
                        , getTextMessage(" Алгоритм работы кластера", "Развертывание"))
        );
    }
}
