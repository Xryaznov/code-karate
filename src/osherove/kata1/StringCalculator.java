package osherove.kata1;

import java.util.ArrayList;
import java.util.List;

/**********************************
 * http://osherove.com/tdd-kata-1 *
 **********************************/

public class StringCalculator {
    public int add(String numbers) {
        return numbers.isEmpty() ? 0 : sum(toInt(numbers));
    }

    private List<Integer> toInt(String numbers) {
        if (numbers.startsWith("//")) {
            String del = numbers.substring(2, 3);
            numbers = numbers.replace("//", "").replace(del, ",");
        }
        numbers = numbers.replace("\n", ",");

        List<Integer> integers = new ArrayList<>();

        for (String s : numbers.split(",")) {
                if (!s.isEmpty()) {
                    integers.add(Integer.parseInt(s));
                }
        }

        return integers;
    }

    private int sum(List<Integer> integers) {
        int res = 0;

        for (int i: integers) {
            res += i;
        }

        return res;
    }


}
