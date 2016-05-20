package Das.Manjusha;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by manjushadas on 5/20/16.
 */
public class CalculatorTest {
    @Test
    public void addTest(){
        Calculator calculator = new Calculator();
        int expectedSum = 3;
        int actualSum = calculator.sum(1,2);
        Assert.assertEquals("The sum should be 3",expectedSum,actualSum);
    }

    @Test
    public void subtractTest(){
        Calculator calculator = new Calculator();
        int expectedDiff = 2;
        int actualDiff = calculator.subtract(3,1);
        Assert.assertEquals("The result of 3 minus 1 should be 2",expectedDiff,actualDiff);
    }

    @Test
    public void multiplyTest(){
        Calculator calculator = new Calculator();
        int expectedProduct = 6;
        int actualProduct= calculator.multiply(2,3);
        Assert.assertEquals("The result of 2 times 3 should be 6",expectedProduct,actualProduct);
    }

    @Test
    public void divisionTest() throws DivisionByZeroException {
        Calculator calculator = new Calculator();
        int expectedDivident = 4;
        int actualDivident = calculator.divide(8,2);
        Assert.assertEquals("The result of 8 divided by 2 should be 4",expectedDivident,actualDivident);
    }

    @Test(expected = DivisionByZeroException.class)
    public void InvalidArgumentTest() throws DivisionByZeroException{
        Calculator calculator = new Calculator();
        calculator.divide(12,0);
    }

    @Test
    public void squareRootTest() throws ComplexNumberException {
        Calculator calculator = new Calculator();
        int expectedResult = 4;
        int actualResult = calculator.squareRoot(16);
        Assert.assertEquals("The square root of 16 is 4",expectedResult,actualResult);
    }

    @Test(expected = ComplexNumberException.class)
    public void InvalidArgumentForComplexNumbersTest() throws ComplexNumberException {
        Calculator squareRootCalc = new Calculator();
        squareRootCalc.squareRoot(-1);
    }

}

