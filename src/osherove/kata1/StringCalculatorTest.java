package osherove.kata1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
     // Start with the simplest test case of an empty string and move to 1 and two numbers
    @Test
    public void shouldReturnZeroOnEmptyString() {
        assertEquals(0, new StringCalculator().add(""));
    }

    @Test
    public void shouldReturnValueOnSingleNumber() {
        assertEquals(1, new StringCalculator().add("1"));
    }

    @Test
    public void shouldReturnSumOnSeveralValues() {
        assertEquals(3, new StringCalculator().add("1,2"));
    }


     /* Remember to solve things as simply as possible
     * so that you force yourself to write tests you did not think about
     * Remember to refactor after each passing test
     * Allow the Add method to handle an unknown amount of numbers
     * Allow the Add method to handle new lines between numbers (instead of commas).
     * the following input is ok:  “1\n2,3”  (will equal 6)
     * the following input is NOT ok:  “1,\n” (not need to prove it - just clarifying)
     * Support different delimiters
     * to change a delimiter, the beginning of the string will contain a separate line
     * that looks like this:   “//[delimiter]\n[numbers…]”
     * for example “//;\n1;2” should return three where the default delimiter is ‘;’ .
     * the first line is optional. all existing scenarios should still be supported
     * Calling Add with a negative number will throw an exception “negatives not allowed” -
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