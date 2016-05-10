package osherove.kata1;

import java.util.Arrays;

/**********************************
 * http://osherove.com/tdd-kata-1 *
 **********************************/

public class StringCalculator {
    public int add(String str) {
        return str.isEmpty() ? 0 : sum(str);
    }

    private int sum(String str) {
        if (str.startsWith("//[")) {
            String delimiter = str.substring(3, str.lastIndexOf("]"));
            str = str.substring(("//" + "[]" + delimiter).length()).replace(delimiter, ",");
        }

        if (str.startsWith("//")) {
            str = str.substring(3).replace(str.substring(2, 3), ",");
        }

        String[] strArray = str.replace("\n", ",").split(",");
        return Arrays.asList(strArray).stream()
                .filter(s -> !s.isEmpty())
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .filter(i -> throwExceptionIfNegative(i))
                .filter(i -> i <= 1000)
                .sum();
    }

    private boolean throwExceptionIfNegative(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Negatives are not allowed");
        }
        return true;
    }
}
