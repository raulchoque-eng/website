package core.selenium.webdrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Chrome class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public final class Chrome implements Browser {

    private static Chrome chrome;
    private WebDriver driver;

    /**
     * Constructor of Chrome class.
     */
    private Chrome() {
        System.setProperty("webdriver.chrome.driver", "src/main/java/core/selenium/webdrivers/driver/chromedriver");
        this.driver = new ChromeDriver();
    }

    /**
     * Gets single instance of Chrome class.
     *
     * @return a Chrome object.
     */
    public static Chrome getInstance() {
        if (chrome == null) {
            chrome = new Chrome();
        }
        return chrome;
    }

    @Override
    public WebDriver getDriver() {
        return driver;
    }
}
