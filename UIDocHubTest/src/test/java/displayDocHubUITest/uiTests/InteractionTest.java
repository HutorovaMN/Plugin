package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InteractionTest extends BaseTest {

    @DisplayName("testcase_188")
    @Description("Проверка отображения элементов на странице Взаимодействие")
    @Test
    public void elementsOnInteractionIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.clickInteraction();

        assertAll(
                () -> assertTrue(interactionPage.elementDeploymentOnPageIsPresent()
                        , getTextMessage(" Разворачивание DocHub ", "Взаимодействие")),
                () -> assertTrue(interactionPage.elementDeviationOnPageIsPresent()
                        , getTextMessage(" Проверка отклонений выявленных валидаторами ", "Взаимодействие"))
        );
    }
}
