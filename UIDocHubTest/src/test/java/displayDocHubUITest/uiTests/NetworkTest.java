package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NetworkTest extends BaseTest {

    @DisplayName("testcase_135")
    @Description("Проверка отображения элементов  на  странице Network  ")
    @Test
    public void elementsOnNetworkIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Network");
        menuPage.clickNetwork();

        assertTrue(networkPage.elementNetworkIsDisplayed()
                , getTextMessage(" Network", "Network"));
    }
}
