package codingBat.string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * http://codingbat.com/prob/p171896
 *
 * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
 *
 * helloName("Bob") → "Hello Bob!"
 * helloName("Alice") → "Hello Alice!"
 * helloName("X") → "Hello X!"
 */

public class HelloName {
    public String helloName(String name) {
        return "Hello " + name;
    }

    @Test
    public void testHelloNameIfBob() {
        assertEquals("Hello Bob", helloName("Bob"));
    }

    @Test
    public void testHelloNameIfAlice() {
        assertEquals("Hello Alice", helloName("Alice"));
    }

    @Test
    public void testHelloNameIfX() {
        assertEquals("Hello X", helloName("X"));
    }
}
