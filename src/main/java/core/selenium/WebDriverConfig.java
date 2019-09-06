package core.selenium;

import core.selenium.utils.ReaderFile;

/**
 * WebDriverConfig class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class WebDriverConfig {

    private String nameBrowser;

    private static WebDriverConfig webDriverConfig;

    private WebDriverConfig() {
        nameBrowser = ReaderFile.getProperties().getProperty("name_browser");
    }

    public static WebDriverConfig getInstance() {
        if (webDriverConfig == null) {
            webDriverConfig = new WebDriverConfig();
        }
        return webDriverConfig;
    }

    public String getNameBrowser() {
        return nameBrowser;
    }
}
