package codingBat.warmUp1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * http://codingbat.com/prob/p172021
 *
 * Given 2 int values, return whichever value is nearest to the value 10,
 * or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
 *
 * close10(8, 13) → 8
 * close10(13, 8) → 8
 * close10(13, 7) → 0
 */

public class Close10 {
    public int close10(int a, int b) {
        int delta1 = Math.abs(10 - a);
        int delta2 = Math.abs(10 - b);
        return delta1 == delta2 ? 0 :
                delta1 < delta2 ? a : b;
    }

    @Test
    public void test1() {
        assertEquals(8, close10(8, 13));
    }

    @Test
    public void test2() {
        assertEquals(8, close10(13, 8));
    }

    @Test
    public void test3() {
        assertEquals(0, close10(13, 7));
    }
}
