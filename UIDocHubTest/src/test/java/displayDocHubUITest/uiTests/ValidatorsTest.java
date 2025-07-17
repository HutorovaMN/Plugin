package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidatorsTest extends BaseTest {

    @DisplayName("testcase_158")
    @Description("Проверка элемента во вкладке Документы/Руководство/Правила/Валидаторы")
    @Test
    public void elementsOnValidatorsIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Валидаторы");
        menuPage.clickValidators();

        assertAll(
                () -> assertTrue(validatorsPage.elementTextIsDisplayed(0)
                        , getTextMessage("Пример описания простого валидатора ", " Валидаторы")),
                () -> assertTrue(validatorsPage.elementTextIsDisplayed(1)
                        , getTextMessage("Результат работы валидатора", "Валидаторы")),
                () -> assertTrue(validatorsPage.elementTextIsDisplayed(2)
                        , getTextMessage("Пример описания отклонения:", "Валидаторы"))
        );
    }
}
