package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExceptionsTest extends BaseTest {

    @DisplayName("testcase_159")
    @Description("Проверка элемента во вкладке Документы/Руководство/Правила/Исключения")
    @Test
    public void elementOnPageIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Исключения");
        menuPage.clickExceptions();

        assertTrue(exceptionsPage.elementTextIsDisplayed(),
                getTextMessage("rules", "Документы/Руководство/Правила/Исключения"));
    }
}
