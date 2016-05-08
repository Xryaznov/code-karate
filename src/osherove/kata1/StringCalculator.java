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
        int res = 0;

        int[] array = toIntArray(str);

        for (int i : array) {
            res += i;
        }
        return res;
    }

    private int[] toIntArray(String str) {
        if (str.startsWith("//")) {
            String delimiter = str.substring(2, 3);
            str = str.substring(2).replace(delimiter, ",");
        }

        String[] strArray = str.replace("\n", ",").split(",");
        int[] intArray = Arrays.stream(strArray).filter(s -> ! s.isEmpty())
                .map(String::trim)
                .mapToInt(Integer::parseInt).toArray();

        return intArray;
    }
}
