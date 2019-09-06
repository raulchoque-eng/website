package core.selenium.webdrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Firefox class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class Firefox implements Browser {

    private static Firefox firefox;
    private WebDriver driver;

    private Firefox() {
        System.setProperty("webdriver.gecko.driver", "src/main/java/core/selenium/webdrivers/driver/geckodriver");
        this.driver = new FirefoxDriver();
    }

    public static Firefox getInstance() {
        if (firefox == null) {
            firefox = new Firefox();
        }
        return firefox;
    }

    @Override
    public WebDriver getDriver() {
        return driver;
    }
}
