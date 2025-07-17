package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DocHubArchTest extends BaseTest {

    @DisplayName("testcase_166")
    @Description("Проверка элемента во вкладке Архитектура/Аспекты/SEAF.ArchTool")
    @Test
    public void elementOnPageIsDisplayed() {
        mainPage.clickMainPageButton();
        menuPage.enterText("SEAF.ArchTool");
        menuPage.transferToArchDochub();

        assertTrue(docHubArchPage.elementOnPageDisplayed(),
                getTextMessage("PlantUml схема", "Архитектура/Аспекты/SEAF.ArchTool"));
    }
}
