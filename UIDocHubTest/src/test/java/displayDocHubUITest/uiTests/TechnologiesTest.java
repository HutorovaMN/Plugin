package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TechnologiesTest extends BaseTest {

    @DisplayName("testcase_160")
    @Description("Проверка элемента во вкладке Документы/Руководство/Технологии")
    @Test
    @Disabled
    public void elementsOnTechnologiesIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Технологии");
        menuPage.clickTechnologies();

        assertAll(
                () -> assertTrue(technologiesPage.elementTextIsDisplayed(0)
                        , getTextMessage("technologies ", " Технологии")),
                () -> assertTrue(technologiesPage.elementTextIsDisplayed(1)
                        , getTextMessage("token key atrule", "Технологии")),
                () -> assertTrue(technologiesPage.elementJavaScriptElementIsDisplayed()
                        , getTextMessage("JavaScript'", "Технологии"))
        );
    }
}
