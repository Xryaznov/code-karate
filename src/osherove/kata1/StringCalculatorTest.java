package osherove.kata1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static osherove.kata1.StringCalculator.add;

public class StringCalculatorTest {
    @Test
    public void testCanAddEmptyString() throws Exception {
        assertEquals(0, add(""));
    }

    @Test
    public void testCanAddSingleValue() throws Exception {
        assertEquals(1, add("1"));
    }

    @Test
    public void testCanAddTwoValues() throws Exception {
        assertEquals(3, add("1,2"));
    }

    @Test
    public void testCanAddManyValues() throws Exception {
        assertEquals(10 , add("1,2,3,4"));
    }

    @Test
    public void testCanHandleNewLines() throws Exception {
        assertEquals(6, add("1\n2,3"));
    }

    @Test
    public void testCanSupportSemicolonDelimiter() throws Exception {
        assertEquals(3, add("//;\n1;2"));
    }

    @Test
    public void testCanSupportColonDelimiter() throws Exception {
        assertEquals(3, add("//:\n1:2"));
    }

}
