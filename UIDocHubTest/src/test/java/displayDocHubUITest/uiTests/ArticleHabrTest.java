package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArticleHabrTest extends BaseTest {

    @DisplayName("testcase_189")
    @Description("Проверка отображения элементов на странице Взаимодействие/DocHub/Клиентский путь/Продвижение/Статья на Хабре")
    @Test
    public void elementsOnArticleHabrIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Статья на Хабре");
        menuPage.clickArticleHabr();

        assertTrue(articleHabrPage.elementOnPageDisplayed(),
                getTextMessage("Схема PlantUml", "Взаимодействие/DocHub/Клиентский путь/Продвижение/Статья на Хабре"));
    }
}
