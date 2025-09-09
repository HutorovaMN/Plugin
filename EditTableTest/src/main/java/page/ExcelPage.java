package page;

import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExcelPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public ExcelPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private final By DOWNLOAD_EXCEL_BUTTON = By.xpath("(//span[@class='v-btn__content'])[4]");

    public void clickDownloadExcelButton() {
        driver.findElement(DOWNLOAD_EXCEL_BUTTON).click();
    }

    public void deleteFile(String pathFile) {
        Path path = Paths.get(pathFile);
        try {
            Files.delete(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> downloadExcelHTML(String pathFile) throws IOException {
        wait.until(webDriver -> Files.exists(Path.of(pathFile)));

        List<String> data = new ArrayList<>();
        Pattern cellPattern = Pattern.compile("<td>(.*?)</td>");

        try (BufferedReader reader = new BufferedReader(new FileReader(pathFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Matcher matcher = cellPattern.matcher(line);
                while (matcher.find()) {
                    data.add(matcher.group(1).trim());
                }
            }
            return data;
        }
    }

    public String checkExcelExport(String path, String sheetName, int rowName, int cellName) {
        try (
                FileInputStream fileInputStream = new FileInputStream(path);
                Workbook workbook = WorkbookFactory.create(fileInputStream)
        ) {
            Sheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                return null;
            }
            Row row = sheet.getRow(rowName);
            if (row == null) {
                return null;
            }
            Cell cell = row.getCell(cellName);
            if (cell == null) {
                return null;
            }
            if (cell.getCellType() != CellType.STRING) {
                return "";
            }
            return cell.getStringCellValue();
        } catch (FileNotFoundException e) {
            return null;
        } catch (IOException e) {
            return null;
        }
    }
}
