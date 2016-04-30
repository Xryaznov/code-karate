package codingBat.warmUp1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class In1020Test {
    @Test
    public void testIn1020Case1() throws Exception {
        assertTrue(new In1020().in1020(12, 99));
    }

    @Test
    public void testIn1020Case2() throws Exception {
        assertTrue(new In1020().in1020(21, 12));
    }

    @Test
    public void testIn1020Case3() throws Exception {
        assertFalse(new In1020().in1020(8, 99));
    }
}