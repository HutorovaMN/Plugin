package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SVGTest extends BaseTest {

    @DisplayName("testcase_157")
    @Description("Проверка элемента во вкладке Документы/Руководство/Плагины/Примеры/SVG")
    @Test
    public void elementsOnSVGIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("SVG");
        menuPage.clickSVG();

        assertAll(
                () -> assertTrue(svgPage.elementOriginalTemplateIsDisplayed()
                        , getTextMessage("Оригинальный шаблон", " SVG")),
                () -> assertTrue(svgPage.elementIsNameOfTheComponentsIsDisplayed()
                        , getTextMessage("Annotation", "  SVG ")),
                () -> assertTrue(svgPage.elementIsTextIsDisplayed(0)
                        , getTextMessage("dochub.plugins.svg_file:", " SVG ")),
                () -> assertTrue(svgPage.elementIsTextIsDisplayed(1)
                        , getTextMessage("dochub.plugins.svg_file_error:I", "SVG")),
                () -> assertTrue(svgPage.elementSVGDocumentIsDisplayed(0)
                        , getTextMessage("![svg-документ](@document/dochub.plugins.svg_file)", "SVG ")),
                () -> assertTrue(svgPage.elementSVGDocumentIsDisplayed(2)
                        , getTextMessage("![svg-документ](@document/dochub.plugins.svg_file_error?check=1)", "SVG "))
        );
    }
}
