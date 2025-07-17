package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CoreInterfacesTest extends BaseTest {

    @DisplayName("testcase_153")
    @Description("Проверка отображения элементов  на  странице Документы/DocHub/Руководство/Плагины/Интерфейсы ядра ")
    @Test
    public void elementsOnCoreInterfacesIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Интерфейсы ядра");
        menuPage.clickCoreInterfaces();

        assertAll(
                () -> assertTrue(coreInterfacesPage.elementTextIsDisplayed(0)
                        , getTextMessage("Глобальная переменная DocHub", "  Интерфейсы ядра  ")),
                () -> assertTrue(coreInterfacesPage.elementTextIsDisplayed(1)
                        , getTextMessage("profile: Object", "   Интерфейсы ядра  ")),
                () -> assertTrue(coreInterfacesPage.elementTextIsDisplayed(2)
                        , getTextMessage("manifest” структура:", "  Интерфейсы ядра  ")),
                () -> assertTrue(coreInterfacesPage.elementTextIsDisplayed(3)
                        , getTextMessage(" Пример использования: ", "  Интерфейсы ядра  ")),
                () -> assertTrue(coreInterfacesPage.elementTextIsDisplayed(4)
                        , getTextMessage(" params: Object", "  Интерфейсы ядра ")),
                () -> assertTrue(coreInterfacesPage.elementTextIsDisplayed(5)
                        , getTextMessage("path: String", "   Интерфейсы ядра ")),
                () -> assertTrue(coreInterfacesPage.elementTextIsDisplayed(6)
                        , getTextMessage("getContent: function(URL: String)", "  Интерфейсы ядра ")),
                () -> assertTrue(coreInterfacesPage.elementTextIsDisplayed(7)
                        , getTextMessage(" pullData", "  Интерфейсы ядра  ")),
                () -> assertTrue(coreInterfacesPage.elementTextIsDisplayed(8)
                        , getTextMessage("data", " Интерфейсы ядра  ")),
                () -> assertTrue(coreInterfacesPage.elementMarkdownTextIsDisplayed()
                        , getTextMessage("Пример документа плагина", " Интерфейсы ядра  "))
        );
    }
}
