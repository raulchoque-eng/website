package core.selenium.webdrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Chrome class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class Chrome implements Browser {

    private static Chrome chrome;
    private WebDriver driver;

    private Chrome(){
        System.setProperty("webdriver.chrome.driver", "src/main/java/core/selenium/webdrivers/driver/chromedriver");
        this.driver = new ChromeDriver();
    }

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
