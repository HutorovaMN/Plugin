package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RenderingPUMLTest extends BaseTest {

    @DisplayName("testcase_177")
    @Description("Проверка отображения элементов на странице Архитектура/Аспекты/DocHub/Рендеринг PlantUML")
    @Test
    public void elementsOnRenderingPUMLIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Рендеринг PlantUML");
        menuPage.clickRenderingPUML();

        assertAll(
                () -> assertTrue(renderingPUMLPage.elementOnPageDisplayed(),
                        getTextMessage("Компонент PlantUML render server", "Архитектура/Аспекты/DocHub/Рендеринг PlantUML")),
                () -> assertTrue(renderingPUMLPage.plantUmlOnPageDisplayed(),
                        getTextMessage("PlantUml схема", "Архитектура/Аспекты/DocHub/Рендеринг PlantUML"))
        );
    }
}
