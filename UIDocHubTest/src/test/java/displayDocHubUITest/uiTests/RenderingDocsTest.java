package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RenderingDocsTest extends BaseTest {

    @DisplayName("testcase_179")
    @Description("Проверка отображения элементов на странице Архитектура/Аспекты/DocHub/Рендеринг документов")
    @Test
    public void elementsOnRenderingDocsIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Рендеринг документов");
        menuPage.clickRenderingDocs();

        assertAll(
                () -> assertTrue(renderingDocsPage.elementOnPageDisplayed(),
                        getTextMessage("Компонент DocHub", "Архитектура/Аспекты/DocHub/Рендеринг документов")),
                () -> assertTrue(renderingDocsPage.plantUmlOnPageDisplayed(),
                        getTextMessage("PlantUml схема", "Архитектура/Аспекты/DocHub/Рендеринг документов"))
        );
    }
}
