package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AspectsTest extends BaseTest {

    @BeforeEach
    public void startAspects() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Аспекты");
        menuPage.clickAspects();
    }

    @DisplayName("testcase_129")
    @Description("Проверка отображения элементов на странице  Документы/DocHub/Руководство/Аспекты")
    @MethodSource("page.AspectsPage#getLocator")
    @ParameterizedTest(name = "testcase_129")
    public void elementsAspectsDisplayedTest(String locator, String element, String message) {
        aspectsPage.clickElement(locator);

        assertTrue(aspectsPage.elementDocHubIsDisplayed(element)
                , getTextMessage(message, "Аспекты"));
    }

    @DisplayName("testcase_130")
    @Description("Проверка отображения элементов  на  странице Аспекты")
    @Disabled
    @Test
    public void elementsSmartAntsOnAspectsIsDisplayedTest() {
        aspectsPage.clickRight();
        aspectsPage.ClickSmartAnts();

        assertTrue(aspectsPage.elementSmartAntsIsDisplayed()
                , getTextMessage("SmartAnts", "Аспекты"));
    }
}
