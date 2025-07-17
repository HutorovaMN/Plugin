package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GitLabAuthTest extends BaseTest {

    @DisplayName("testcase_170")
    @Description("Проверка отображения элементов на странице Архитектура/Аспекты/DocHub/GitLab/Авторизация GitLab")
    @Test
    public void elementOnPageIsDisplayed() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Авторизация GitLab");
        menuPage.clickGitLabAuth();

        assertTrue(gitLabAuthPage.elementOnPageDisplayed(),
                getTextMessage("Компонент Git client", "Архитектура/Аспекты/DocHub/GitLab/Авторизация GitLab"));
    }
}
