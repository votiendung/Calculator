import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    int firstOperand = 2;
    int secondOperand = 1;
    int expected = 1;

    @Test
    @DisplayName("Testing addition")
    void testCalculateAdd() {
        firstOperand  = 1;
        secondOperand = 1;
        expected = 2;

        int result = Calculator.calculate(firstOperand , secondOperand, ADDITION);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtraction")
    void testCalculateSub() {
        firstOperand = 2;
        secondOperand = 1;
        expected = 1;

        int result = Calculator.calculate(firstOperand, secondOperand, SUBTRACTION);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing multiplication")
    void testCalculateMul() {
        firstOperand = 2;
        secondOperand = 2;
        expected = 4;

        int result = Calculator.calculate(firstOperand, secondOperand, MULTIPLICATION);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division")
    void testCalculateDiv() {
        firstOperand = 6;
        int b = 3;
        char o = '/';
        expected = 2;

        int result = Calculator.calculate(firstOperand, b, o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division by zero")
    void testCalculateDivByZero() {
        firstOperand = 2;
        secondOperand = 0;
        char o = '/';

        assertThrows(RuntimeException.class,
                ()-> {Calculator.calculate(firstOperand, secondOperand, o);});
    }

    @Test
    @DisplayName("Testing wrong operator")
    void testCalculateWrongOperator() {
        firstOperand = 2;
        secondOperand = 0;
        char o = '=';

        assertThrows(RuntimeException.class,
                ()-> {Calculator.calculate(firstOperand, secondOperand, o);});
    }
}
