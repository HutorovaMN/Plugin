package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SourceContextTest extends BaseTest {

    @DisplayName("testcase_187")
    @Description("Проверка отображения элементов на странице Архитектура/Контексты/DocHub/Контекст по источнику")
    @Test
    public void elementsOnSourceContextIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Контекст по источнику");
        menuPage.clickSourcesContext();

        assertTrue(sourceContextPage.plantUmlOnPageDisplayed(),
                getTextMessage("Схема PlantUml", "Архитектура/Контексты/DocHub/Контекст по источнику"));
    }
}
