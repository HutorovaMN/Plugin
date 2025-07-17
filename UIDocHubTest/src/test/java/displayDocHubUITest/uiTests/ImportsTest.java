package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ImportsTest extends BaseTest {

    @DisplayName("testcase_147")
    @Description("Проверка отображения элементов на странице  Документы/DocHub/Руководство/Импорт ")
    @Test
    public void elementsOnImportsIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Импорт");
        menuPage.clickImports();

        assertAll(
                () -> assertTrue(importsPage.elementTextIsDisplayed(0)
                        , getTextMessage(" Файловая структура", "Импорт")),
                () -> assertTrue(importsPage.elementTextIsDisplayed(1)
                        , getTextMessage("корневой манифест (root.yaml)", " Импорт")),
                () -> assertTrue(importsPage.elementTextIsDisplayed(2)
                        , getTextMessage("манифест компонентов (components.yaml)", "Импорт")),
                () -> assertTrue(importsPage.elementTextIsDisplayed(3)
                        , getTextMessage(" GitLab", "Импорт"))
        );
    }
}
