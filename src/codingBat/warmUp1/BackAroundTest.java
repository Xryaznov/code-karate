package codingBat.warmUp1;

import org.junit.Test;

import static org.junit.Assert.*;

public class BackAroundTest {
    @Test
    public void testBackAround1() throws Exception {
        String res = new BackAround().backAround("cat");
        assertEquals("tcatt", res);
    }

    @Test
    public void testBackAround2() throws Exception {
        String res = new BackAround().backAround("Hello");
        assertEquals("oHelloo", res);
    }

    @Test
    public void testBackAround3() throws Exception {
        String res = new BackAround().backAround("a");
        assertEquals("aaa", res);
    }
}