package osherove.kata1;

import java.util.Arrays;

public class StringCalculator {
    int add(String... numbers) {
        int res = 0;

        if (numbers.length == 1) {
            String newString = numbers[0].replace("\n", ",");
            return addNumbers(res, newString.split(","));
        }

        res = addNumbers(res, numbers);
        return res;
    }

    private int addNumbers(int res, String[] numbers) {
        for (String s : numbers) {

            if (s.isEmpty()) {
                continue;
            }

            res += Integer.parseInt(s);
        }
        return res;
    }
}
