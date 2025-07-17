package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GitLabTest extends BaseTest {

    @DisplayName("testcase_169")
    @Description("Проверка отображения элементов на странице Архитектура/Аспекты/DocHub/GitLab")
    @Test
    public void elementsOnGitLabIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("GitLab");
        menuPage.clickGitLab();

        assertTrue(gitLabPage.elementOnPageDisplayed(),
                getTextMessage("Схема PlantUml", "Архитектура/Аспекты/DocHub/GitLab"));
    }
}
