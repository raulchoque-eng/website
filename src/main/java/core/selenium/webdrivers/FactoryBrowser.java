package core.selenium.webdrivers;

/**
 * FactoryBrowser class, create a specific Browser object.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class FactoryBrowser {

    /**
     * Gets Browser with the parameter nameBrowser.
     *
     * @param nameBrowser use to create a Browser object.
     * @return a Browser object.
     */
    public static Browser getBrowser(String nameBrowser) {
        Browser browser;
        if ("firefox".equals(nameBrowser)) {
            browser = Firefox.getInstance();
        } else {
            browser = Chrome.getInstance();
        }
        return browser;
    }
}
