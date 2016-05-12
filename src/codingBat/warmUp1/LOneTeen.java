package codingBat.warmUp1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @see <a href="http://codingbat.com/prob/p165701">http://codingbat.com/prob/p165701</>
 * <p>
 * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
 * Given 2 int values, return true if one or the other is teen, but not both.
 * <p>
 * loneTeen(13, 99) → true
 * loneTeen(21, 19) → true
 * loneTeen(13, 13) → false
 */

public class LoneTeen {
    public boolean loneTeen(int a, int b) {
        boolean aIsTeen = a >= 13 && a <= 19;
        boolean bIsTeen = b >= 13 && b <= 19;
        // return (aIsTeen || bIsTeen) && !(aIsTeen && bIsTeen);
        return aIsTeen ^ bIsTeen;
    }

    @Test
    public void testLoneTeen1() {
        assertTrue(loneTeen(13, 99));
    }

    @Test
    public void testLoneTeen2() {
        assertTrue(loneTeen(21, 19));
    }

    @Test
    public void testLoneTeen3() {
        assertFalse(loneTeen(13, 13));
    }
}
