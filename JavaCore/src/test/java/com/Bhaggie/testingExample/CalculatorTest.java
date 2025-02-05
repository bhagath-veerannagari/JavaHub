package test.java.com.Bhaggie.testingExample;

import main.java.com.bhaggie.coreBasics.coreConcepts.testingExample.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void toAddTwoNumbers() {
        Calculator underTest = new Calculator();
        var number1 = 10;
        var number2 = 20;
        var result = underTest.add(number1 + number2);
        assertEquals(30, result);
    }

    @Test
    void canHandleWhenWeInputZero() {
        Calculator underTest = new Calculator();
        var result = underTest.add(0);
        assertEquals(0, result);
    }

    @Test
    void canAddNumbersInGivenArray() {
        Calculator underTest = new Calculator();
        var numbers = new int[]{3, 2, 4};
        var result = underTest.add(numbers);
        assertEquals(9, result);
    }
}
