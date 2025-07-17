package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainPageTests extends BaseTest {

    @DisplayName("testcase_121")
    @Description("Проверка отображения элементов вкладки Документы/DocHub")
    @Test
    public void elementsOnMainPageDisplayedTest() {

        assertAll(
                () -> assertTrue(mainPage.elementDocHubArchVerIsDisplayed(), getTextMessage("Инкрементальное развитие архитектуры", "Главной странице")),
                () -> assertTrue(mainPage.elementDocHubArchDistribIsDisplayed(), getTextMessage("Управление децентрализованной архитектурой", " Главной странице")),
                () -> assertTrue(mainPage.elementStructureOfTheHoldingIsDisplayed(), getTextMessage("Структура холдинга", " Главной странице")),
                () -> assertTrue(mainPage.elementDevelopmentOfEcosystemArchitectureIsDisplayed(), getTextMessage("Развитие архитектуры экосистем", " Главной странице")),
                () -> assertTrue(mainPage.elementArchitecturalFacadeManagementIsDisplayed(), getTextMessage("Управление архитектурным фасадом ", " Главной странице")),
                () -> assertTrue(mainPage.elementMindMupIsDisplayed(), getTextMessage("Mind Map", " Главной странице"))
        );
    }
}
