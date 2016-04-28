package codingBat.warmUp1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Or35Test {
    @Test
    public void testOr35Case1() throws Exception {
        assertTrue(new Or35().or35(3));
    }

    @Test
    public void testOr35Case2() throws Exception {
        assertTrue(new Or35().or35(10));
    }

    @Test
    public void testOr35Case3() throws Exception {
        assertFalse(new Or35().or35(8));
    }
}