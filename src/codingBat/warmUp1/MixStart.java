package codingBat.warmUp1;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class MixStart {
    /**
     * Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
     *
     * mixStart("mix snacks") → true
     * mixStart("pix snacks") → true
     * mixStart("piz snacks") → false
     */

    public boolean mixStart(String str) {
        if (str.split(" ")[0].endsWith("ix")) {
            return true;
        }
        return false;
    }

    @Test
    public void testMixStart() throws Exception {
        assertTrue(mixStart("mix snacks"));
        assertTrue(mixStart("pix snacks"));
        assertFalse(mixStart("piz snacks"));
    }
}
