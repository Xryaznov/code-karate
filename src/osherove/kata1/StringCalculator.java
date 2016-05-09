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
            String delimiter = str.substring(2, 3);
            str = str.substring(3).replace(delimiter, ",");
        }
        return Arrays.asList(str.replace("\n", ",").split(",")).stream()
                .filter(s -> !s.isEmpty())
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
