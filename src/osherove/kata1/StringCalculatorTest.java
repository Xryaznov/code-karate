package osherove.kata1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    @Test
    public void shouldReturnZeroOnEmptyString() {
        assertEquals(0, new StringCalculator().add(""));
    }

    @Test
    public void shouldParseIntegerOnSingleValueString() {
        assertEquals(1, new StringCalculator().add("1"));
        assertEquals(7, new StringCalculator().add("7"));
    }

    @Test
    public void shouldReturnSumOnCommaSeparatedValues() {
        assertEquals(3, new StringCalculator().add("1,2"));
    }

    @Test
    public void shouldHandleNewLineCharacterAsDelimiter() {
        assertEquals(6, new StringCalculator().add("1\n2,3"));
    }

    @Test
    public void shouldHandleSemicolonAsDelimiter() {
        assertEquals(6, new StringCalculator().add("//;\n1;2;3"));
    }

    @Test
    public void shouldSupportDifferentDelimiters() {
        assertEquals(6, new StringCalculator().add("//:\n1:2:3"));
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnNegativeValue() {
        new StringCalculator().add("//:\n1:-2:3");
    }

    @Test
    public void shouldIgnoreNumbersGreaterThan1000 () {
        assertEquals(2, new StringCalculator().add("2, 1001"));
    }
}