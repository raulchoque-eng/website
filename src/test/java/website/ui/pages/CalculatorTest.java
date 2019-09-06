package website.ui.pages;

import core.selenium.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {
    private static WebDriver driver;
    private Calculator calculator;

    /**
     * Sets up the driver and init data.
     */
    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getInstance().getDriver();
        driver.get("https://www.calculadora.org/");
        driver.manage().window().maximize();
        calculator = new Calculator(driver);
    }

    /**
     * Close the driver.
     */
    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void addition() {
        calculator.madeOperationAddition(7,230);
        Assert.assertEquals("237", calculator.getResultValue());
    }

}