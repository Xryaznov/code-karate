package codingBat.warmUp1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MissingCharTest {
    @Test
    public void testMissingChar1() throws Exception {
        String res = new MissingChar().missingChar("kitten", 1);
        assertEquals("ktten", res);
    }

    @Test
    public void testMissingChar2() throws Exception {
        String res = new MissingChar().missingChar("kitten", 0);
        assertEquals("itten", res);
    }

    @Test
    public void testMissingChar3() throws Exception {
        String res = new MissingChar().missingChar("kitten", 4);
        assertEquals("kittn", res);
    }
}