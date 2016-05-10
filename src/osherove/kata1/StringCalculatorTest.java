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
        assertEquals(10, new StringCalculator().add("1,2,3,4"));
    }

    @Test
    public void shouldProperlyHandleNewLines() {
        assertEquals(6, new StringCalculator().add("1\n2,3"));
    }

    @Test
    public void shouldHandleSemiColonsAsDelimiters() {
        assertEquals(6, new StringCalculator().add("//;\n1;2;3"));
    }

    @Test
    public void shouldSupportAnyDelimiters() {
        assertEquals(6, new StringCalculator().add("//$\n1$2$3"));
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnNegatives() {
        new StringCalculator().add("//$\n1$-2$3");
    }

    @Test
    public void shouldIgnoreNumbersBiggerThan1000() {
        assertEquals(2, new StringCalculator().add("2, 1001"));
    }

    @Test
    public void shouldSupportDelimitersOfAnyLength() {
        assertEquals(6, new StringCalculator().add("//[***]\n1***2***3"));
    }

}