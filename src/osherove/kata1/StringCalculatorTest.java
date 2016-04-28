package osherove.kata1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    private static StringCalculator sc;

    @Before
    public void setUp() {
        sc = new StringCalculator();
    }

    @Test
    public void testCanAddEmptyString() {
        assertEquals(0, sc.add(""));
    }

    @Test
    public void testCanAddOneNumber() {
        assertEquals(1, sc.add("1"));
    }

    @Test
    public void testCanAddTwoNumbers() {
        assertEquals(3, sc.add("1,2"));
    }

    @Test
    public void testCanAddManyNumbers() {
        assertEquals(123, sc.add("1,2,4,5,111"));
    }

    @Test
    public void testCanHandleNewLines() {
        assertEquals(6, sc.add("1\n2,3"));
    }

    @Test
    public void testCanSupportDifferentDelimiters() {
        assertEquals(3, sc.add("//;\n1;2"));
    }

}