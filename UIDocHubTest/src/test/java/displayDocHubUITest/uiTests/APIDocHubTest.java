package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class APIDocHubTest extends BaseTest {

    @BeforeEach
    public void startAPI() {
        mainPage.clickMainPageButton();
        menuPage.enterText("API SEAF.ArchTool");
        menuPage.clickAPIDocHub();
    }

    @DisplayName("testcase_123")
    @Description("Проверка отображения элементов DocHub backend API вкладки Документы/SEAF.ArchTool/Руководство/API SEAF.ArchTool ")
    @MethodSource("page.APIDocHubPage#getLocator")
    @ParameterizedTest(name = "testcase_123")
    public void elementsAPIDocHubDisplayedTest(String locator, String element) {
        apiDocHubPage.clickElement(locator);
        apiDocHubPage.clickTryItOutButton();

        assertTrue(apiDocHubPage.elementExecuteButtonToBeClickableAndDisplayed()
                , getTextMessage(element, "APiDocHub"));
    }

    @DisplayName("testcase_124")
    @Description("Проверка отображения элемента JSONataQuery вкладки Документы/SEAF.ArchTool/Руководство/API SEAF.ArchTool ")
    @Test
    public void elementsSchemasIsDisplayedTest() {
        apiDocHubPage.clickJsonataQuery();
        apiDocHubPage.getTextPattern();

        assertEquals("pattern: ^([a-zA-Z\\_]*(\\.[a-zA-Z\\_][a-zA-Z\\_]*)*)|(\\(.*\\))$", apiDocHubPage.getTextPattern()
                , getTextMessage("JSONataQuery", "API SEAF.ArchTool "));
    }
}
