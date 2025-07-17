package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleExampleTest extends BaseTest {

    @BeforeEach
    public void startSimpleExample() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Простой пример");
        menuPage.clickSimpleExample();
    }

    @DisplayName("testcase_138")
    @Description("Проверка отработки функции сворачивания связей в жгуты")
    @Test
    public void elementsOnSimpleExampleIntoBundlesTest() {
        simpleExamplePage.clickBundles();

        assertTrue(simpleExamplePage.elementLoginLinkIsNotDisplayed(), "Функция свернуть  связи в жгуты не работает  ");
    }

    @DisplayName("testcase_139")
    @Description("Проверка работы кнопки 'показать все связи'")
    @Test
    public void elementsOnSimpleExampleShowAllLinkTest() {
        simpleExamplePage.clickBundles();
        simpleExamplePage.clickShowLink();

        assertTrue(simpleExamplePage.elementLoginLinkIsDisplayed(), "Функция показать все связи не работает  ");
    }

    @DisplayName("testcase_140")
    @Description(" Проверка работы кнопки 'показать только структуру'")
    @Test
    public void elementsOnSimpleExampleShowOnlyStructureTest() {
        simpleExamplePage.clickShowOnlyStructure();

        assertTrue(simpleExamplePage.elementLinkIsNotDisplayed(), "Функция показать показать только структуру  не работает  ");
    }

    @DisplayName("testcase_141")
    @Description("Проверка работы кнопки 'показать связи'")
    @Test
    public void elementsOnSimpleExampleShowConnectionTest() {
        simpleExamplePage.clickShowOnlyStructure();
        simpleExamplePage.clickShowConnection();

        assertTrue(simpleExamplePage.elementLinkIsDisplayed(), "Функция показать показать связи  не работает  ");
    }
}
