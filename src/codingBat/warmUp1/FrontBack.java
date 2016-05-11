package codingBat.warmUp1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @see <a href="http://codingbat.com/prob/p123384">http://codingbat.com/prob/p123384</>
 *
 * Given a string, return a new string where the first and last chars have been exchanged.
 *
 * frontBack("code") → "eodc"
 * frontBack("a") → "a"
 * frontBack("ab") → "ba"
 */

public class FrontBack {
    public String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        }
        String mid = str.substring(1, str.length() - 1);
        return str.charAt(str.length() - 1) + mid + str.charAt(0);
    }

    @Test
    public void testFrontBack1() {
        assertEquals("eodc", frontBack("code"));
    }
    @Test
    public void testFrontBack2() {
        assertEquals("a", frontBack("a"));
    }
    @Test
    public void testFrontBack3() {
        assertEquals("ab", frontBack("ba"));
    }

}
