package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementIsDisplayed;

public class MarkdownPage {

    private WebDriver driver;

    public MarkdownPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By CHECKING_FOR_DEVIATIONS_DETECTED_BY_VALIDATORS_ELEMENT = By.xpath("//*[text() = 'Проверка отклонений выявленных валидаторами']/ancestor-or-self::div[@class ='plantuml-place']");
    private final By MARKDOWN_ELEMENT = By.xpath("//*[text() = 'Позволяет создавать именованные якоря для “коротких” ссылок внутри документа. Например, код:']/following-sibling::pre");
    private final By CAT_ELEMENT = By.xpath("//img[@style = 'max-width: 100%;']");
    private final By SWAGER_ELEMENT = By.xpath("//a[@href = '/docs/dochub.example.swgr']");
    private final By GIT_LAB_ELEMENT = By.xpath("(//div[@class='dochub-object'])[9]");
    private final By DOCHUB_ELEMENT = By.xpath("//*[@class= 'mkr-grid-row']");

    public Boolean elementValidatorIsDisplayed() {
        return elementIsDisplayed(driver, CHECKING_FOR_DEVIATIONS_DETECTED_BY_VALIDATORS_ELEMENT);
    }

    public Boolean elementMarkdownIsDisplayed(int i) {
        return driver.findElements(MARKDOWN_ELEMENT).get(i).isDisplayed();
    }

    public Boolean elementCatIsDisplayed() {
        return elementIsDisplayed(driver, CAT_ELEMENT);
    }

    public Boolean elementSwagerIsDisplayed() {
        return elementIsDisplayed(driver, SWAGER_ELEMENT);
    }

    public Boolean elementGitLabIsDisplayed() {
        return elementIsDisplayed(driver, GIT_LAB_ELEMENT);
    }

    public Boolean elementDocHubIsDisplayed() {
        return elementIsDisplayed(driver, DOCHUB_ELEMENT);
    }
}
