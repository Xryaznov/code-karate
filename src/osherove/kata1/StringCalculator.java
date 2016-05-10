package osherove.kata1;

import java.util.Arrays;

/**********************************
 * http://osherove.com/tdd-kata-1 *
 **********************************/

public class StringCalculator {
    public int add(String str) {
        return str.isEmpty() ? 0: sum(str);
    }

    private int sum(String str) {
        String[] strArray = toStrArray(str);
        return Arrays.asList(strArray).stream()
                .filter(s -> !s.isEmpty())
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .filter(i -> isGreaterThanZero(i))
                .filter(i -> i <= 1000)
                .sum();
    }

    private boolean isGreaterThanZero(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Negatives aren't allowed.");
        }
        return true;
    }

    private String[] toStrArray(String str) {
        if (str.startsWith("//")) {
            String delimiter = str.substring(2, 3);
            str = str.substring(3).replace(delimiter, ",");
        }
        return str.replace("\n", ",").split(",");
    }
}
