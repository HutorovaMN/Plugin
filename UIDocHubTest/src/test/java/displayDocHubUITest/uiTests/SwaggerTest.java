package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SwaggerTest extends BaseTest {

    @DisplayName("testcase_142")
    @Description("Проверка отображения элементов  на  странице Документы/DocHub/Руководство/Документы/Swagger")
    @Test
    public void elementsOnSwaggerDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Swagger");
        menuPage.clickSwagger();
        swaggerPage.clickRequest();
        swaggerPage.clickTryIt();

        assertAll(
                () -> assertTrue(swaggerPage.elementExecuteIsDisplayed()
                        , getTextMessage("Returns a list of users. ", "Swagger"))
        );
    }
}
