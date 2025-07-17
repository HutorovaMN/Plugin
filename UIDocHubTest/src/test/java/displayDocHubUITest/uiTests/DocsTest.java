package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DocsTest extends BaseTest {

    @DisplayName("testcase_131")
    @Description("Проверка отображения элементов на странице  Документы/DocHub/Руководство/Документы")
    @Test
    public void elementsOnDocsIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Документы");
        menuPage.clickDocs();

        assertAll(
                () -> assertTrue(docsPage.elementDocHubIsDisplayed()
                        , getTextMessage(" DocHub ", "Документы")),
                () -> assertTrue(docsPage.elementDocHubUserToBeClickableAndDisplayed()
                        , getTextMessage(" DocHubUser ", "Документы"))
        );
    }
}
