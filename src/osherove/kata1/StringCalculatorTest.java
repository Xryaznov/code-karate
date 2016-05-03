package osherove.kata1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {
    private StringCalculator calc;

    @Before public void setUp() {
        calc = new StringCalculator();
    }

    @Test public void shouldReturnZero() {
        assertEquals(0, calc.add(""));
    }

    @Test public void shouldReturnValue() {
        assertEquals(1, calc.add("1"));
    }

    @Test public void shouldReturnSum() {
        assertEquals(2, calc.add("1,1"));
    }

    @Test public void shouldReturnSumOnMultipleNumbers() {
        assertEquals(10, calc.add("1,2,3,4"));
    }

    @Test public void shouldCorrectlyHandleNewLines() {
        assertEquals(6, calc.add("1\n2,3"));
    }

    @Test public void shouldSupportDifferentDelimiters() {
        assertEquals(6, calc.add("//;\n1;2;3"));
    }
}