package core.selenium;

import core.selenium.utils.ReaderFile;

/**
 * WebDriverConfig class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public final class WebDriverConfig {

    private String nameBrowser;

    private static WebDriverConfig webDriverConfig;

    /**
     * Constructor of WebDriverConfig class.
     */
    private WebDriverConfig() {

        nameBrowser = ReaderFile.getInstance().
                getProperty(ProjectProperties.BROWSER_NAME.getBrowserName());
    }

    /**
     * Gets single instance of WebDriverConfig class.
     *
     * @return a WebDriverConfig object.
     */
    public static WebDriverConfig getInstance() {
        if (webDriverConfig == null) {
            webDriverConfig = new WebDriverConfig();
        }
        return webDriverConfig;
    }

    /**
     * Gets nameBrowser attribute of this class.
     *
     * @return as String the nameBrowser attribute of this class.
     */
    public String getNameBrowser() {
        return nameBrowser;
    }
}
