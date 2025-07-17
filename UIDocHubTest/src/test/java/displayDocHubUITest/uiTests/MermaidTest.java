package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MermaidTest extends BaseTest {

    @DisplayName("testcase_134")
    @Description(" Проверка отображения элементов на странице  Документы/DocHub/Руководство/Документы/Mermaid ")
    @Test
    public void elementsOnAMermaidIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Mermaid");
        menuPage.clickMermaid();

        assertTrue(mermaidPage.elementC4IsDisplayed()
                , getTextMessage(" C4", "Mermaid"));
    }
}
