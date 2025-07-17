package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ComponentArchTest extends BaseTest {

    @DisplayName("testcase_185")
    @Description("Проверка отображения элементов на странице Архитектура/Контексты/DocHub/Компонентная архитектура")
    @Test
    public void elementsOnComponentArchIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Компонентная архитектура");
        menuPage.clickComponentArch();

        assertTrue(componentArchPage.plantUmlOnPageDisplayed(),
                getTextMessage("Схема PlantUml", "Архитектура/Контексты/DocHub/Компонентная архитектура"));
    }
}
