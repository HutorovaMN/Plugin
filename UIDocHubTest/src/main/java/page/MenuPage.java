package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage {

    private WebDriver driver;

    public MenuPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By ENTER = By.xpath("//input[@id='input-18']");
    private final By DEPLOYMENT_BUTTON = By.xpath("//*[text()=' Развертывание ']");
    private final By ADAPTIVE_META_MODEL_BUTTON = By.xpath("//*[text()=' Адаптивная метамодель ']");
    private final By ENTITY_BUTTON = By.xpath("//*[text()=' Entity ']");
    private final By METAMODEL_BUNDLE_BUTTON = By.xpath("//*[text() = ' Metamodel Bundle ']");
    private final By API_DOCHUB_BUTTON = By.xpath("//*[text() = ' API SEAF.ArchTool ']");
    private final By JSON_ATA_BUTTON = By.xpath("//*[text()=' JSONata+ ']");
    private final By ASPECTS_BUTTON = By.xpath("//*[text()=' Аспекты ']");
    private final By ASPECTS_BUTTON_2 = By.xpath("(//*[text() =' Аспекты '])[2]");
    private final By DOCS_BUTTON_2 = By.xpath("(//*[text() =' Документы '])[2]");
    private final By ASYNC_API_BUTTON = By.xpath("//*[text() =' AsyncApi ']");
    private final By MARKDOWN_BUTTON = By.xpath("//div[text() = ' Markdown ']");
    private final By MERMAID_BUTTON = By.xpath(" //div[text() = ' Mermaid ']");
    private final By NETWORK_BUTTON = By.xpath(" //div[text() = ' Network ']");
    private final By PLANT_UML_BUTTON = By.xpath(" //div[text() = ' PlantUML ']");
    private final By SMART_ANTS_BUTTON = By.xpath("//div[text() = ' SmartAnts ']");
    private final By SIMPLE_EXAMPLE_BUTTON = By.xpath("//*[text() = ' 01 Простой пример ']");
    private final By SWAGGER_BUTTON = By.xpath("//div[text() = ' Swagger ']");
    private final By CHARTS_BUTTON = By.xpath("//*[text() = ' Диаграммы ']");
    private final By TABLE_BUTTON = By.xpath("//*[text() = ' Таблицы ']");
    private final By TEMPLATES_BUTTON = By.xpath("//*[text() = ' Шаблоны ']");
    private final By ARCHITECTURE_BUTTON = By.xpath("//*[text()=' Архитектура ']");
    private final By DOCHUB_BUTTON = By.xpath("//*[text()=' SEAF.ArchTool ']");
    private final By GIT_BUTTON = By.xpath("//*[text()=' Git ']");
    private final By DEVELOP_REPO_BUTTON = By.xpath("//*[text()=' Развитие репы ']");
    private final By GITLAB_BUTTON = By.xpath("//*[text()=' GitLab ']");
    private final By GITLAB_AUTH_BUTTON = By.xpath("//*[text()=' Авторизация GitLab ']");
    private final By DATA_SOURCES_BUTTON = By.xpath("//*[text()=' Источники данных ']");
    private final By DATA_SOURCES_BUTTON_2 = By.xpath("(//*[text()=' Источники данных '])[2]");
    private final By CACHE_BUTTON = By.xpath("//*[text()=' Кэш данных ']");
    private final By MANIFEST_BUTTON = By.xpath("//div[text()=' Манифесты ']//preceding-sibling::div/button");
    private final By PARSING_MANIFEST_BUTTON = By.xpath("//div[text()=' Парсинг манифестов ']");
    private final By STORAGE_MANIFEST_BUTTON = By.xpath("//*[text()=' Хранилище манифестов ']");
    private final By NAVIGATION_BUTTON = By.xpath("//*[text()=' Навигация по архитектуре ']");
    private final By RENDERING_PUML_BUTTON = By.xpath("//*[text()=' Рендеринг PlantUML ']");
    private final By RENDERING_ASPECTS_BUTTON = By.xpath("//*[text()=' Рендеринг аспектов ']");
    private final By RENDERING_DOCS_BUTTON = By.xpath("//*[text()=' Рендеринг документов ']");
    private final By RENDERING_CONTEXT_BUTTON = By.xpath("//*[text()=' Рендеринг контекстов ']");
    private final By TECHNO_RADAR_BUTTON = By.xpath("//*[text()=' Технологический радар ']");
    private final By ARCH_CONTEXT_BUTTON = By.xpath("//*[text()=' Контексты ']");
    private final By INTERACTION_DIAGRAM_BUTTON = By.xpath("//*[text()=' Диаграмма взаимодействия ']");
    private final By COMPONENT_ARCH_BUTTON = By.xpath("//*[text()=' Компонентная архитектура ']");
    private final By CONTAINER_ARCH_BUTTON = By.xpath("//*[text()=' Контейнерная архитектура ']");
    private final By CONTEXT_SOURCES_BUTTON = By.xpath("//*[text()=' Контекст по источнику ']");
    private final By INTERACTION_BUTTON = By.xpath("//*[text()=' Взаимодействия ']");
    private final By ARTICLE_HABR_BUTTON = By.xpath("//*[text()=' Статья на Хабре ']");
    private final By DEPLOYMENT_DOCHUB_BUTTON = By.xpath("//*[text()=' Разворачивание SEAF.ArchTool ']");
    private final By USER_PATH_BUTTON = By.xpath("//*[text()=' Пользовательский путь ']");
    private final By LEARNING_BUTTON = By.xpath("//*[text()= ' Изучение документации ']");
    private final By CHECK_DEVIATIONS_BUTTON = By.xpath("//*[text()=' Проверка отклонений выявленных валидаторами ']");
    private final By COMPONENTS_BUTTON = By.xpath("//*[text()=' Компоненты ']");
    private final By CONTEXTS_BUTTON = By.xpath("(//*[text()=' Контексты '])[2]");
    private final By EXTENSION_BUTTON = By.xpath("//*[text()=' Наследование ']");
    private final By IMPORTS_BUTTON = By.xpath("//*[text() =' Импорт ']");
    private final By PLUGINS_BUTTON = By.xpath("//*[text() =' Плагины ']");
    private final By CORE_INTERFACES_BUTTON = By.xpath("//*[text() =' Интерфейсы ядра ']");
    private final By DEV_TOOL_BUTTON = By.xpath("//*[text() =' DevTool ']");
    private final By HTML_BUTTON = By.xpath(" //*[text() =' HTML ']");
    private final By SVG_BUTTON = By.xpath("//*[text() =' SVG ']");
    private final By VALIDATORS_BUTTON = By.xpath("//*[text() =' Валидаторы ']");
    private final By EXCEPTIONS_BUTTON = By.xpath("//*[text() =' Исключения ']");
    private final By TECHNOLOGIES_BUTTON = By.xpath("//*[text() =' Технологии ']");
    private final By TECH_RADAR_BUTTON = By.xpath("//*[text()=' Техрадар ']");
    private final By FUNCTIONS_BUTTON = By.xpath("//*[text()=' Функции ']");
    private final By JSONATA_BUTTON = By.xpath("//*[text()=' JSONata ']");
    private final By PROBLEMS_BUTTON = By.xpath("//*[@class='v-subheader theme--light menu-item-header error--text']");

    public void enterText(String text) {
        driver.findElement(ENTER).click();
        driver.findElement(ENTER).sendKeys(text);
    }

    public void clickDeploymentButton() {
        driver.findElement(DEPLOYMENT_BUTTON).click();
    }

    public void clickAdaptiveMetamodel() {
        driver.findElement(ADAPTIVE_META_MODEL_BUTTON).click();
    }

    public void clickEntity() {
        driver.findElement(ENTITY_BUTTON).click();
    }

    public void clickMetamodelBundle() {
        driver.findElement(METAMODEL_BUNDLE_BUTTON).click();
    }

    public void clickAPIDocHub() {
        driver.findElement(API_DOCHUB_BUTTON).click();
    }

    public void clickJSONata() {
        driver.findElement(JSON_ATA_BUTTON).click();
    }

    public void clickAspects() {
        driver.findElement(ASPECTS_BUTTON_2).click();
    }

    public void clickDocs() {
        driver.findElement(DOCS_BUTTON_2).click();
    }

    public void clickAsyncApi() {
        driver.findElement(ASYNC_API_BUTTON).click();
    }

    public void clickMarkdown() {
        driver.findElement(MARKDOWN_BUTTON).click();
    }

    public void clickMermaid() {
        driver.findElement(MERMAID_BUTTON).click();
    }

    public void clickNetwork() {
        driver.findElement(NETWORK_BUTTON).click();
    }

    public void clickPlantUML() {
        driver.findElement(PLANT_UML_BUTTON).click();
    }

    public void clickSmartAnts() {
        driver.findElement(SMART_ANTS_BUTTON).click();
    }

    public void clickSimpleExample() {
        driver.findElement(SIMPLE_EXAMPLE_BUTTON).click();
    }

    public void clickSwagger() {
        driver.findElement(SWAGGER_BUTTON).click();
    }

    public void clickCharts() {
        driver.findElement(CHARTS_BUTTON).click();
    }

    public void clickTable() {
        driver.findElement(TABLE_BUTTON).click();
    }

    public void clickTemplate() {
        driver.findElement(TEMPLATES_BUTTON).click();
    }

    public void clickArchitecture() {
        driver.findElement(ARCHITECTURE_BUTTON).click();
    }

    public void transferToAspects() {
        driver.findElement(ASPECTS_BUTTON).click();
    }

    public void transferToArchDochub() {
        driver.findElement(DOCHUB_BUTTON).click();
    }

    public void clickGit() {
        driver.findElement(GIT_BUTTON).click();
    }

    public void clickDevelopRepo() {
        driver.findElement(DEVELOP_REPO_BUTTON).click();
    }

    public void clickGitLab() {
        driver.findElement(GITLAB_BUTTON).click();
    }

    public void clickGitLabAuth() {
        driver.findElement(GITLAB_AUTH_BUTTON).click();
    }

    public void clickDocHubDataset() {
        driver.findElement(DATA_SOURCES_BUTTON).click();
    }

    public void clickCache() {
        driver.findElement(CACHE_BUTTON).click();
    }

    public void clickManifest() {
        driver.findElement(MANIFEST_BUTTON).click();
    }

    public void clickParsingManifest() {
        driver.findElement(PARSING_MANIFEST_BUTTON).click();
    }

    public void clickStorageManifest() {
        driver.findElement(STORAGE_MANIFEST_BUTTON).click();
    }

    public void clickNavigation() {
        driver.findElement(NAVIGATION_BUTTON).click();
    }

    public void clickRenderingPUML() {
        driver.findElement(RENDERING_PUML_BUTTON).click();
    }

    public void clickRenderingAspects() {
        driver.findElement(RENDERING_ASPECTS_BUTTON).click();
    }

    public void clickRenderingDocs() {
        driver.findElement(RENDERING_DOCS_BUTTON).click();
    }

    public void clickRenderingContext() {
        driver.findElement(RENDERING_CONTEXT_BUTTON).click();
    }

    public void clickTechnoRadar() {
        driver.findElement(TECHNO_RADAR_BUTTON).click();
    }

    public void clickDataSources() {
        driver.findElement(DATA_SOURCES_BUTTON_2).click();
    }

    public void clickArchContext() {
        driver.findElement(ARCH_CONTEXT_BUTTON).click();
    }

    public void clickArchDocHubContext() {
        driver.findElement(DOCHUB_BUTTON).click();
    }

    public void clickComponentArch() {
        driver.findElement(COMPONENT_ARCH_BUTTON).click();
    }

    public void clickContainerArch() {
        driver.findElement(CONTAINER_ARCH_BUTTON).click();
    }

    public void clickInteractionDiagram() {
        driver.findElement(INTERACTION_DIAGRAM_BUTTON).click();
    }

    public void clickSourcesContext() {
        driver.findElement(CONTEXT_SOURCES_BUTTON).click();
    }

    public void clickInteraction() {
        driver.findElement(INTERACTION_BUTTON).click();
    }

    public void clickArticleHabr() {
        driver.findElement(ARTICLE_HABR_BUTTON).click();
    }

    public void clickDeploymentDocHub() {
        driver.findElement(DEPLOYMENT_DOCHUB_BUTTON).click();
    }

    public void clickUserPath() {
        driver.findElement(USER_PATH_BUTTON).click();
    }

    public void clickLearningDocs() {
        driver.findElement(LEARNING_BUTTON).click();
    }

    public void clickCheckDeviation() {
        driver.findElement(CHECK_DEVIATIONS_BUTTON).click();
    }

    public void clickComponents() {
        driver.findElement(COMPONENTS_BUTTON).click();
    }

    public void clickContexts() {
        driver.findElement(CONTEXTS_BUTTON).click();
    }

    public void clickExtension() {
        driver.findElement(EXTENSION_BUTTON).click();
    }

    public void clickImports() {
        driver.findElement(IMPORTS_BUTTON).click();
    }

    public void clickPlugin() {
        driver.findElement(PLUGINS_BUTTON).click();
    }

    public void clickCoreInterfaces() {
        driver.findElement(CORE_INTERFACES_BUTTON).click();
    }

    public void clickDevTool() {
        driver.findElement(DEV_TOOL_BUTTON).click();
    }

    public void clickHTML() {
        driver.findElement(HTML_BUTTON).click();
    }

    public void clickSVG() {
        driver.findElement(SVG_BUTTON).click();
    }

    public void clickValidators() {
        driver.findElement(VALIDATORS_BUTTON).click();
    }

    public void clickExceptions() {
        driver.findElement(EXCEPTIONS_BUTTON).click();
    }

    public void clickTechnologies() {
        driver.findElement(TECHNOLOGIES_BUTTON).click();
    }

    public void clickTechRadar() {
        driver.findElement(TECH_RADAR_BUTTON).click();
    }

    public void clickFunctions() {
        driver.findElement(FUNCTIONS_BUTTON).click();
    }

    public void clickJsonAta() {
        driver.findElement(JSONATA_BUTTON).click();
    }

    public void clickProblemsButton() {
        driver.findElement(PROBLEMS_BUTTON).click();
    }
}
