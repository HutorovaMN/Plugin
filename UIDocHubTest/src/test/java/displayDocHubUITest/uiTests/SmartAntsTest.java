package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SmartAntsTest extends BaseTest {

    @DisplayName("testcase_137")
    @Description("Проверка отображения элементов  на  странице SmartAnts ")
    @Test
    public void elementsOnSmartAntsIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("SmartAnts");
        menuPage.clickSmartAnts();

        assertAll(
                () -> assertTrue(smartAntsPage.elementSmartAntsIsDisplayed(0)
                        , getTextMessage(" Авторизация  ", "SmartAnts")),
                () -> assertTrue(smartAntsPage.elementColorIsDisplayed()
                        , getTextMessage(" цвет связей", " SmartAnts")),
                () -> assertTrue(smartAntsPage.elementSmartAntsIsDisplayed(2)
                        , getTextMessage(" Отображение элементов с иерархией ", "SmartAnts")),
                () -> assertTrue(smartAntsPage.elementSmartAntsIsDisplayed(3)
                        , getTextMessage(" Интерактивное взаимодействия с диаграммой ", "SmartAnts")),
                () -> assertTrue(smartAntsPage.elementSmartAntsIsDisplayed(4)
                        , getTextMessage(" hideBoundaryTitles   ", "SmartAnts")),
                () -> assertTrue(smartAntsPage.elementSmartAntsIsDisplayed(5)
                        , getTextMessage(" hideLeafTitles  ", "SmartAnts")),
                () -> assertTrue(smartAntsPage.elementSmartAntsIsDisplayed(6)
                        , getTextMessage(" hideTitle ", "SmartAnts")),
                () -> assertTrue(smartAntsPage.elementSmartAntsIsDisplayed(7)
                        , getTextMessage(" Управление сеткой расположения элементов  ", "SmartAnts")),
                () -> assertTrue(smartAntsPage.elementSmartAntsIsDisplayed(8)
                        , getTextMessage(" Анимированные сценарии ", "SmartAnts")),
                () -> assertTrue(smartAntsPage.elementSmartAntsIsDisplayed(9)
                        , getTextMessage("Котик", "SmartAnts")),
                () -> assertTrue(smartAntsPage.elementSmartAntsIsDisplayed(10)
                        , getTextMessage("Генерация диаграмм из данных", "SmartAnts")),
                () -> assertTrue(smartAntsPage.elementSmartAntsIsDisplayed(11)
                        , getTextMessage("Схема", "SmartAnts"))
        );
    }
}
