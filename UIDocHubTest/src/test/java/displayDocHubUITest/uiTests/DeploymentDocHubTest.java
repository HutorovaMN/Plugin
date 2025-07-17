package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DeploymentDocHubTest extends BaseTest {

    @DisplayName("testcase_190")
    @Description("Проверка отображения элементов на странице Взаимодействие/DocHub/Клиентский путь/Разворачивание DocHub")
    @Test
    public void elementsOnDeploymentDocHubIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Разворачивание");
        menuPage.clickDeploymentDocHub();

        assertTrue(deploymentDocHubPage.elementOnPageDisplayed(),
                getTextMessage("Схема PlantUml", "Взаимодействие/DocHub/Клиентский путь/Разворачивание DocHub"));
    }
}
