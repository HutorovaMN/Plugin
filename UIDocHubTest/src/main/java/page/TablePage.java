package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementIsDisplayed;

public class TablePage {

    private WebDriver driver;

    public TablePage(WebDriver driver) {
        this.driver = driver;
    }

    private static final By PREDEFINED_DATA_SET_ELEMENT = By.xpath("//*[text() = 'Значение 1']");
    private static final By REQUEST_FOR_ARCHITECTURE_DATA_LINK = By.xpath("//*[text() = 'GitLab']");
    private static final By STORING_REQUESTS_IN_SEPARATE_FILE_LINK = By.xpath("//*[text() = '# Файл с запросом JSONata']");
    private static final By STORING_DATA_IN_SEPARATE_FILE_ELEMENT = By.xpath("//*[text() = 'Иванов Иван Иванович']");
    private static final By EXTERNAL_DATA_ELEMENT = By.xpath("//*[text() = 'Apples']");
    private static final By GENERATING_TABLE_BASED_DATA_SOURCE_LINK = By.xpath("//*[text() = 'SEAF.ArchTool/Развертывание']");
    private static final By DATA_PROCESSING_LINK = By.xpath("//*[text() = 'AsyncApi']");

    public boolean elementPredefinedDataSetIsDisplayed() {
        return elementIsDisplayed(driver, PREDEFINED_DATA_SET_ELEMENT);
    }

    public boolean elementRequestForArchitectureDataIsDisplayed() {
        return elementIsDisplayed(driver, REQUEST_FOR_ARCHITECTURE_DATA_LINK);
    }

    public boolean elementStoringRequestsInSeparateFileIsDisplayed() {
        return elementIsDisplayed(driver, STORING_REQUESTS_IN_SEPARATE_FILE_LINK);
    }

    public boolean elementExternalDataIsDisplayed() {
        return elementIsDisplayed(driver, EXTERNAL_DATA_ELEMENT);
    }

    public boolean elementGeneratingTableBasedDataSourceIsDisplayed() {
        return elementIsDisplayed(driver, GENERATING_TABLE_BASED_DATA_SOURCE_LINK);
    }

    public boolean elementStoringDataInSeparateFileIsDisplayed() {
        return elementIsDisplayed(driver, STORING_DATA_IN_SEPARATE_FILE_ELEMENT);
    }

    public boolean elementDataProcessingIsDisplayed() {
        return elementIsDisplayed(driver, DATA_PROCESSING_LINK);
    }
}
