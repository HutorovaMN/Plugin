package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AsyncApiTest extends BaseTest {

    @DisplayName("testcase_132")
    @Description("Проверка отображения элементов на странице  Документы/DocHub/Руководство/Документы/AsyncApi")
    @Test
    public void elementsOnAsyncApiIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("AsyncApi");
        menuPage.clickAsyncApi();

        assertAll(
                () -> assertTrue(asyncApiPage.elementMessageIsDisplayed()
                        , getTextMessage(" Messages ", "AsyncApi")),
                () -> assertTrue(asyncApiPage.elementServersIsDisplayed()
                        , getTextMessage(" Servers ", "AsyncApi")),
                () -> assertTrue(asyncApiPage.elementOperationsIsDisplayed()
                        , getTextMessage(" Operations ", "AsyncApi")),
                () -> assertTrue(asyncApiPage.elementSchemasIsDisplayed()
                        , getTextMessage(" Schemas ", "AsyncApi"))
        );
    }
}
