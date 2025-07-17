package displayDocHubUITest.base;

import helpers.SingletonBrowserClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.openqa.selenium.WebDriver;
import page.*;

import java.time.Duration;

import static helpers.PathReadingClass.getPort;
import static helpers.PathReadingClass.getURL;

@Tag("UIDocHub")
public class BaseTest {

    protected WebDriver driver = SingletonBrowserClass.getInstance();
    protected MainPage mainPage = new MainPage(driver);
    protected MenuPage menuPage = new MenuPage(driver);
    protected DeploymentPage deploymentPage = new DeploymentPage(driver);
    protected AdaptiveMetaModelPage adaptiveMetaModelPage = new AdaptiveMetaModelPage(driver);
    protected EntityPage entityPage = new EntityPage(driver);
    protected MetamodelBundlePage metamodelBundlePage = new MetamodelBundlePage(driver);
    protected APIDocHubPage apiDocHubPage = new APIDocHubPage(driver);
    protected JSONataPage jsoNataPage = new JSONataPage(driver);
    protected AspectsPage aspectsPage = new AspectsPage(driver);
    protected ArchitecturePage architecturePage = new ArchitecturePage(driver);
    protected ArchAspectsPage archAspectsPage = new ArchAspectsPage(driver);
    protected DocHubArchPage docHubArchPage = new DocHubArchPage(driver);
    protected GitPage gitPage = new GitPage(driver);
    protected DevelopRepoPage developRepoPage = new DevelopRepoPage(driver);
    protected GitLabPage gitLabPage = new GitLabPage(driver);
    protected GitLabAuthPage gitLabAuthPage = new GitLabAuthPage(driver);
    protected DataSetPage dataSetPage = new DataSetPage(driver);
    protected CachePage cachePage = new CachePage(driver);
    protected ManifestPage manifestPage = new ManifestPage(driver);
    protected StorageManifestPage storageManifestPage = new StorageManifestPage(driver);
    protected ParsingManifestPage parsingManifestPage = new ParsingManifestPage(driver);
    protected NavigationPage navigationPage = new NavigationPage(driver);
    protected RenderingPUMLPage renderingPUMLPage = new RenderingPUMLPage(driver);
    protected RenderingAspectsPage renderingAspectsPage = new RenderingAspectsPage(driver);
    protected RenderingDocsPage renderingDocsPage = new RenderingDocsPage(driver);
    protected RenderingContextPage renderingContextPage = new RenderingContextPage(driver);
    protected TechnoRadarPage technoRadarPage = new TechnoRadarPage(driver);
    protected DocsPage docsPage = new DocsPage(driver);
    protected AsyncApiPage asyncApiPage = new AsyncApiPage(driver);
    protected MarkdownPage markdownPage = new MarkdownPage(driver);
    protected MermaidPage mermaidPage = new MermaidPage(driver);
    protected NetworkPage networkPage = new NetworkPage(driver);
    protected PlantUMLPage plantUMLPage = new PlantUMLPage(driver);
    protected SmartAntsPage smartAntsPage = new SmartAntsPage(driver);
    protected SimpleExamplePage simpleExamplePage = new SimpleExamplePage(driver);
    protected SwaggerPage swaggerPage = new SwaggerPage(driver);
    protected ChartsPage chartsPage = new ChartsPage(driver);
    protected TablePage tablePage = new TablePage(driver);
    protected TemplatesPage templatesPage = new TemplatesPage(driver);
    protected DataSourcesPage dataSourcesPage = new DataSourcesPage(driver);
    protected ArchContextPage archContextPage = new ArchContextPage(driver);
    protected ArchContextDocHubPage archContextDocHubPage = new ArchContextDocHubPage(driver);
    protected InteractionDiagramPage interactionDiagramPage = new InteractionDiagramPage(driver);
    protected ComponentArchPage componentArchPage = new ComponentArchPage(driver);
    protected ContainerArchPage containerArchPage = new ContainerArchPage(driver);
    protected SourceContextPage sourceContextPage = new SourceContextPage(driver);
    protected InteractionPage interactionPage = new InteractionPage(driver);
    protected DeploymentDocHubPage deploymentDocHubPage = new DeploymentDocHubPage(driver);
    protected ArticleHabrPage articleHabrPage = new ArticleHabrPage(driver);
    protected CheckDeviationPage checkDeviationPage = new CheckDeviationPage(driver);
    protected LearningDocsPage learningDocsPage = new LearningDocsPage(driver);
    protected UserPathPage userPathPage = new UserPathPage(driver);
    protected ComponentsPage componentsPage = new ComponentsPage(driver);
    protected ContextsPage contextsPage = new ContextsPage(driver);
    protected ExtensionPage extensionPage = new ExtensionPage(driver);
    protected ImportsPage importsPage = new ImportsPage(driver);
    protected PluginsPage pluginsPage = new PluginsPage(driver);
    protected CoreInterfacesPage coreInterfacesPage = new CoreInterfacesPage(driver);
    protected DevToolPage devToolPage = new DevToolPage(driver);
    protected HTMLPage htmlPage = new HTMLPage(driver);
    protected SVGPage svgPage = new SVGPage(driver);
    protected ValidatorsPage validatorsPage = new ValidatorsPage(driver);
    protected ExceptionsPage exceptionsPage = new ExceptionsPage(driver);
    protected TechnologiesPage technologiesPage = new TechnologiesPage(driver);
    protected TechRadarPage techRadarPage = new TechRadarPage(driver);
    protected FunctionsPage functionsPage = new FunctionsPage(driver);
    protected JSONataConsolePage jsoNataConsolePage = new JSONataConsolePage(driver);
    protected ProblemsPage problemsPage = new ProblemsPage(driver);

    @BeforeEach
    public void start() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // driver.get(getURL() + getPort());
        driver.get("http://10.0.0.2:8010/main");
    }
}
