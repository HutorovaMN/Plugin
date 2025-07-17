package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TechRadarTest extends BaseTest {

    @DisplayName("testcase_161")
    @Description("Проверка элемента во вкладке  Документы/DocHub/Руководство/Техрадар")
    @Test
    public void elementsOnTechRadarIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Техрадар");
        menuPage.clickTechRadar();

        assertAll(
                () -> assertTrue(techRadarPage.elementOneIsDisplayed(0)
                        , getTextMessage("1 в сводной форме ", " Техрадар")),
                () -> assertTrue(techRadarPage.elementTwoIsDisplayed(0)
                        , getTextMessage("2 в сводной форме ", " Техрадар")),
                () -> assertTrue(techRadarPage.elementThreeIsDisplayed(0)
                        , getTextMessage("3 в сводной форме ", " Техрадар")),
                () -> assertTrue(techRadarPage.elementFourIsDisplayed(0)
                        , getTextMessage("4 в сводной форме ", " Техрадар")),
                () -> assertTrue(techRadarPage.elementFiveIsDisplayedAndClickable()
                        , getTextMessage("5", " Техрадар")),
                () -> assertTrue(techRadarPage.elementSixIsDisplayedAndClickable()
                        , getTextMessage("6", " Техрадар")),
                () -> assertTrue(techRadarPage.elementSevenIsDisplayedAndClickable()
                        , getTextMessage("7", " Техрадар")),
                () -> assertTrue(techRadarPage.elementEightIsDisplayedAndClickable()
                        , getTextMessage("8", " Техрадар")),
                () -> assertTrue(techRadarPage.elementNineIsDisplayedAndClickable()
                        , getTextMessage("9", " Техрадар")),
                () -> assertTrue(techRadarPage.elementTenIsDisplayedAndClickable()
                        , getTextMessage("10", " Техрадар")),
                () -> assertTrue(techRadarPage.elementElevenIsDisplayedAndClickable()
                        , getTextMessage("11", " Техрадар")),
                () -> assertTrue(techRadarPage.elementTwelveIsDisplayedAndClickable()
                        , getTextMessage("12", " Техрадар")),
                () -> assertTrue(techRadarPage.elementThirteenIsDisplayedAndClickable()
                        , getTextMessage("13", " Техрадар")),
                () -> assertTrue(techRadarPage.elementFourteenIsDisplayedAndClickable()
                        , getTextMessage("14", " Техрадар")),
                () -> assertTrue(techRadarPage.elementFifteenIsDisplayedAndClickable()
                        , getTextMessage("15", " Техрадар"))
        );
    }
}
