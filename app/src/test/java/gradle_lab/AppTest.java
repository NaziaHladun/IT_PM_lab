package gradle_lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testAdd() {
        double result = App.add(10.5, 5.2);
        assertEquals(15.7, result, 0.001);
    }

    @Test
    public void testSubtract() {
        double result = App.subtract(10.5, 5.2);
        assertEquals(5.3, result, 0.001);
    }

    @Test
    public void testMultiply() {
        double result = App.multiply(10.5, 5.2);
        assertEquals(54.6, result, 0.001);
    }

    @Test
    public void testDivide() {
        double result = App.divide(10.5, 5.2);
        assertEquals(2.019, result, 0.001);
    }

    @Test
    public void testDivideLargeNumbers() {
        double result = App.divide(1.0e100, 1.0e-100);
        assertEquals(1.0e200, result, 0.001);
    }

    @Test
    public void testDivideSmallNumbers() {
        double result = App.divide(1.0e-100, 1.0e100);
        assertEquals(0.0, result, 0.001);
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            App.divide(10.5, 0);
        });
    }
}
