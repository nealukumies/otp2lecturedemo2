package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addTest() {
        double num1 = 5.0;
        double num2 = 3.0;
        double expected = 8.0;
        double result = Calculator.add(num1, num2);
        assertEquals(expected, result, "Addition result should be correct");
    }

    @Test
    void subtractTest() {
        double num1 = 5.0;
        double num2 = 3.0;
        double expected = 2.0;
        double result = Calculator.subtract(num1, num2);
        assertEquals(expected, result, "Subtraction result should be correct");
    }

    @Test
    void divideByZeroTest() {
        double num1 = 5.0;
        double num2 = 0.0;
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(num1, num2));
    }

    @Test
    void divideTest() {
        double num1 = 6.0;
        double num2 = 3.0;
        double expected = 2.0;
        double result = Calculator.divide(num1, num2);
        assertEquals(expected, result, "Division result should be correct");
    }

    @Test
    void multiplyTest() {
        double num1 = 5.0;
        double num2 = 3.0;
        double expected = 15.0;
        double result = Calculator.multiply(num1, num2);
        assertEquals(expected, result, "Multiplication result should be correct");
    }

}