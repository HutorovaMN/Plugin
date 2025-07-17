package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArchContextDocHubTest extends BaseTest {

    @DisplayName("testcase_183")
    @Description("Проверка отображения элементов на Архитектура/Контексты/DocHub")
    @Test
    public void elementsOnArchContextDocHubDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText(" SEAF.ArchTool ");
        menuPage.clickArchDocHubContext();

        assertTrue(archContextDocHubPage.plantUmlOnPageDisplayed()
                , getTextMessage("Схема PlantUML", "Архитектура/Контексты/DocHub"));
    }
}
