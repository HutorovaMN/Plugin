package displayDocHubUITest.uiTests;

import displayDocHubUITest.base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.Actions.getTextMessage;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MarkdownTest extends BaseTest {

    @DisplayName("testcase_133")
    @Description("Проверка отображения элементов на странице  Документы/DocHub/Руководство/Документы/Markdown")
    @Test
    public void elementsOnMarkdownIsDisplayedTest() {
        mainPage.clickMainPageButton();
        menuPage.enterText("Markdown");
        menuPage.clickMarkdown();

        assertAll(
                () -> assertTrue(markdownPage.elementValidatorIsDisplayed()
                        , getTextMessage(" Проверка отклонений выявленных валидаторами ", "Markdown")),
                () -> assertTrue(markdownPage.elementMarkdownIsDisplayed(0)
                        , getTextMessage(" именованные якоря ", "Markdown")),
                () -> assertTrue(markdownPage.elementMarkdownIsDisplayed(1)
                        , getTextMessage(" якорь “markdown” ", "Markdown")),
                () -> assertTrue(markdownPage.elementMarkdownIsDisplayed(2)
                        , getTextMessage(" Изображения ", "Markdown")),
                () -> assertTrue(markdownPage.elementCatIsDisplayed()
                        , getTextMessage(" Кот ", "Markdown")),
                () -> assertTrue(markdownPage.elementMarkdownIsDisplayed(3)
                        , getTextMessage(" ссылка Swagger  ", "Markdown")),
                () -> assertTrue(markdownPage.elementSwagerIsDisplayed()
                        , getTextMessage(" Swagger контракт ", "Markdown")),
                () -> assertTrue(markdownPage.elementMarkdownIsDisplayed(4)
                        , getTextMessage(" карточку компонента ", "Markdown")),
                () -> assertTrue(markdownPage.elementGitLabIsDisplayed()
                        , getTextMessage(" GitLab ", "Markdown")),
                () -> assertTrue(markdownPage.elementMarkdownIsDisplayed(5)
                        , getTextMessage(" архитектурный компонент   ", "Markdown")),
                () -> assertTrue(markdownPage.elementDocHubIsDisplayed()
                        , getTextMessage(" DocHub", "Markdown"))
        );
    }
}
