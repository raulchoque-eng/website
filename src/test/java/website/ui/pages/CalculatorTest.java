package website.ui.pages;

import core.selenium.WebDriverManager;
import core.selenium.webdrivers.Chrome;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.testng.Assert.*;

public class CalculatorTest {
    private static WebDriver driver;
    private Calculator calculator;

    /**
     * Sets up the driver and init data.
     */
    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getInstance().getDriver();
//        driver = Chrome.getInstance().getDriver();
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
    public void testAdd() {

    }
    @Test
    public void testMadeOperationAddition() {
        calculator.madeOperationAddition(7,230);
        Assert.assertEquals("237", calculator.getResultValue());
    }

    @Test
    public void testMadeOperationSubtraction() {
    }

    @Test
    public void testMadeOperationMultiplication() {
    }

    @Test
    public void testMadeOperationDivide() {
    }
//    private static WebDriver driver;
//    private Calculator calculator;
//
//    /**
//     * Sets up the driver and init data.
//     */
//    @BeforeClass
//    public void setUp() {
//        driver = WebDriverManager.getInstance().getDriver();
//        driver.get("https://www.calculadora.org/");
//        driver.manage().window().maximize();
//        calculator = new Calculator(driver);
//    }
//
//    /**
//     * Close the driver.
//     */
//    @AfterClass
//    public static void tearDown() {
//        driver.quit();
//    }

    /**
     * Tests of addition operation.
     */
    @Test
    public void addition() {
        calculator.madeOperationAddition(7,230);
        Assert.assertEquals("237", calculator.getResultValue());
//        assertThat(calculator.getResultValue(), is("237"));
    }

//    /**
//     * Tests of subtraction operation.
//     */
//    @Test
//    public void subtraction() {
//        calculator.madeOperationSubtraction(3,2);
////        assertThat(calculator.getResultValue(), is("1"));
//    }
//
//    /**
//     * Tests of multiplication operation.
//     */
//    @Test
//    public void multiplication() {
//        calculator.madeOperationMultiplication(3,2);
////        assertThat(calculator.getResultValue(), is("6"));
//    }
//
//    /**
//     * Tests of divide operation.
//     */
//    @Test
//    public void divide() {
//        calculator.madeOperationDivide(9,3);
////        assertThat(calculator.getResultValue(), is("3"));
//    }
//
//    /**
//     * Tests of divide by zero operation.
//     */
//    @Test
//    public void divideZero() {
//        calculator.madeOperationDivide(2,0);
////        assertThat(calculator.getResultValue(), is("Infinity"));
//    }
}