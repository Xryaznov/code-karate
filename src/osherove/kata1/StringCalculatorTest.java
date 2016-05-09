package osherove.kata1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    @Test
    public void shouldReturnZeroOnEmptyString() {
        assertEquals(0, new StringCalculator().add(""));
    }

    @Test
    public void shouldReturnValueOnSingleValue() {
        assertEquals(1, new StringCalculator().add("1"));
    }

    @Test
    public void shouldReturnSumOnTwoValues() {
        assertEquals(3, new StringCalculator().add("1,2"));
    }

    @Test
    public void shouldReturnSumOnSeveralValues() {
        assertEquals(198290, new StringCalculator().add("1,2,3,4,198280"));
    }

    @Test
    public void shouldProperlyHandleNewLines() {
        assertEquals(6, new StringCalculator().add("1\n2,3"));
    }

    @Test
    public void shouldSupportSemicolonAsDelimiters() {
        assertEquals(6, new StringCalculator().add("//;\n1;2;3"));
    }

    @Test
    public void shouldSupportAnyDelimiter() {
        assertEquals(6, new StringCalculator().add("//$\n1$2$3"));
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnNegatives() {
        new StringCalculator().add("//$\n1$-2$3");
    }




}