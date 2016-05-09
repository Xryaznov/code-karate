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
        if (str.startsWith("//")) {
            String del = str.substring(2, 3);
            str = str.substring(3).replace(del, ",");
        }
        return Arrays.asList(str.replace("\n", ",").split(",")).stream()
                .filter(s -> !s.isEmpty())
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .filter(i -> check(i < 0))
                .sum();
    }

    private boolean check(boolean isNegative) {
        if (isNegative) {
            throw new IllegalArgumentException("Negatives are not allowed");
        }
        return !isNegative;
    }


}
