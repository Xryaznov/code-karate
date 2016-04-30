package osherove.kata1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static osherove.kata1.StringCalculator.add;
import static osherove.kata1.StringCalculator.isInt;

public class StringCalculatorTest {

    @Test
    public void testAddEmptyValue() throws Exception {
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
    public void testAddManyValues() throws Exception {
        assertEquals(6, add("1, 2,3"));
    }

    @Test
    public void testAddCanHandleNewLines() throws Exception {
        assertEquals(6, add("1\n2,3"));
    }

    @Test
    public void testAddCanSupportDelimiters() throws Exception {
        assertEquals(3, add("//;\n1;2"));
        assertEquals(3, add("//,\n1,2"));
        assertEquals(3, add("//:\n1:2"));
    }


    @Test
    public void testIsInt() throws Exception {
        assertTrue(isInt("8"));
        assertFalse(isInt("s"));
        assertFalse(isInt("\n"));
    }
}