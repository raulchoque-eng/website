package core.selenium.webdrivers;

import org.openqa.selenium.WebDriver;

/**
 * Browser interface.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public interface Browser {

    /**
     * Gets a WebDriver specific.
     *
     * @return as WebDriver.
     */
    WebDriver getDriver();
}