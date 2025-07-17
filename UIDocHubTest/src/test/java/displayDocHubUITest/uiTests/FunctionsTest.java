package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.*;

public class FunctionsTest extends BaseTest {

    @DisplayName("testcase_162")
    @Description("Проверка элемента во вкладке Документы/DocHub/Руководство/Функции")
    @Test
    public void elementsOnFunctionsIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Функции");
        menuPage.clickFunctions();

        assertAll(
                () -> assertTrue(functionsPage.elementTextIsDisplayed(0)
                        , getTextMessage("Простой пример функции:", " Функции")),
                () -> assertTrue(functionsPage.elementTextIsDisplayed(1)
                        , getTextMessage(" JSONata запрос", "Функции")),
                () -> assertTrue(functionsPage.elementThirtyIsDisplayed()
                        , getTextMessage(" 30", "Функции"))
        );
    }

    @DisplayName("testcase_163")
    @Description("Проверка работы функции")
    @Test
    public void functionsTest() {
        mainPage.clickMainPageButton();
        menuPage.clickJsonAta();
        jsoNataConsolePage.inputFunctions();

        assertEquals(jsoNataConsolePage.getTextResult(), "30", "функция demo_summ не работает");
    }
}
