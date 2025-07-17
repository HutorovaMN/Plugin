package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExtensionTest extends BaseTest {

    @DisplayName("testcase_151")
    @Description("Проверка отображения элементов  на  странице Документы/DocHub/Руководство/Наследование")
    @Test
    public void elementsOnExtensionIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Наследование");
        menuPage.clickExtension();

        assertAll(
                () -> assertTrue(extensionPage.elementInTableIsDisplayed()
                        , getTextMessage(" JSONata в таблице ", "Руководства/Наследование")),
                () -> assertTrue(extensionPage.elementSchemaComponentsIsDisplayed()
                        , getTextMessage(" Схема компонентов ", "Руководства/Наследование"))
        );
    }
}
