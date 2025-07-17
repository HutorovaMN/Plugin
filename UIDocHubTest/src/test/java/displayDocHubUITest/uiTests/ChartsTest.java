package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChartsTest extends BaseTest {

    @DisplayName("testcase_143")
    @Description("Проверка отображения элементов  на  странице Документы/DocHub/Руководство/Документы/Диаграммы")
    @Test
    public void elementsOnChartsIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Диаграммы");
        menuPage.clickCharts();

        assertAll(
                () -> assertTrue(chartsPage.elementApproachForSettingUpChartIsDisplayed()
                        , getTextMessage(" Общий подход для настройки диаграммы ", "Диаграммы")),
                () -> assertTrue(chartsPage.elementRadarIsDisplayed()
                        , getTextMessage("Радар", " Диаграммы")),
                () -> assertTrue(chartsPage.elementBarChartIsDisplayed()
                        , getTextMessage(" Столбиковая диаграмма ", "Диаграммы")),
                () -> assertTrue(chartsPage.elementBubbleChartIsDisplayed()
                        , getTextMessage(" Пузырьковая диаграмма ", "Диаграммы")),
                () -> assertTrue(chartsPage.elementRingDiagramIsDisplayed()
                        , getTextMessage(" Кольцевая диаграмма ", "Диаграммы")),
                () -> assertTrue(chartsPage.elementLineChartIsDisplayed()
                        , getTextMessage("Линейная диаграмма", "Диаграммы")),
                () -> assertTrue(chartsPage.elementPieChartIsDisplayed()
                        , getTextMessage("Круговая диаграмма", "Диаграммы")),
                () -> assertTrue(chartsPage.elementPolarChartIsDisplayed()
                        , getTextMessage(" Полярная диаграмма ", "Диаграммы")),
                () -> assertTrue(chartsPage.elementScatterChartIsDisplayed()
                        , getTextMessage(" Точечная диаграмма ", "Диаграммы"))
        );
    }
}
