package website.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * UserHome class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class UserHome extends BasePage{
    @FindBy(css = " #manageSites > h1")
    private WebElement titlePageTxt;

    public UserHome(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getTitlePage() {
        return titlePageTxt.getText();
    }

}
