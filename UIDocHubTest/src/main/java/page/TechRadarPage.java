package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Actions.elementToBeClickableAndDisplayed;

public class TechRadarPage {

    private WebDriver driver;

    public TechRadarPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By ONE_BUTTON = By.xpath("//*[text() = '1']");
    private final By TWO_BUTTON = By.xpath("//*[text() = '2']");
    private final By THREE_BUTTON = By.xpath("//*[text() = '3']");
    private final By FOUR_BUTTON = By.xpath("//*[text() = '4']");
    private final By FIVE_BUTTON = By.xpath("//*[text() = '5']");
    private final By SIX_BUTTON = By.xpath("//*[text() = '6']");
    private final By SEVEN_BUTTON = By.xpath("//*[text() = '7']");
    private final By EIGHT_BUTTON = By.xpath("//*[text() = '8']");
    private final By NINE_BUTTON = By.xpath("//*[text() = '9']");
    private final By TEN_BUTTON = By.xpath("//*[text() = '10']");
    private final By ELEVEN_BUTTON = By.xpath("//*[text() = '11']");
    private final By TWELVE_BUTTON = By.xpath("//*[text() = '12']");
    private final By THIRTEEN_BUTTON = By.xpath("//*[text() = '13']");
    private final By FOURTEEN_BUTTON = By.xpath("//*[text() = '14']");
    private final By FIFTEEN_BUTTON = By.xpath("//*[text() = '15']");

    public boolean elementOneIsDisplayed(int i) {
        return driver.findElements(ONE_BUTTON).get(i).isDisplayed();
    }

    public boolean elementTwoIsDisplayed(int i) {
        return driver.findElements(TWO_BUTTON).get(i).isDisplayed();
    }

    public boolean elementThreeIsDisplayed(int i) {
        return driver.findElements(THREE_BUTTON).get(i).isDisplayed();
    }

    public boolean elementFourIsDisplayed(int i) {
        return driver.findElements(FOUR_BUTTON).get(i).isDisplayed();
    }

    public boolean elementFiveIsDisplayedAndClickable() {
        return elementToBeClickableAndDisplayed(driver, FIVE_BUTTON);
    }

    public boolean elementSixIsDisplayedAndClickable() {
        return elementToBeClickableAndDisplayed(driver, SIX_BUTTON);
    }

    public boolean elementSevenIsDisplayedAndClickable() {
        return elementToBeClickableAndDisplayed(driver, SEVEN_BUTTON);
    }

    public boolean elementEightIsDisplayedAndClickable() {
        return elementToBeClickableAndDisplayed(driver, EIGHT_BUTTON);
    }

    public boolean elementNineIsDisplayedAndClickable() {
        return elementToBeClickableAndDisplayed(driver, NINE_BUTTON);
    }

    public boolean elementTenIsDisplayedAndClickable() {
        return elementToBeClickableAndDisplayed(driver, TEN_BUTTON);
    }

    public boolean elementElevenIsDisplayedAndClickable() {
        return elementToBeClickableAndDisplayed(driver, ELEVEN_BUTTON);
    }

    public boolean elementTwelveIsDisplayedAndClickable() {
        return elementToBeClickableAndDisplayed(driver, TWELVE_BUTTON);
    }

    public boolean elementThirteenIsDisplayedAndClickable() {
        return elementToBeClickableAndDisplayed(driver, THIRTEEN_BUTTON);
    }

    public boolean elementFourteenIsDisplayedAndClickable() {
        return elementToBeClickableAndDisplayed(driver, FOURTEEN_BUTTON);
    }

    public boolean elementFifteenIsDisplayedAndClickable() {
        return elementToBeClickableAndDisplayed(driver, FIFTEEN_BUTTON);
    }
}
