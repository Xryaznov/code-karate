package codingBat.warmUp1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @see <a href="http://codingbat.com/prob/p132134">http://codingbat.com/prob/p132134</a>
 *
 * Given 2 int values, return true if they are both in the range 30..40 inclusive,
 * or they are both in the range 40..50 inclusive.
 *
 * in3050(30, 31) → true
 * in3050(30, 41) → false
 * in3050(40, 50) → true
 */

public class In3050 {
    public boolean in3050(int a, int b) {
        boolean in3040inclusive = a >= 30 && a <= 40 && b >= 30 && b <= 40;
        boolean in4050inclusive = a >= 40 && a <= 50 && b >= 40 && b <= 50;
        return in3040inclusive || in4050inclusive;
    }

    @Test
    public void testCase1() {
        assertTrue(in3050(30, 31));
    }

    @Test
    public void testCase2() {
        assertFalse(in3050(30, 41));
    }

    @Test
    public void testCase3() {
        assertTrue(in3050(40, 50));
    }
}
