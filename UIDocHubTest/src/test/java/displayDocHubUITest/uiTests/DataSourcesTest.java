package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DataSourcesTest extends BaseTest {

    @DisplayName("testcase_148")
    @Description("Проверка отображения элементов  на  странице  Источники данных ")
    @Test
    public void elementsDataSourceIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Источник данных");
        menuPage.clickDataSources();

        assertAll(
                () -> assertTrue(dataSourcesPage.elementCriticalityClassIsDisplayed()
                        , getTextMessage(" Класс критичности ", "Источники данных")),
                () -> assertTrue(dataSourcesPage.elementQueriesToArchitectureDataIsDisplayed()
                        , getTextMessage(" Запросы к данным архитектуры", "Источники данных")),
                () -> assertTrue(dataSourcesPage.elementDependenceIsDisplayed()
                        , getTextMessage(" Зависимость", "Источники данных")),
                () -> assertTrue(dataSourcesPage.elementMultipleDependenciesIsDisplayed()
                        , getTextMessage(" Множественные зависимости", "Источники данных"))
        );
    }
}
