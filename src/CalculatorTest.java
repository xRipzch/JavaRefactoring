package src;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    // Test for the add method
    @Test
    void add() {
        Calculator calculator = new Calculator();
        double result = calculator.add(1.0, 2.0);
        Assertions.assertEquals(3.0, result, 0.1);
    }

    // Test for the subtract method
    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        double result = calculator.subtract(1.0, 2.0);
        Assertions.assertEquals(-1.0, result, 0.1);
    }

    // Test for the multiply method
    @Test
    void multiply() {
        Calculator calculator = new Calculator();
        double result = calculator.multiply(1.0, 2.0);
        Assertions.assertEquals(2.0, result, 0.1);
    }

    // Test for the divide method
    @Test
    void divide() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(1.0, 2.0);
        Assertions.assertEquals(0.5, result, 0.1);
    }

    // Test for division by zero
    @Test
    void divideByZero() {
        Calculator calculator = new Calculator();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(1.0, 0.0);
        });
    }
}