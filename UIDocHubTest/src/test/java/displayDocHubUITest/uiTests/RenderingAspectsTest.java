package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RenderingAspectsTest extends BaseTest {

    @DisplayName("testcase_178")
    @Description("Проверка отображения элементов на странице Архитектура/Аспекты/DocHub/Рендеринг аспектов")
    @Test
    public void elementsOnRenderingAspectsIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Рендеринг аспектов");
        menuPage.clickRenderingAspects();

        assertAll(
                () -> assertTrue(renderingAspectsPage.elementOnPageDisplayed(),
                        getTextMessage("Компонент DocHub", "Архитектура/Аспекты/DocHub/Рендеринг аспектов")),
                () -> assertTrue(renderingAspectsPage.plantUmlOnPageDisplayed(),
                        getTextMessage("DocHub схема", "Архитектура/Аспекты/DocHub/Рендеринг аспектов"))
        );
    }
}
