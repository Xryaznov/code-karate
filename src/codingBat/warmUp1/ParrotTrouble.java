package codingBat.warmUp1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * We have a loud talking parrot.
 * The "hour" parameter is the current hour time in the range 0..23.
 * We are in trouble if the parrot is talking and the hour is before 7 or after 20.
 * Return true if we are in trouble.
 *
 * parrotTrouble(true, 6) → true
 * parrotTrouble(true, 7) → false
 * parrotTrouble(false, 6) → false
 */

public class ParrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

    @Test
    public void parrotTroubleIfSixAndTalkingTest() {
        assertTrue(parrotTrouble(true, 6));
    }

    @Test
    public void parrotTroubleIfSevenAndTalkingTest() {
        assertFalse(parrotTrouble(true, 7));
    }

    @Test
    public void parrotTroubleIfSixAndNotTalkingTest() {
        assertFalse(parrotTrouble(false, 6));
    }


}
