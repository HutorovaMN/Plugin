package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NavigationTest extends BaseTest {

    @DisplayName(" testcase_176")
    @Description("Проверка отображения элементов на странице Архитектура/Аспекты/DocHub/Навигация по архитектуре")
    @Test
    public void elementsOnJSONataIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Навигация по архитектуре");
        menuPage.clickNavigation();

        assertAll(
                () -> assertTrue(navigationPage.elementOnPageDisplayed(),
                        getTextMessage("Компонент DocHub", "Архитектура/Аспекты/DocHub/Навигация по архитектуре")),
                () -> assertTrue(navigationPage.plantUmlOnPageDisplayed(),
                        getTextMessage("PlantUml схема", "Архитектура/Аспекты/DocHub/Навигация по архитектуре"))
        );
    }
}
