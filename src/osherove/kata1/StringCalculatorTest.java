package osherove.kata1;

import org.junit.Test;

import java.util.concurrent.ExecutorService;

import static org.junit.Assert.*;
import static osherove.kata1.StringCalculator.add;
import static osherove.kata1.StringCalculator.isInt;

/**
 * Created by Eugene Gryaznov on 29/04/2016.
 */
public class StringCalculatorTest {

    @Test
    public void testCanAddEmptyString() throws Exception {
        assertEquals(0, add(""));
    }

    @Test
    public void testCanAddOneValue() throws Exception {
        assertEquals(1, add("1"));
    }

    @Test
    public void testCanAddTwoValues() throws Exception {
        assertEquals(3, add("1,2"));
        assertEquals(3, add("1, 2"));
        assertEquals(3, add(" 1, 2"));
        assertEquals(3, add(" 1, 2 "));
        assertEquals(3, add(" 1,     2 "));
    }

    @Test
    public void testCanAddManyValues() throws Exception {
        assertEquals(6, add("1, 1, 1,  1,              1, 1"));
    }

    @Test
    public void testCanHandleNewLines() throws Exception {
        assertEquals(6, add("1\n2,3"));
        assertEquals(6, add("1\n2,,,,3"));
    }

    @Test
    public void testIsInt() throws Exception {
        assertTrue(isInt("1"));
        assertFalse(isInt(" "));
        assertTrue(isInt("1 ".trim()));
    }

    @Test
    public void testCanSupportDelimiters1() throws Exception {
        assertEquals(3, add("//,\n1,2"));
    }
    @Test
    public void testCanSupportDelimiters2() throws Exception {
        assertEquals(3, add("//;\n1;2"));
    }
    @Test
    public void testCanSupportDelimiters3() throws Exception {
        assertEquals(3, add("//:\n1:2"));
    }

}