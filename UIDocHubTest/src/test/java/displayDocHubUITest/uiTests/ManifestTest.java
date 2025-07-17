package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ManifestTest extends BaseTest {

    @DisplayName("testcase_173")
    @Description("Проверка отображения элементов на странице Архитектура/Аспекты/DocHub/Манифест")
    @Disabled // Не запускается в дженкинс
    @Test
    public void elementsOnManifestIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.clickManifest();

        assertTrue(manifestPage.elementOnPageDisplayed(0),
                getTextMessage("Схема PlantUml", "Архитектура/Аспекты/DocHub/Манифест/Иерархия аспекта"));
        assertTrue(manifestPage.elementOnPageDisplayed(1),
                getTextMessage("Схема PlantUml", "Архитектура/Аспекты/DocHub/Манифест/Общая архитектура"));
    }
}
