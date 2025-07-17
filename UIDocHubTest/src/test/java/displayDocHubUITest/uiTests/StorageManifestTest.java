package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StorageManifestTest extends BaseTest {

    @DisplayName("testcase_175")
    @Description("Проверка отображения элементов на странице Архитектура/Аспекты/DocHub/Манифест/Хранилище Манифестов")
    @Test
    public void elementsOnStorageManifestIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Хранилище Манифестов");
        menuPage.clickStorageManifest();

        assertAll(
                () -> assertTrue(storageManifestPage.elementOnPageDisplayed(),
                        getTextMessage("Компонент DocHub", "Архитектура/Аспекты/DocHub/Манифест/Хранилище Манифестов")),
                () -> assertTrue(storageManifestPage.plantUmlOnPageDisplayed(),
                        getTextMessage("PlantUml схема", "Архитектура/Аспекты/DocHub/Манифест/Хранилище Манифестов"))
        );
    }
}
