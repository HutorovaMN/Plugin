package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserPathTest extends BaseTest {

    @DisplayName("testcase_191")
    @Description("Проверка отображения элементов на странице Взаимодействие/DocHub/Пользовательский путь")
    @Test
    public void elementsOnUserPathIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Пользовательский путь");
        menuPage.clickUserPath();

        assertTrue(userPathPage.elementOnPageDisplayed(),
                getTextMessage("Схема PlantUml", "Взаимодействие/DocHub/Пользовательский путь"));
    }
}
