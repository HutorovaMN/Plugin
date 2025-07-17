package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArchAspectsTest extends BaseTest {

    @DisplayName("testcase_191")
    @Description("Проверка элемента во вкладке Архитектура/Аспекты")
    @Test
    public void elementOnPageIsDisplayed() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Аспекты");
        menuPage.transferToAspects();

        assertTrue(archAspectsPage.elementRenderingIsDisplayed(),
                getTextMessage("Рендеринг аспектов", "Архитектура/Аспекты"));
    }
}
