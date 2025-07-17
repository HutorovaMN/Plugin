package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DevToolTest extends BaseTest {

    @DisplayName("testcase_154")
    @Description("Проверка элемента во вкладке Документы/Руководство/Плагины/Примеры/DevTool")
    @Test
    public void elementOnPageIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("DevTool");
        menuPage.clickDevTool();

        assertTrue(devToolPage.elementCrutchIsDisplayed(),
                getTextMessage("DevTool", "Документы/Руководство/Плагины/Примеры/DevTool"));
    }
}
