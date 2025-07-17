package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlantUMLTest extends BaseTest {

    @DisplayName("testcase_136")
    @Description("Проверка отображения элементов на странице  Документы/DocHub/Руководство/Документы/PlantUML ")
    @Test
    public void elementsOnPlantUMLkIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("PlantUML");
        menuPage.clickPlantUML();

        assertTrue(plantUMLPage.elementPlantUMLIsDisplayed()
                , getTextMessage(" PlantUML", "PlantUML"));
    }
}
