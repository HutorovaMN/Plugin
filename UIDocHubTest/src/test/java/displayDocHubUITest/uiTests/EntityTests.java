package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EntityTests extends BaseTest {

    @DisplayName("testcase_127")
    @Description("Проверка отображения элементов на странице  Документы/DocHub/Руководство/Адаптивная метамодель/Entity")
    @Test
    public void elementsOnEntityIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Entity");
        menuPage.clickEntity();

        assertAll(
                () -> assertTrue(entityPage.elementInteractionsSchemaListIsDisplayed(0)
                        , getTextMessage(" Пользовательский путь ", "Entity")),
                () -> assertTrue(entityPage.elementInteractionsSchemaListIsDisplayed(1)
                        , getTextMessage(" Примеры созданных пользовательских сущностей ", "Entity")),
                () -> assertTrue(entityPage.elementInteractionsSchemaListIsDisplayed(2)
                        , getTextMessage(" Пользовательский путь ", "Entity")),
                () -> assertTrue(entityPage.elementInteractionsSchemaListIsDisplayed(3)
                        , getTextMessage(" Пользовательский путь ", "Entity")),
                () -> assertTrue(entityPage.elementInteractionsSchemaListIsDisplayed(4)
                        , getTextMessage(" Пользовательский путь ", "Entity")),
                () -> assertTrue(entityPage.elementDeploymentDocHubIsDisplayed()
                        , getTextMessage(" Разворачивание DocHub ", "Entity"))
        );
    }
}
