package core.selenium.webdrivers;

/**
 * FactoryBrowser class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class FactoryBrowser {

    public static Browser getTypeBrowser(String nameBrowser) {
        Browser browser;
        if ("firefox".equals(nameBrowser)) {
            browser = Firefox.getInstance();
        } else {
            browser = Chrome.getInstance();
        }
        return browser;
    }
}
