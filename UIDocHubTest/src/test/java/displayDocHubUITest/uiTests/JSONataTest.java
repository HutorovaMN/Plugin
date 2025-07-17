package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JSONataTest extends BaseTest {

    @DisplayName("testcase_125")
    @Description("Проверка отображения элементов вкладки Документы/DocHub/Руководство/JSONata ")
    @Test
    public void elementsOnJSONataIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("JSONata");
        menuPage.clickJSONata();

        assertAll(
                () -> assertTrue(jsoNataPage.elementIsDisplayed(0)
                        , getTextMessage("$mergedeep ", "JSONata")),
                () -> assertTrue(jsoNataPage.elementIsDisplayed(1)
                        , getTextMessage(" результат  $mergedeep ", "JSONata")),
                () -> assertTrue(jsoNataPage.elementIsDisplayed(2)
                        , getTextMessage(" $merge ", "JSONata")),
                () -> assertTrue(jsoNataPage.elementIsDisplayed(3)
                        , getTextMessage("результат $merge ", "JSONata")),
                () -> assertTrue(jsoNataPage.elementIsDisplayed(4)
                        , getTextMessage("  Запрос /* Создаем валидатор */ ", "JSONata")),
                () -> assertTrue(jsoNataPage.elementIsDisplayed(5)
                        , getTextMessage("Результат  /* Создаем валидатор */ ", "JSONata")),
                () -> assertTrue(jsoNataPage.elementIsDisplayed(6)
                        , getTextMessage(" Запрос \"$ref\" ", "JSONata")),
                () -> assertTrue(jsoNataPage.elementIsDisplayed(7)
                        , getTextMessage(" Результат \"$ref\" ", "JSONata")),
                () -> assertTrue(jsoNataPage.elementIsDisplayed(8)
                        , getTextMessage(" Запрос  $manifestschema() ", "JSONata")),
                () -> assertTrue(jsoNataPage.elementIsDisplayed(9)
                        , getTextMessage("Результат  $manifestschema() ", "JSONata")),
                () -> assertTrue(jsoNataPage.elementIsDisplayed(10)
                        , getTextMessage(" Объект документа ", "JSONata")),
                () -> assertTrue(jsoNataPage.elementIsDisplayed(11)
                        , getTextMessage(" Запрос     $self", "JSONata")),
                () -> assertTrue(jsoNataPage.elementIsDisplayed(12)
                        , getTextMessage(" Результат     $self ", "JSONata"))
        );
    }
}
