package osherove.kata1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void shouldReturnZeroOnEmptyString() throws Exception {
        assertEquals(0, new StringCalculator().add(""));
    }

    @Test
    public void shouldReturnValueOnSingleValue() throws Exception {
        assertEquals(1, new StringCalculator().add("1"));
    }

    @Test
    public void shouldReturnSumOnSeveralValues() throws Exception {
        assertEquals(3, new StringCalculator().add("1,2"));
    }

    @Test
    public void shouldReturnSumOnManyValues() throws Exception {
        assertEquals(18, new StringCalculator().add("1, 10, 2, 2, 2, 1"));
    }

    @Test
    public void shouldHandleNewLines() throws Exception {
        assertEquals(6, new StringCalculator().add("1\n2,3"));
    }

    @Test
    public void shouldSupportDifferentDelimiters() throws Exception {
        assertEquals(6, new StringCalculator().add("//;\n1;2;3"));
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnNegatives() throws Exception {
        new StringCalculator().add("//;\n1;-2;3");
    }
}