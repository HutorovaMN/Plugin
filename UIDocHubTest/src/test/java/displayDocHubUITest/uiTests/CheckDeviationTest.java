package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckDeviationTest extends BaseTest {

    @DisplayName("testcase_193")
    @Description("Проверка отображения элементов на странице Взаимодействие/DocHub/Пользовательский путь/Проверка отклонений выявленных валидаторами")
    @Test
    public void elementsOnCheckDeviationIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Проверка отклонений выявленных валидаторами");
        menuPage.clickCheckDeviation();

        assertTrue(checkDeviationPage.elementOnPageDisplayed(),
                getTextMessage("Схема PlantUml", "Архитектура/Контексты/DocHub/Пользовательский путь/Проверка отклонений выявленных валидаторами"));
    }
}
