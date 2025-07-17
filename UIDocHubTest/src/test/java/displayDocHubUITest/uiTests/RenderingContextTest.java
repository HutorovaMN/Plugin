package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RenderingContextTest extends BaseTest {

    @DisplayName("testcase_180")
    @Description("Проверка отображения элементов на странице Архитектура/Аспекты/DocHub/Рендеринг контекстов")
    @Test
    public void elementsOnJSONataIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Рендеринг контекстов");
        menuPage.clickRenderingContext();

        assertAll(
                () -> assertTrue(renderingContextPage.elementOnPageDisplayed(),
                        getTextMessage("Компонент DocHub", "Архитектура/Аспекты/DocHub/Рендеринг контекстов")),
                () -> assertTrue(renderingContextPage.plantUmlOnPageDisplayed(),
                        getTextMessage("PlantUml схема", "Архитектура/Аспекты/DocHub/Рендеринг контекстов"))
        );
    }
}
