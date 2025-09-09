package base.uiTests;

import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckCalculationsTest extends test.java.base.BaseTest {
    @DisplayName("")
    @Description("Проверка правильности вычислений в редактируемой таблице")
    @ParameterizedTest()
    @MethodSource("page.EditTablePage#calculationTestData")
    public void checkCalculationsWithDifferentValues(String inputValue, String expectedResult) {

        mainPageTable.clickMainPageButton();
        mainPageTable.enterText("Вычисляемые ячейки");
        mainPageTable.clickEditTableMenu();

        assertEquals(expectedResult, editTablePage.enterTextCell_2_1(inputValue), "Результат вычисления в ячейке (2,3) не совпадает с ожидаемым.");
    }
}
