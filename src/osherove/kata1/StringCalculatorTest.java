package osherove.kata1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**********************************
 * http://osherove.com/tdd-kata-1 *
 **********************************/

public class StringCalculatorTest {
    //Start with the simplest test case of an empty string and move to 1 and two numbers
    @Test
    public void shouldReturnZeroOnEmptyString() {
        assertEquals(0, new StringCalculator().add(""));
    }

    @Test
    public void shouldReturnParsedValue() {
        assertEquals(1, new StringCalculator().add("1"));
    }

    @Test
    public void shouldReturnSumOnParsedValues() {
        assertEquals(4, new StringCalculator().add("1,3"));
    }

    // Allow the Add method to handle an unknown amount of numbers
    @Test
    public void shouldReturnSumOnAllParsedValues() {
        assertEquals(17, new StringCalculator().add("10,2, 5"));
    }

    // Allow the Add method to handle new lines between numbers (instead of commas).
    @Test
    public void shouldHandleNewLinesBetweenNumbers() {
        assertEquals(6, new StringCalculator().add("1\n2,3"));
    }

     /* Support different delimiters
     * to change a delimiter, the beginning of the string will contain a separate line
     * that looks like this:   “//[delimiter]\n[numbers…]”
     * for example “//;\n1;2” should return three where the default delimiter is ‘;’ .
     */
    @Test
    public void shouldSupportDifferentDelimiters() {
        assertEquals(6, new StringCalculator().add("//;\n1;2;3"));
    }

     // the first line is optional. all existing scenarios should still be supported

    @Test
    public void shouldSupportNotProperlyDeclaredDelimiters() {
        assertEquals(6, new StringCalculator().add("1$2$3"));
    }


     /* Calling Add with a negative number will throw an exception “negatives not allowed” -
     * and the negative that was passed.
     * if there are multiple negatives, show all of them in the exception message
     * stop here if you are a beginner.
     * Continue if you can finish the steps so far in less than 30 minutes.
     * Numbers bigger than 1000 should be ignored, so adding 2 + 1001  = 2
     * Delimiters can be of any length with the following format:
     * “//[delimiter]\n” for example: “//[***]\n1***2***3” should return 6
     * Allow multiple delimiters like this:
     * “//[delim1][delim2]\n” for example “//[*][%]\n1*2%3” should return 6.
     * make sure you can also handle multiple delimiters with length longer than one char
     */

}