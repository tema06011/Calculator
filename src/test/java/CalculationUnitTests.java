import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculationUnitTests {
    int x;
    int y;

    @Before
    public void setup() {
        x = 10;
        y = 5;
    }

    @Test
    public void testAdd() {
        int result = x + y;
        Assert.assertEquals("10 + 5 must be 15", result, CalculationUtils.add(x,y));
    }

    @Test
    public void testSub() {
        int result = x - y;
        Assert.assertEquals("10 - 5 must be 5", result, CalculationUtils.sub(x,y));
    }

    @Test
    public void testMultiplication() {
        int result = x * y;
        Assert.assertEquals("10 * 5 must be 50", result, CalculationUtils.multiplication(x,y));
    }

    @Test
    public void testDivision() {
        int result = x / y;
        Assert.assertEquals("10 / 5 must be 2", result, CalculationUtils.divide(x,y));
    }
}
