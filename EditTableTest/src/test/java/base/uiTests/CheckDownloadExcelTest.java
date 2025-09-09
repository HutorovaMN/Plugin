package base.uiTests;

import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Paths;

public class CheckDownloadExcelTest extends test.java.base.BaseTest {

    String fileName = "editable-table.calculating-cells.xls";
    String filePath = Paths.get("C:\\Users\\astonuser\\Downloads", fileName).toString();

    @DisplayName("")
    @Description("Проверка правильности выгрузки Excel")
    @Test()
    public void checkDownloadExcel() throws IOException {
        mainPageTable.clickMainPageButton();
        mainPageTable.enterText("Вычисляемые ячейки");
        mainPageTable.clickEditTableMenu();
        excelPage.clickDownloadExcelButton();

        Assertions.assertTrue(excelPage.downloadExcelHTML(filePath).contains(editTablePage.getTextContainer_2_1()));
        Assertions.assertTrue(excelPage.downloadExcelHTML(filePath).contains(editTablePage.getTextContainer_2_2()));
        Assertions.assertTrue(excelPage.downloadExcelHTML(filePath).contains(editTablePage.getTextContainer_2_3()));
        excelPage.deleteFile(filePath);
    }
}
