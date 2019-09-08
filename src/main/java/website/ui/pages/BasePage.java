package website.ui.pages;

import org.openqa.selenium.WebDriver;

/**
 * BasePage class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class BasePage {

    private WebDriver driver;
    private String url;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
}
