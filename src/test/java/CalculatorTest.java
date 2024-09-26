import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Main calculator;

    @Before
    public void setUp() {
        calculator = new Main();
    }

    @Test
    public void test_add() {
        double a = 3;
        double b = 7;
        double expectedResult = 10;
        double result = calculator.add(a, b);
        Assert.assertEquals(expectedResult, result, 0.001);
    }

    @Test
    public void test_subt() {
        double a = 10;
        double b = 4;
        double expectedResult = 6;
        double result = calculator.subt(a, b);
        Assert.assertEquals(expectedResult, result, 0.001);
    }

    @Test
    public void test_mul() {
        double a = 5;
        double b = 6;
        double expectedResult = 30;
        double result = calculator.mul(a, b);
        Assert.assertEquals(expectedResult, result, 0.001);
    }

    // Test for Square Root function
    @Test
    public void test_sqrt() {
        double a = 16;
        double expectedResult = 4;
        double result = calculator.sqrt(a);
        Assert.assertEquals(expectedResult, result, 0.001);
    }

    // Test for Factorial function
    @Test
    public void test_factorial() {
        int a = 5;
        long expectedResult = 120;
        long result = calculator.factorial(a);
        Assert.assertEquals(expectedResult, result);
    }

    // Test for Natural Logarithm (ln) function
    @Test
    public void test_ln() {
        double a = Math.E;  // ln(e) should be 1
        double expectedResult = 1;
        double result = calculator.ln(a);
        Assert.assertEquals(expectedResult, result, 0.001);
    }

    // Test for Power function
    @Test
    public void test_power() {
        double base = 2;
        double exponent = 3;
        double expectedResult = 8;  // 2^3 = 8
        double result = calculator.power(base, exponent);
        Assert.assertEquals(expectedResult, result, 0.001);
    }
}
