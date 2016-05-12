package osherove.kata1;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {
    @Test
    public void shouldReturnZeroOnEmptyString() {
        assertEquals(0, new StringCalculator().add(""));
    }

    @Test
    public void shouldParseIntegerOnSingleValue() {
        assertEquals(7, new StringCalculator().add("7"));
    }

    @Test
    public void shouldReturnSumOnSeveralValues() {
        assertEquals(17, new StringCalculator().add("10,7"));
    }

    @Test
    public void shouldHandleNewLinesCorrectly() {
        assertEquals(18, new StringCalculator().add("10\n1,7"));
    }

    @Test
    public void shouldSupportDifferentDelimiters() {
        assertEquals(18, new StringCalculator().add("//;\n10;1;7"));
    }

}