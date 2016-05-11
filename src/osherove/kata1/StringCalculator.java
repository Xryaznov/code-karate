package osherove.kata1;

import java.util.Arrays;

/**********************************
 * http://osherove.com/tdd-kata-1 *
 **********************************/

public class StringCalculator {
    public int add(String value) {
        return value.isEmpty() ? 0 : sum(value);
    }

    private int sum(String value) {
        return Arrays.asList(toStrArray(value)).stream()
                .filter(s -> !s.isEmpty())
                .mapToInt(Integer::parseInt)
                .filter(i -> {
                    if (i < 0) {
                        throw new IllegalArgumentException("Negatives are not allowed.");
                    }
                    return true;
                })
                .filter(i -> i <= 1000)
                .sum();
    }

    private String[] toStrArray(String value) {
        if (value.startsWith("//")) {
            String delimiter = value.substring(2, 3);
            value = value.substring(3).replace(delimiter, ",");
        }
        value = value.replace("\n", ",");
        return value.split(",");
    }
}
