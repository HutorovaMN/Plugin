package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementIsDisplayed;

public class EditableTablesPage {
    private WebDriver driver;

    public EditableTablesPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By EDITABLE_TABLES_ELEMENT = By.xpath("//*[text() = ' Редактируемая таблица ']");
    private static final By DESCRIPTION_ELEMENT = By.xpath("//*[text() = 'Количество строк на странице']");
    private static final By HEADERS_ELEMENT = By.xpath("//*[text() = 'Позволяет отключить фильтрацию']");
    private static final By TYPE_ELEMENT = By.xpath("//*[text() = 'Вычисляемое значение']");
    private static final By SELECT_ELEMENT = By.xpath("//*[text() = '\"value\"']");
    private static final By OBJECT_ELEMENT = By.xpath("//*[contains(text(), 'architect/components/system.auth')]");
    private static final By FN_ELEMENT = By.xpath("(//*[contains(text(), '$sum :=')])[1]");
    private static final By SAVE_ELEMENT = By.xpath("//*[text() = 'path']");
    private static final By EXAMPLE_ELEMENT = By.xpath("//*[text() = '# type - Тип документа']");
    private static final By RESULT_ELEMENT = By.xpath("//*[contains(text(), ' Иванов Иван Иванович ')]");
    private static final By FIELD_ELEMENT = By.xpath("//*[text() = '# Допустимые значения: true / false']");
    private static final By MUTATION_ELEMENT = By.xpath("//*[text() = 'Содержит данные для построения таблицы']");
    private static final By DESCRIPTION_2_ELEMENT = By.xpath("//*[contains(text(), '$headers :=')]");
    private static final By RESULT_2_ELEMENT = By.xpath("//*[text() = ' 13 ']");
    private static final By TRANSFORMATION_ELEMENT = By.xpath("//*[contains(text(), 'table ~> | * |')]");

    public Boolean elementResult2IsDisplayed() {
        return elementIsDisplayed(driver, RESULT_2_ELEMENT);
    }

    public Boolean elementDescription2IsDisplayed() {
        return elementIsDisplayed(driver, DESCRIPTION_2_ELEMENT);
    }

    public Boolean elementTransformationIsDisplayed() {
        return elementIsDisplayed(driver, TRANSFORMATION_ELEMENT);
    }

    public Boolean elementResultIsDisplayed() {
        return elementIsDisplayed(driver, RESULT_ELEMENT);
    }

    public Boolean elementFieldIsDisplayed() {
        return elementIsDisplayed(driver, FIELD_ELEMENT);
    }

    public Boolean elementMutationIsDisplayed() {
        return elementIsDisplayed(driver, MUTATION_ELEMENT);
    }

    public Boolean elementDescriptionIsDisplayed() {
        return elementIsDisplayed(driver, DESCRIPTION_ELEMENT);
    }

    public Boolean elementExampleIsDisplayed() {
        return elementIsDisplayed(driver, EXAMPLE_ELEMENT);
    }

    public Boolean elementSaveIsDisplayed() {
        return elementIsDisplayed(driver, SAVE_ELEMENT);
    }

    public Boolean elementFnIsDisplayed() {
        return elementIsDisplayed(driver, FN_ELEMENT);
    }

    public Boolean elementObjectIsDisplayed() {
        return elementIsDisplayed(driver, OBJECT_ELEMENT);
    }

    public Boolean elementSelectIsDisplayed() {
        return elementIsDisplayed(driver, SELECT_ELEMENT);
    }

    public Boolean elementTypeIsDisplayed() {
        return elementIsDisplayed(driver, TYPE_ELEMENT);
    }

    public Boolean elementHeadersIsDisplayed() {
        return elementIsDisplayed(driver, HEADERS_ELEMENT);
    }

    public void clickEditableTables() {
        driver.findElement(EDITABLE_TABLES_ELEMENT).click();
    }
}
