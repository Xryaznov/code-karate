package codingBat.warmUp1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NearHundredTest {

    @Test
    public void testNearHundred93() throws Exception {
        NearHundred nh = new NearHundred();
        assertTrue(nh.nearHundred(93));
    }

    @Test
    public void testNearHundred89() throws Exception {
        NearHundred nh = new NearHundred();
        assertFalse(nh.nearHundred(89));
    }

    @Test
    public void testNearHundred111() throws Exception {
        NearHundred nh = new NearHundred();
        assertFalse(nh.nearHundred(111));
    }

    @Test
    public void testNearHundred210() throws Exception {
        NearHundred nh = new NearHundred();
        assertTrue(nh.nearHundred(210));
    }

    @Test
    public void testNearHundred211() throws Exception {
        NearHundred nh = new NearHundred();
        assertFalse(nh.nearHundred(211));
    }

    @Test
    public void testNearHundred290() throws Exception {
        NearHundred nh = new NearHundred();
        assertFalse(nh.nearHundred(290));
    }

    @Test
    public void testNearHundred190() throws Exception {
        NearHundred nh = new NearHundred();
        assertTrue(nh.nearHundred(190));
    }
}