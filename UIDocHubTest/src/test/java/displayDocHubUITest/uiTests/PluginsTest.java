package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PluginsTest extends BaseTest {

    @DisplayName("testcase_152")
    @Description("Проверка отображения элементов  на  странице  Плагины  ")
    @Test
    public void elementsOnPluginsIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Плагины");
        menuPage.clickPlugin();

        assertAll(
                () -> assertTrue(pluginsPage.elementTextIsDisplayed(0)
                        , getTextMessage(" git clone", " Плагины ")),
                () -> assertTrue(pluginsPage.elementTextIsDisplayed(1)
                        , getTextMessage("cd DocHub", "  Плагины ")),
                () -> assertTrue(pluginsPage.elementTextIsDisplayed(2)
                        , getTextMessage("cd plugins", " Плагины ")),
                () -> assertTrue(pluginsPage.elementTextIsDisplayed(3)
                        , getTextMessage(" npm init ", " Плагины ")),
                () -> assertTrue(pluginsPage.elementTextIsDisplayed(4)
                        , getTextMessage(" Пример сформированного файла:", " Плагины ")),
                () -> assertTrue(pluginsPage.elementTextIsDisplayed(5)
                        , getTextMessage("index.js", "  Плагины ")),
                () -> assertTrue(pluginsPage.elementTextIsDisplayed(6)
                        , getTextMessage("VUE2 компонент", " Плагины ")),
                () -> assertTrue(pluginsPage.elementTextIsDisplayed(7)
                        , getTextMessage(" Сборка", " Плагины ")),
                () -> assertTrue(pluginsPage.elementTextIsDisplayed(8)
                        , getTextMessage("developing", "  Плагины ")),
                () -> assertTrue(pluginsPage.elementTextIsDisplayed(9)
                        , getTextMessage("production", " Плагины ")),
                () -> assertTrue(pluginsPage.elementMarkdownIsDisplayed(0)
                        , getTextMessage(" dochub.plugins.example", " Плагины ")),
                () -> assertTrue(pluginsPage.elementMarkdownIsDisplayed(1)
                        , getTextMessage(" Содержимое файла “examples/example.html”:", " Плагины ")),
                () -> assertTrue(pluginsPage.elementMarkdownIsDisplayed(2)
                        , getTextMessage(" “dochub-object”:", "  Плагины ")),
                () -> assertTrue(pluginsPage.elementMarkdownIsDisplayed(3)
                        , getTextMessage("<dochub-object src= ", " Плагины "))
        );
    }
}
