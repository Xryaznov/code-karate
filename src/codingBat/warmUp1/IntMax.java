package codingBat.warmUp1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * Given three int values, a b c, return the largest.
 *
 * intMax(1, 2, 3) → 3
 * intMax(1, 3, 2) → 3
 * intMax(3, 2, 1) → 3
 *
 */

public class IntMax {
    public int intMax(int a, int b, int c) {
        int ab = a > b ? a : b;
        return ab > c ? ab : c;
    }

    @Test
    public void testIntMax1() {
        assertEquals(3, intMax(1, 2, 3));
    }

    @Test
    public void testIntMax2() {
        assertEquals(3, intMax(1, 3, 2));
    }

    @Test
    public void testIntMax3() {
        assertEquals(3, intMax(3, 2, 1));
    }


}
