package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LearningDocsTest extends BaseTest {

    @DisplayName("testcase_192")
    @Description("Проверка отображения элементов на странице Взаимодействие/DocHub/Пользовательский путь/Изучение документации")
    @Test
    public void elementsOnJSONataIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Изучение документации");
        menuPage.clickLearningDocs();

        assertTrue(learningDocsPage.elementOnPageDisplayed(),
                getTextMessage("Схема PlantUml", "Архитектура/Контексты/DocHub/Пользовательский путь/Изучение документации"));
    }
}
