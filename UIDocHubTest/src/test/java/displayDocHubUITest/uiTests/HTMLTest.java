package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HTMLTest extends BaseTest {

    @DisplayName("testcase_155")
    @Description("Проверка элемента во вкладке Документы/Руководство/Плагины/Примеры/HTML")
    @Test
    public void elementsOnHTMLIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("HTML");
        menuPage.clickHTML();

        assertAll(
                () -> assertTrue(htmlPage.elementTablePluginIsDisplayed(0)
                        , getTextMessage("Параметры передаваемые в плагин:", " HTML ")),
                () -> assertTrue(htmlPage.elementTablePluginIsDisplayed(1)
                        , getTextMessage("Пример результата запроса к данным архитектуры из плагина", "  HTML ")),
                () -> assertTrue(htmlPage.elementTablePluginIsDisplayed(2)
                        , getTextMessage("Пример получения данных из DataSet в плагине", " HTML ")),
                () -> assertTrue(htmlPage.elementSampleApiIsDisplayed()
                        , getTextMessage("Sample API", "HTML ")),
                () -> assertTrue(htmlPage.elementHTMLCodeIsDisplayed()
                        , getTextMessage("Привет", "HTML "))
        );
    }

    @DisplayName("testcase_156")
    @Description("Документы/Руководство/Плагины/Примеры/DevTool")
    @Test
    public void elementOnPageIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("DevTool");
        menuPage.clickDevTool();

        assertTrue(htmlPage.elementExecuteButtonIsDisplayed(),
                getTextMessage("Execute", "Документы/Руководство/Плагины/Примеры/DevTool"));
    }
}
