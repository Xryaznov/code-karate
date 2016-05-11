package codingBat.warmUp1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @see <a href="http://codingbat.com/prob/p159227">http://codingbat.com/prob/p159227</a>
 * <p>
 * Given 2 int values, return true if one is negative and one is positive.
 * Except if the parameter "negative" is true, then return true only if both are negative.
 * <p>
 * posNeg(1, -1, false) → true
 * posNeg(-1, 1, false) → true
 * posNeg(-4, -5, true) → true
 */

public class PosNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return a < 0 && b < 0;
        } else {
            return (a < 0 && b > 0) || (a > 0 && b < 0);
        }
    }

    @Test
    public void testPosNeg1() {
        assertTrue(posNeg(1, -1, false));
    }

    @Test
    public void testPosNeg2() {
        assertTrue(posNeg(-1, 1, false));
    }

    @Test
    public void testPosNeg3() {
        assertTrue(posNeg(-4, -5, true));
    }

    @Test
    public void testPosNeg4() {
        assertFalse(posNeg(-1, -1, false));
    }

    @Test
    public void testPosNeg5() {
        assertFalse(posNeg(-4, 5, true));
    }

    @Test

    public void testPosNeg6() {
        assertFalse(posNeg(1, 1, false));
    }

}
