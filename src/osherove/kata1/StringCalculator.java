package osherove.kata1;

import java.util.Arrays;

public class StringCalculator {
    public int add(String numbers) {
        return numbers.isEmpty() ? 0 : sum(numbers);
    }

    private int sum(String numbers) {
        return Arrays.asList(toStrArray(numbers))
                .stream()
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .mapToInt(Integer::parseInt)
                .sum();
    }

    private String[] toStrArray(String numbers) {
        return numbers.split(",");
    }
}