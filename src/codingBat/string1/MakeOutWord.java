package codingBat.string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * http://codingbat.com/prob/p184030
 * <p>
 * Given an "out" string length 4, such as "<<>>", and a word, return
 * a new string where the word is in the middle of the out string, e.g. "<<word>>".
 * Note: use str.substring(i, j) to extract the String starting at index i
 * and going up to but not including index j.
 * <p>
 * makeOutWord("<<>>", "Yay") → "<<Yay>>"
 * makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
 * makeOutWord("[[]]", "word") → "[[word]]"
 */
public class MakeOutWord {
    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }

    @Test public void testMakeOutWordYay() {
        assertEquals("<<Yay>>", makeOutWord("<<>>", "Yay"));
    }

    @Test public void testMakeOutWordWooHoo() {
        assertEquals("<<WooHoo>>", makeOutWord("<<>>", "WooHoo"));
    }

    @Test public void testMakeOutWordWord() {
        assertEquals("[[word]]", makeOutWord("[[]]", "word"));
    }

}
