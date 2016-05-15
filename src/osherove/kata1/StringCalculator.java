package osherove.kata1;

import java.util.Arrays;

public class StringCalculator {
    public int add(String str) {
        return str.isEmpty() ? 0 : sum(str);
    }

    private int sum(String str) {
        return Arrays.asList(str.split(",")).stream()
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
