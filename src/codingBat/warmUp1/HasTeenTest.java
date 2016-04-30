package codingBat.warmUp1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HasTeenTest {
    @Test
    public void testHasTeen() throws Exception {
        assertTrue(new HasTeen().hasTeen(13, 20, 10));
        assertTrue(new HasTeen().hasTeen(20, 19, 10));
        assertTrue(new HasTeen().hasTeen(20, 10, 13));
    }

    @Test
    public void testHasNotTeen() throws Exception {
        assertFalse(new HasTeen().hasTeen(22, 20, 10));
        assertFalse(new HasTeen().hasTeen(21, 26, 10));
        assertFalse(new HasTeen().hasTeen(22, 10, 39));
    }
}