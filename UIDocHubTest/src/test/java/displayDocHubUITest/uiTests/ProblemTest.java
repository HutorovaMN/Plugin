package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProblemTest extends BaseTest {

    @DisplayName("testcase_194")
    @Description("Проверка отображения количества ошибок")
    @Test
    public void problemTestShouldBe1Test() {
        mainPage.clickMainPageButton();
        menuPage.clickProblemsButton();

        assertAll(
                () -> assertTrue(problemsPage.getProblems(), "Общее число ошибок не равно 1"),
                () -> assertTrue(problemsPage.getFILLING_IN_THE_FIELDS_LIST(), " Ошибок заполнения полей не 1"),
                () -> assertTrue(problemsPage.getExpertProblems(), " Ошибок Не указаны эксперты для компонентов не 1")
        );
    }
}
