package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MetamodelBundleTest extends BaseTest {

    @DisplayName("testcase_128")
    @Description("Проверка отображения элементов  на  странице Metamodel Bundle")
    @Test
    public void elementsOnMetamodelBundleDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Metamodel Bundle");
        menuPage.clickMetamodelBundle();

        assertAll(
                () -> assertTrue(metamodelBundlePage.elementFileStructureOfTheBundleIsDisplayed()
                        , getTextMessage(" Файловая структура бандла ", "Metamodel Bundle")),
                () -> assertTrue(metamodelBundlePage.elementPackageManagementIsDisplayed()
                        , getTextMessage(" Управление пакетами ", "Metamodel Bundle"))
        );
    }
}
