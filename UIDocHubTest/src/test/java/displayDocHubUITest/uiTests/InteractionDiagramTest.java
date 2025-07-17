package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InteractionDiagramTest extends BaseTest {

    @DisplayName("testcase_184")
    @Description("Проверка отображения элементов на странице Архитектура/Контексты/DocHub/Диаграмма взаимодействия")
    @Disabled // В chrome не отображается диаграмма
    @Test
    public void elementsOnInteractionDiagramIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Диаграмма взаимодействия");
        menuPage.clickInteractionDiagram();

        assertTrue(interactionDiagramPage.elementOnPageDisplayed(),
                getTextMessage("Схема PlantUml", "Архитектура/Контексты/DocHub/Диаграмма взаимодействия"));
    }
}
