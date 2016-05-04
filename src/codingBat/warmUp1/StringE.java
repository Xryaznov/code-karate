package codingBat.warmUp1;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * http://codingbat.com/prob/p173784
 *
 * Return true if the given string contains between 1 and 3 'e' chars.
 *
 * stringE("Hello") → true
 * stringE("Heelle") → true
 * stringE("Heelele") → false
 */

public class StringE {
    public boolean stringE(String str) {
        int res = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                res++;
                if (res == 4) {
                    return false;
                }
            }
        }

        return res >= 1;
    }

    @Test public void test1() {
        assertTrue(stringE("Hello"));
    }

    @Test public void test2() {
        assertTrue(stringE("Heelle"));
    }

    @Test public void test3() {
        assertFalse(stringE("Heelele"));
    }
}
