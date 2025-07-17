package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParsingManifestTest extends BaseTest {

    @DisplayName("testcase_174")
    @Description("Проверка отображения элементов на странице Архитектура/Аспекты/DocHub/Манифест/Парсинг Манифестов")
    @Test
    public void elementsOnJSONataIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Парсинг Манифестов");
        menuPage.clickParsingManifest();

        assertAll(
                () -> assertTrue(parsingManifestPage.elementOnPageDisplayed(),
                        getTextMessage("Компонент DocHub", "Архитектура/Аспекты/DocHub/Манифест/Парсинг Манифестов")),
                () -> assertTrue(parsingManifestPage.plantUmlOnPageDisplayed(),
                        getTextMessage("PlantUml схема", "Архитектура/Аспекты/DocHub/Манифест/Парсинг Манифестов"))
        );
    }
}
