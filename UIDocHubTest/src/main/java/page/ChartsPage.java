package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementIsDisplayed;

public class ChartsPage {

    private WebDriver driver;

    public ChartsPage(WebDriver driver) {
        this.driver = driver;
    }

    private static final By APPROACH_FOR_SETTING_UP_A_CHART = By.xpath("//*[@document = 'dochub.charts.examples.common']");
    private static final By RADAR_CHART = By.xpath("//*[@document = 'dochub.charts.examples.radar']");
    private static final By BAR_CHART = By.xpath("//*[@document = 'dochub.charts.examples.bar']");
    private static final By BUBBLE_CHART = By.xpath("//*[@document = 'dochub.charts.examples.bubble']");
    private static final By RING_CHART = By.xpath("//*[@document = 'dochub.charts.examples.doughnut']");
    private static final By LINE_CHART = By.xpath("//*[@document = 'dochub.charts.examples.line']");
    private static final By PIE_CHART = By.xpath("//*[@document = 'dochub.charts.examples.pie']");
    private static final By POLAR_CHART = By.xpath("//*[@document = 'dochub.charts.examples.polararea']");
    private static final By SCATTER_CHART = By.xpath("//*[@document = 'dochub.charts.examples.scatter']");

    public boolean elementApproachForSettingUpChartIsDisplayed() {
        return elementIsDisplayed(driver, APPROACH_FOR_SETTING_UP_A_CHART);
    }

    public boolean elementRadarIsDisplayed() {
        return elementIsDisplayed(driver, RADAR_CHART);
    }

    public boolean elementBarChartIsDisplayed() {
        return elementIsDisplayed(driver, BAR_CHART);
    }

    public boolean elementBubbleChartIsDisplayed() {
        return elementIsDisplayed(driver, BUBBLE_CHART);
    }

    public boolean elementRingDiagramIsDisplayed() {
        return elementIsDisplayed(driver, RING_CHART);
    }

    public boolean elementLineChartIsDisplayed() {
        return elementIsDisplayed(driver, LINE_CHART);
    }

    public boolean elementPieChartIsDisplayed() {
        return elementIsDisplayed(driver, PIE_CHART);
    }

    public boolean elementPolarChartIsDisplayed() {
        return elementIsDisplayed(driver, POLAR_CHART);
    }

    public boolean elementScatterChartIsDisplayed() {
        return elementIsDisplayed(driver, SCATTER_CHART);
    }
}
