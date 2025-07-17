package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TechnoRadarTest extends BaseTest {

    @DisplayName("testcase_181")
    @Description("Проверка отображения элементов на странице Архитектура/Аспекты/DocHub/Технологический радар")
    @Test
    public void elementsOnTechnoRadarIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Технологический радар");
        menuPage.clickTechnoRadar();

        assertAll(
                () -> assertTrue(technoRadarPage.elementOnPageDisplayed(),
                        getTextMessage("Компонент PlantUML render server", "Архитектура/Аспекты/DocHub/Технологический радар")),
                () -> assertTrue(technoRadarPage.plantUmlOnPageDisplayed(),
                        getTextMessage("WEB схема", "Архитектура/Аспекты/DocHub/Технологический радар"))
        );
    }
}
