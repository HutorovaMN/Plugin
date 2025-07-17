package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ComponentsTest extends BaseTest {

    @DisplayName("testcase_149")
    @Description("Проверка отображения элементов  на  странице Руководство/Компоненты")
    @Test
    public void elementsOnComponentsIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Компоненты");
        menuPage.clickComponents();

        assertAll(
                () -> assertTrue(componentsPage.elementSchemaIsDisplayed()
                        , getTextMessage(" PlanUML ", "Руководства/Компоненты")),
                () -> assertTrue(componentsPage.elementSchemaComponentsIsDisplayed()
                        , getTextMessage(" Схема компонентов ", "Руководства/Компоненты")),
                () -> assertTrue(componentsPage.elementInTableIsDisplayed()
                        , getTextMessage(" dochub.user в таблице", "Руководства/Компоненты "))
        );
    }
}
