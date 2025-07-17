package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementIsDisplayed;

public class SVGPage {

    private WebDriver driver;

    public SVGPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By ORIGINAL_TEMPLATE_ELEMENT = By.xpath("//p[contains(text() ,'Оригинальный шаблон:')]");
    private final By NAME_OF_THE_COMPONENTS_ELEMENT = By.xpath("//div[@class='svg-image']");
    private final By CODE_TEXT = By.xpath("//pre[@class= 'language-yaml']");
    private final By SVG_DOCUMENT_ELEMENT = By.xpath("//*[text() ='Результат:']//following-sibling::pre");

    public boolean elementOriginalTemplateIsDisplayed() {
        return elementIsDisplayed(driver, ORIGINAL_TEMPLATE_ELEMENT);
    }

    public boolean elementIsNameOfTheComponentsIsDisplayed() {
        return elementIsDisplayed(driver, NAME_OF_THE_COMPONENTS_ELEMENT);
    }

    public boolean elementIsTextIsDisplayed(int i) {
        return driver.findElements(CODE_TEXT).get(i).isDisplayed();
    }

    public boolean elementSVGDocumentIsDisplayed(int i) {
        return driver.findElements(SVG_DOCUMENT_ELEMENT).get(i).isDisplayed();
    }
}
