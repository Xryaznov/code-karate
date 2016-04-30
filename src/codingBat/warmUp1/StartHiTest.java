package codingBat.warmUp1;

import org.junit.Test;

import static org.junit.Assert.*;

public class StartHiTest {

    @Test
    public void testStartHi() throws Exception {
        assertTrue(new StartHi().startHi("hi there"));
        assertTrue(new StartHi().startHi("hi"));
        assertFalse(new StartHi().startHi("hello hi"));
    }
}