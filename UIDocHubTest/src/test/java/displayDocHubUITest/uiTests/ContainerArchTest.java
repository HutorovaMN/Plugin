package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainerArchTest extends BaseTest {

    @DisplayName("testcase_186")
    @Description("Проверка отображения элементов на странице Архитектура/Контексты/DocHub/Контейнерная архитектура")
    @Test
    public void elementsOnContainerArchIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Контейнерная архитектура");
        menuPage.clickContainerArch();

        assertTrue(containerArchPage.plantUmlOnPageDisplayed(),
                getTextMessage("Схема PlantUml", "Архитектура/Контексты/DocHub/Контейнерная архитектура"));
    }
}
