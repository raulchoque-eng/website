package website.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Calculator class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class Calculator {

    WebDriver driver;

    @FindBy(name = "expr")
    WebElement resultTxt;

    @FindBy(linkText = "=" )
    WebElement equalBtn;

    /**
     * Makes the build of class Calculator.
     *
     * @param driver to find elements.
     */
    public Calculator(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     *
     * @return as String the result value of text result.
     */
    public String getResultValue() {
        equalBtn.click();
        String res = resultTxt.getAttribute("value");
        return resultTxt.getAttribute("value");
    }

    /**
     * Made the operation of Addition.
     *
     * @param firstNumber to made a addition.
     * @param secondNumber to made a addition
     */
    public void madeOperationAddition(int firstNumber, int secondNumber) {
        clickEachNumber(firstNumber);
        driver.findElement(By.linkText("+")).click();
        clickEachNumber(secondNumber);
    }

    /**
     * Made the operation of subtraction.
     *
     * @param firstNumber to made a subtraction.
     * @param secondNumber to made a subtraction
     */
    public void madeOperationSubtraction(int firstNumber, int secondNumber) {
        clickEachNumber(firstNumber);
        driver.findElement(By.linkText("-")).click();
        clickEachNumber(secondNumber);
    }

    /**
     * Made the operation of Multiplication.
     *
     * @param firstNumber to made a Multiplication.
     * @param secondNumber to made a Multiplication
     */
    public void madeOperationMultiplication(int firstNumber, int secondNumber) {
        clickEachNumber(firstNumber);
        driver.findElement(By.linkText("×")).click();
        clickEachNumber(secondNumber);
    }

    /**
     * Made the operation of Divide.
     *
     * @param firstNumber to made a Divide.
     * @param secondNumber to made a Divide
     */
    public void madeOperationDivide(int firstNumber, int secondNumber) {
        clickEachNumber(firstNumber);
        driver.findElement(By.linkText("÷")).click();
        clickEachNumber(secondNumber);
    }

    /**
     * Click a number in the Calculator UI.
     *
     * @param number for make a click action.
     */
    private void clickEachNumber(int number) {
        String numberAsString = String.valueOf(number);
        for (char num: numberAsString.toCharArray()) {
            driver.findElement(By.linkText(String.valueOf(num))).click();
        }
    }
}
