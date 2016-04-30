package codingBat.warmUp1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IcyHotTest {
    @Test
    public void testIcyHot1() throws Exception {
        assertTrue(new IcyHot().icyHot(120, -1));
    }

    @Test
    public void testIcyHot2() throws Exception {
        assertTrue(new IcyHot().icyHot(-1, 120));
    }

    @Test
    public void testIcyHot3() throws Exception {
        assertFalse(new IcyHot().icyHot(2, 120));
    }
}