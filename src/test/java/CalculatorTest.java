import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//comment to test

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
}
