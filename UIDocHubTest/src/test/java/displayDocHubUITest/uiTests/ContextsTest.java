package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContextsTest extends BaseTest {

    @DisplayName("testcase_150")
    @Description("Проверка отображения элементов  на  странице Документы/DocHub/Руководство/Контексты")
    @Test
    public void elementsOnContextIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Контексты");
        menuPage.clickContexts();

        assertAll(
                () -> assertTrue(contextsPage.elementSchemaIsDisplayed(0)
                        , getTextMessage("Структура манифеста контекста ", "Руководства/Контексты")),
                () -> assertTrue(contextsPage.elementSchemaIsDisplayed(1)
                        , getTextMessage("/manifest/contexts.yaml уровень 1", "Руководства/Контексты")),
                () -> assertTrue(contextsPage.elementSchemaIsDisplayed(2)
                        , getTextMessage(" /manifest/contexts.yaml уровень 2 ", "Руководства/Контексты")),
                () -> assertTrue(contextsPage.elementSchemaIsDisplayed(3)
                        , getTextMessage(" /manifest/contexts.yaml уровень 3", "Руководства/Контексты")),
                () -> assertTrue(contextsPage.elementSchemaIsDisplayed(4)
                        , getTextMessage(" /manifest/contexts.yaml: уровень 4 ", "Руководства/Контексты")),
                () -> assertTrue(contextsPage.elementSchemaIsDisplayed(5)
                        , getTextMessage(" Общая архитектура Seaf Archtool", "Руководства/Контексты")),
                () -> assertTrue(contextsPage.elementPlanUMLIsDisplayed(0)
                        , getTextMessage(" Контейнерная архитектура Seaf Archtool", "Руководства/Контексты")),
                () -> assertTrue(contextsPage.elementPlanUMLIsDisplayed(1)
                        , getTextMessage("Компонентная архитектура Seaf Archtool ", "Руководства/Контексты")),
                () -> assertTrue(contextsPage.elementPlanUMLIsDisplayed(2)
                        , getTextMessage("Диаграмма взаимодействия Seaf Archtool ", "Руководства/Контексты")),
                () -> assertTrue(contextsPage.elementPlanUMLIsDisplayed(3)
                        , getTextMessage(" PlanUML ", "Руководства/Контексты")),
                () -> assertTrue(contextsPage.elementPlanUMLIsDisplayed(4)
                        , getTextMessage("Компоненты эксперта R.Piontik ", "Руководства/Контексты"))
        );
    }
}
