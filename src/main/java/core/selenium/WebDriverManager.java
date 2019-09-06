package core.selenium;

import core.selenium.webdrivers.Browser;
import core.selenium.webdrivers.FactoryBrowser;
import org.openqa.selenium.WebDriver;

/**
 * WebDriverManager class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class WebDriverManager {

    private static WebDriverManager webDriverManager;
    private WebDriver driver;

    private WebDriverManager() {

        driver = createWebDriver(WebDriverConfig.getInstance().getNameBrowser());
    }

    public static WebDriverManager getInstance() {
        if (webDriverManager == null) {
            webDriverManager = new WebDriverManager();
        }
        return webDriverManager;
    }

    private WebDriver createWebDriver(String nameBrowser) {
        Browser browser = FactoryBrowser.getTypeBrowser(nameBrowser);
        return browser.getDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
