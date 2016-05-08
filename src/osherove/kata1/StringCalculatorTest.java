package osherove.kata1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {
    private StringCalculator sc;

    @Before
    public void setUp() {
        sc = new StringCalculator();
    }

    @Test
    public void shouldReturnZero() throws Exception {
        assertEquals(0, sc.add(""));
    }

    @Test
    public void shouldReturnSameValue() throws Exception {
        assertEquals(1, sc.add("1"));
    }

    @Test
    public void shouldReturnSum() throws Exception {
        assertEquals(3, sc.add("1, 2"));
    }

    @Test
    public void shouldHandNewLines() {
        assertEquals(6, sc.add("1\n2, 3"));
    }

    @Test
    public void shouldHandDifferentDelimiters() {
        assertEquals(6, sc.add("//;\n1;2;3"));
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldFailOnNegatives() {
        sc.add("-1,2");
    }


}