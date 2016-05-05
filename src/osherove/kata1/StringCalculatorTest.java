package osherove.kata1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    private StringCalculator calc;

    @Before
    public void setUp() {
        calc = new StringCalculator();
    }

    @Test
    public void shouldReturnZero() {
        assertEquals(0, calc.add(""));
    }

    @Test
    public void shouldReturnInput() {
        assertEquals(1, calc.add("1"));
    }

    @Test
    public void shouldReturnSum() {
        assertEquals(3, calc.add("1,2"));
    }

    @Test
    public void shouldHandleNewLines() {
        assertEquals(6, calc.add("1\n2,3"));
    }

    @Test
    public void shouldSupportDelimiters() {
        assertEquals(3, calc.add("//;\n1;2"));
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnNegatives() {
        calc.add("-1");
    }
}