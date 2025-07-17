package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementIsDisplayed;


public class MetamodelBundlePage {

    private WebDriver driver;

    public MetamodelBundlePage(WebDriver driver) {
        this.driver = driver;
    }

    private final By FILE_STRUCTURE_OF_THE_BUNDLE = By.xpath("//*[@id = 'управление-пакетами']//preceding-sibling::pre");

    private final By PACKAGE_MANAGEMENT = By.xpath("//*[contains(text() , '<идентификатор_пакета>:')]");

    public Boolean elementFileStructureOfTheBundleIsDisplayed() {
        return elementIsDisplayed(driver, FILE_STRUCTURE_OF_THE_BUNDLE);
    }

    public Boolean elementPackageManagementIsDisplayed() {
        return elementIsDisplayed(driver, PACKAGE_MANAGEMENT);
    }
}
