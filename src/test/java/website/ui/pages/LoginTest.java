package website.ui.pages;

import core.selenium.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTest {
    WebDriver driver;
    Login login;
    UserHome userHome;

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getInstance().getDriver();
        driver.get("https://www.website.com/sign-in/");
        driver.manage().window().maximize();
        login = new Login(driver);
        userHome = new UserHome(driver);
    }

    @AfterClass
    public void closeBrowser() {
        driver.close();
    }

    @Test
    public void testLogIn() {
        login.logIn("raulito", "r6412018!");
        Assert.assertEquals(userHome.getTitlePage(), "My Website");
    }
}
