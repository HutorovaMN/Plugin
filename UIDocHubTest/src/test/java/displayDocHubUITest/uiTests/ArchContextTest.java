package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArchContextTest extends BaseTest {

    @DisplayName("testcase_182")
    @Description("Проверка отображения элементов на Архитектура/Контексты")
    @Test
    public void elementsOnArchContextDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Контексты");
        menuPage.clickArchContext();

        assertAll(
                () -> assertTrue(archContextPage.elementContextOnPageIsPresent()
                        , getTextMessage("Контекст для отображения объектов вовлеченных во взаимодействие", "Архитектура/Контексты")),
                () -> assertTrue(archContextPage.elementExpertOnPageIsPresent()
                        , getTextMessage("Документ", "Архитектура/Контексты"))
        );
    }
}
