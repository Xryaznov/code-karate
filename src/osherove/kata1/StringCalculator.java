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
        if (value.startsWith("//")) {
            String delimiter = value.substring(2, 3);
            value = normalize(normalize(value, delimiter), "//");
        }
        value = normalize(value, "\n");
        String[] values = value.split(",");
        return Arrays.asList(values).stream()
                .filter(s -> !s.isEmpty())
                .mapToInt(Integer::parseInt)
                .sum();
    }

    private String normalize(String value, String s) {
        return value.replace(s, ",");
    }

}
