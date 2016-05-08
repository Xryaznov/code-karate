package osherove.kata1;

import java.util.ArrayList;
import java.util.List;

/**********************************
 * http://osherove.com/tdd-kata-1 *
 **********************************/

public class StringCalculator {
    public int add(String str) {
        return (str.isEmpty()) ? 0 : sum(str);
    }

    private int sum(String str) {
        int res = 0;
        List<Integer> numbers = toIntList(str);

        for (Integer i : numbers) {
            if (i < 0) {
                throw new IllegalArgumentException("Negatives are not allowed");
            }
            res += i;
        }
        return res;
    }

    private List<Integer> toIntList(String str) {
        if (str.startsWith("//")) {
            String delimiter = str.substring(2, 3);
            str = str.substring(2).replace(delimiter, ",");
        }
        str = str.replace("\n", ",");
        String[] stringNumbers = str.split(",");
        List<Integer> numbers = new ArrayList<>();

        for (String s : stringNumbers) {
            if (!s.isEmpty()) {
                numbers.add(Integer.parseInt(s.trim()));
            }
        }
        return numbers;
    }
}
