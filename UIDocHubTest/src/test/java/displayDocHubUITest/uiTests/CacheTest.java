package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CacheTest extends BaseTest {

    @DisplayName("testcase_172")
    @Description("Проверка элемента во вкладке Архитектура/Аспекты/DocHub/Кэш данных")
    @Test
    public void elementOnPageIsDisplayed() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Кэш данных");
        menuPage.clickCache();

        assertTrue(cachePage.elementOnPageDisplayed(),
                getTextMessage("PlantUml", "Архитектура/Аспекты/DocHub/Кэш данных"));
    }
}
