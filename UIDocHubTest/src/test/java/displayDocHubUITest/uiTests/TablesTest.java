package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TablesTest extends BaseTest {

    @DisplayName("testcase_144")
    @Description("Проверка отображения элементов  на  странице Документы/DocHub/Руководство/Документы/Таблицы")
    @Test
    public void elementsTablesDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Таблицы");
        menuPage.clickTable();

        assertAll(
                () -> assertTrue(tablePage.elementPredefinedDataSetIsDisplayed()
                        , getTextMessage(" Предопределенный набор данных ", "Таблицы")),
                () -> assertTrue(tablePage.elementRequestForArchitectureDataIsDisplayed()
                        , getTextMessage(" Запрос к данным архитектуры", "Таблицы")),
                () -> assertTrue(tablePage.elementStoringRequestsInSeparateFileIsDisplayed()
                        , getTextMessage(" Хранение запросов в отдельном файле", "Таблицы")),
                () -> assertTrue(tablePage.elementStoringDataInSeparateFileIsDisplayed()
                        , getTextMessage(" Хранение данных в отдельном файле", "Таблицы")),
//                () -> assertTrue(tablePage.elementExternalDataIsDisplayed() // временное решение, пока не будет доработан функционал
//                        , getTextMessage(" Внешние данные ", "Таблицы")),
                () -> assertTrue(tablePage.elementGeneratingTableBasedDataSourceIsDisplayed()
                        , getTextMessage(" Генерация таблицы на основании источника данных", "Таблицы")),
                () -> assertTrue(tablePage.elementDataProcessingIsDisplayed()
                        , getTextMessage(" Обработка данных ", "Таблицы"))
        );
    }
}
