package osherove.kata1;

import java.util.Arrays;

/**********************************
 * http://osherove.com/tdd-kata-1 *
 **********************************/

public class StringCalculator {
    public static int add(String numbers) {
        int res = 0;

        if (!numbers.isEmpty() && !numbers.startsWith("//")) {
            numbers = numbers.replace("\n", ",");
            String[] split = numbers.split(",");
            try {
                for (String i : split) res += Integer.parseInt(i);
            }
            catch (NumberFormatException e) {

            }
        }

        if (numbers.startsWith("//")) {
            String delimiter = numbers.substring(2, 3);
            numbers = numbers.substring(4);
            numbers = numbers.replace(delimiter, ",");
            res = add(numbers);
        }

        return res;
    }
}
