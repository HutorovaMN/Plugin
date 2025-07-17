package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AdaptiveMetaModelTest extends BaseTest {

    @DisplayName("testcase_126")
    @Description("Проверка отображения элементов  на  странице Адаптивная метамодель")
    @Test
    public void elementsOnAdaptiveMetaModelDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Адаптивная метамодель");
        menuPage.clickAdaptiveMetamodel();

        assertTrue(adaptiveMetaModelPage.elementConceptIsDisplayed()
                , getTextMessage("Концепция", "Адаптивная метамодель "));
    }
}
