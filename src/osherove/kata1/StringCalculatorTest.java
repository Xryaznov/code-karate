package osherove.kata1;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {
    @Test public void shouldReturnZeroOnEmptyString() {
        assertEquals(0, new StringCalculator().add(""));
    }
    @Test public void shouldParseIntegerOnSingleValue() {
        assertEquals(1, new StringCalculator().add("1"));
    }
    @Test public void shouldReturnSumOnCommaSeparatedValues() {
        assertEquals(6, new StringCalculator().add("1,2,3"));
    }
    @Test public void shouldHandleNewLinesAsDelimiters() {
        assertEquals(6, new StringCalculator().add("1\n2,3"));
    }
    @Test public void shouldHandleSemicolonsAsDelimiters() {
        assertEquals(6, new StringCalculator().add("//;\n1;2;3"));
    }
    @Test public void shouldHandleAnyKindOfDelimiters() {
        assertEquals(6, new StringCalculator().add("//$\n1$2$3"));
    }
    @Test (expected = IllegalArgumentException.class) public void shouldThrowExceptionOnNegative() {
        assertEquals(6, new StringCalculator().add("//$\n1$-2$3"));
    }
    @Test public void shouldIgnoreNumbersGreaterThan1000() {
        assertEquals(3, new StringCalculator().add("//$\n1$2$1001"));
    }
}