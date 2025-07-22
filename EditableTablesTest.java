package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EditableTablesTest extends BaseTest {

    @DisplayName("Редактируемая таблица")
    @Description("Проверка отображения элементов на странице Документы/Примеры/Редактируемая таблица")
    @Test
    public void elementsOnComponentArchIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Редактируемая таблица");
        editableTablesPage.clickEditableTables();

        assertAll(
                () -> assertTrue(editableTablesPage.elementDescriptionIsDisplayed()
                        , getTextMessage("Описание", " Редактируемая таблица ")),
                () -> assertTrue(editableTablesPage.elementHeadersIsDisplayed()
                        , getTextMessage("Headers", " Редактируемая таблица ")),
                () -> assertTrue(editableTablesPage.elementTypeIsDisplayed()
                        , getTextMessage("Type", " Редактируемая таблица ")),
                () -> assertTrue(editableTablesPage.elementSelectIsDisplayed()
                        , getTextMessage("Select", " Редактируемая таблица ")),
                () -> assertTrue(editableTablesPage.elementObjectIsDisplayed()
                        , getTextMessage("Object", " Редактируемая таблица ")),
                () -> assertTrue(editableTablesPage.elementFnIsDisplayed()
                        , getTextMessage("Fn", " Редактируемая таблица ")),
                () -> assertTrue(editableTablesPage.elementSaveIsDisplayed()
                        , getTextMessage("Save", " Редактируемая таблица ")),
                () -> assertTrue(editableTablesPage.elementExampleIsDisplayed()
                        , getTextMessage("Example", " Редактируемая таблица ")),
                () -> assertTrue(editableTablesPage.elementResultIsDisplayed()
                        , getTextMessage("Result", " Редактируемая таблица ")),
                () -> assertTrue(editableTablesPage.elementMutationIsDisplayed()
                        , getTextMessage("Mutation", " Редактируемая таблица ")),
                () -> assertTrue(editableTablesPage.elementFieldIsDisplayed()
                        , getTextMessage("Field", " Редактируемая таблица ")),
                () -> assertTrue(editableTablesPage.elementDescription2IsDisplayed()
                        , getTextMessage("Description_2", " Редактируемая таблица ")),
                () -> assertTrue(editableTablesPage.elementResult2IsDisplayed()
                        , getTextMessage("Result_2", " Редактируемая таблица ")),
                () -> assertTrue(editableTablesPage.elementTransformationIsDisplayed()
                        , getTextMessage("Transformation", " Редактируемая таблица "))
        );
    }
}
