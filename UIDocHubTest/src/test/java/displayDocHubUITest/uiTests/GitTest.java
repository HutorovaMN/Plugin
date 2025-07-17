package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GitTest extends BaseTest {

    @DisplayName("testcase_167")
    @Description("Проверка отображения элементов на странице Архитектура/Аспекты/DocHub/Git")
    @Test
    public void elementsOnGitIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Git");
        menuPage.clickGit();

        assertTrue(gitPage.elementOnPageDisplayed(),
                getTextMessage("Схема PlantUml", "Архитектура/Аспекты/DocHub/Git"));
    }
}
