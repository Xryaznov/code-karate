package osherove.kata1;

import org.junit.Test;

import static org.junit.Assert.*;
import static osherove.kata1.StringCalculator.add;

public class StringCalculatorTest {

    @Test
    public void testAddEmptyString() throws Exception {
        assertEquals(0, add(""));
    }

    @Test
    public void testAddOneValue() throws Exception {
        assertEquals(1, add("1"));
    }

    @Test
    public void testAddTwoValues() throws Exception {
        assertEquals(3, add("1,2"));
    }

    @Test
    public void testUnknownAmountOfValues() throws Exception {
        assertEquals(10, add("1,2,3,4"));
    }

    @Test
    public void testAddCanHandleNewLines() throws Exception {
        assertEquals(6, add("1\n2,3"));
    }

    @Test
    public void testAddCanSupportDelimiters() throws Exception {
        assertEquals(3, add("//;\n1;2"));
    }

    @Test
    public void testAddCanAddNegatives1() throws Exception {
        try {
            add("-1");
            fail("should throw and exception");
        }
        catch (IllegalArgumentException e) {

        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddCanAddNegatives2() throws Exception {
        add("-1");
    }


}