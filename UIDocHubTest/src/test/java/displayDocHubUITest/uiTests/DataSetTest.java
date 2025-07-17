package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DataSetTest extends BaseTest {

    @DisplayName("testcase_171")
    @Description("Проверка элемента во вкладке Архитектура/Аспекты/DocHub/Источник данных")
    @Test
    public void ElementOnPageIsDisplayed() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Источник данных");
        menuPage.clickDocHubDataset();

        assertAll(
                () -> assertTrue(dataSetPage.elementOnPageDisplayed(),
                        getTextMessage("Компонент DocHub", "Архитектура/Аспекты/DocHub/Источник данных")),
                () -> assertTrue(dataSetPage.plantUmlOnPageDisplayed(),
                        getTextMessage("PlantUml схема", "Архитектура/Аспекты/DocHub/Источник данных"))
        );
    }
}
