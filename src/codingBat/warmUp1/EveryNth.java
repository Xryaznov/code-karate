package codingBat.warmUp1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @see <a href=http://codingbat.com/prob/p196441>http://codingbat.com/prob/p196441</a>
 * <p>
 * Given a non-empty string and an int N, return the string made starting with char 0,
 * and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
 * <p>
 * everyNth("Miracle", 2) → "Mrce"
 * everyNth("abcdefg", 2) → "aceg"
 * everyNth("abcdefg", 3) → "adg"
 */

public class EveryNth {
    public String everyNth(String str, int n) {
        String res = str.substring(0, 1);
        int caret = n;

        if (n >= 1) {
            while(caret < str.length()) {
                res += str.substring(caret, caret + 1);
                caret += n;
            }
        }
        return res;
    }

    @Test
    public void testEveryNth1() {
        assertEquals("Mrce", everyNth("Miracle", 2));
    }

    @Test
    public void testEveryNth2() {
        assertEquals("aceg", everyNth("abcdefg", 2));
    }

    @Test
    public void testEveryNth3() {
        assertEquals("adg", everyNth("abcdefg", 3));
    }
}
