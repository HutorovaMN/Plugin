package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DevelopRepoTest extends BaseTest {

    @DisplayName("testcase_168")
    @Description("Проверка элемента во вкладке Архитектура/Аспекты/DocHub/Git/Развитие репы")
    @Test
    public void elementOnPageIsDisplayed() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Развитие репы");
        menuPage.clickDevelopRepo();

        assertTrue(developRepoPage.elementOnPageDisplayed(),
                getTextMessage("Компонент Git client", "Архитектура/Аспекты/DocHub/Git/Развитие репы"));
    }
}
