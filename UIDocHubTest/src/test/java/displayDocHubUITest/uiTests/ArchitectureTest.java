package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArchitectureTest extends BaseTest {

    @DisplayName("testcase_164")
    @Description("Проверка элемента во вкладке Архитектура")
    @Test
    public void elementOnPageIsDisplayed() {
        mainPage.clickMainPageButton();
        menuPage.clickArchitecture();
        architecturePage.clickLocalStorage();

        assertTrue(architecturePage.elementOnPageIsPresent(),
                getTextMessage("LocalStorage", "Архитектура"));
    }
}
