package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TemplatesTest extends BaseTest {

    @DisplayName("testcase_145")
    @Description("Проверка отображения элементов на странице  Документы/DocHub/Руководство/Документы/Шаблоны")
    @Test
    public void elementsTemplateDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Шаблоны");
        menuPage.clickTemplate();

        assertAll(
                () -> assertTrue(templatesPage.elementMarkdownIsDisplayed()
                        , getTextMessage(" Markdown ", "Шаблоны")),
                () -> assertTrue(templatesPage.elementPlantUMLIsDisplayed()
                        , getTextMessage(" PlantUML", "Шаблоны")),
                () -> assertTrue(templatesPage.elementServerOrderIsDisplayed()
                        , getTextMessage(" Servers - orders", "Шаблоны")),
                () -> assertTrue(templatesPage.elementOperationIsDisplayed()
                        , getTextMessage(" Operations", "Шаблоны")),
                () -> assertTrue(templatesPage.elementServerPaymentIsDisplayed()
                        , getTextMessage(" Servers - payments", "Шаблоны")),
                () -> assertTrue(templatesPage.elementMessageIsDisplayed()
                        , getTextMessage(" Messages", "Шаблоны")),
                () -> assertTrue(templatesPage.elementSchemasIsDisplayed()
                        , getTextMessage("Schemas", "Шаблоны"))
        );
    }

    @DisplayName("testcase_146")
    @Description("Проверка отображения элементов Примера шаблона OpenAPI на странице  Документы/DocHub/Руководство/Документы/Шаблоны")
    @MethodSource("page.TemplatesPage#getLocator")
    @ParameterizedTest(name = "testcase_146")
    public void elementsAPIDocHubDisplayedTest(String locator, String element) {
        mainPage.clickMainPageButton();
        menuPage.enterText("Шаблоны");
        menuPage.clickTemplate();
        templatesPage.clickRequest(locator);
        templatesPage.clickTryOut();

        assertTrue(templatesPage.elementExecuteIsDisplayed()
                , getTextMessage(element, "Шаблоны"));
    }
}
