package osherove.kata1;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void testAddSimpleCases() throws Exception {
        // given
        StringCalculator sc = new StringCalculator();

        // when
        int res1 = sc.add("1");
        int res2 = sc.add("1", "2");
        int res3 = sc.add("0", "0");
        int res4 = sc.add("");
        int res5 = sc.add("", "");
        int res6 = sc.add("64", "-2");

        // then
        assertEquals(1, res1);
        assertEquals(3, res2);
        assertEquals(0, res3);
        assertEquals(0, res4);
        assertEquals(0, res5);
        assertEquals(62, res6);
    }

    @Test
    public void testAddSeparators() throws Exception {
        // given
        StringCalculator sc = new StringCalculator();

        // when
        int res1 = sc.add("1\n2,3");

        // then
        assertEquals(6, res1);
    }
}