package website.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Login class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class Login extends BasePage{

    @FindBy(id = "username")
    private WebElement userNameTxt;

    @FindBy(id = "password")
    private WebElement passwordTxt;

    @FindBy(xpath = "//button[@id='signin-submit2' or @title='Log In']")
    private WebElement logInBtn;

    public Login(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void writeUserName(String username) {
        userNameTxt.clear();
        userNameTxt.sendKeys(username);
    }

    public void writePassword(String password) {
        passwordTxt.clear();
        passwordTxt.sendKeys(password);
    }

    public void clickLogIn(){
        logInBtn.click();
    }

    public void logIn(String userName, String password) {
        writeUserName(userName);
        writePassword(password);
        clickLogIn();
    }
}
