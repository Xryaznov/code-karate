package osherove.kata1;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void shouldReturnZeroOnEmptyString() throws Exception {
        assertEquals(0, new StringCalculator().add(""));
    }

    @Test
    public void shouldReturnSameValueOnOneValue() throws Exception {
        assertEquals(1, new StringCalculator().add("1"));
    }

    @Test
    public void shouldReturnSumOnSeveralValues() throws Exception {
        assertEquals(3, new StringCalculator().add("1,2"));
    }

    @Test
    public void shouldHandleNewLinesAsDelimiters() throws Exception {
        assertEquals(6, new StringCalculator().add("1\n2,3"));
    }

    @Test
    public void shouldHandleDifferentDelimiters() throws Exception {
        assertEquals(6, new StringCalculator().add("//;\n1;2;3"));
    }




}