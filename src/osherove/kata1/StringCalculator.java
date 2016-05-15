package osherove.kata1;

import java.util.Arrays;

class StringCalculator {
    int add(String str) {
        return str.isEmpty() ? 0 : sum(str);
    }

    private int sum(String str) {
        if (str.startsWith("//")) {
            str = str.substring(2);
        }
        str = str.replaceAll("\\D", ",");
        String[] arr = str.split(",");
        return Arrays.asList(arr).stream()
                .filter(s -> !s.isEmpty())
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
