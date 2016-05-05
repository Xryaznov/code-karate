package osherove.kata1;

/**********************************
 * http://osherove.com/tdd-kata-1 *
 **********************************/

public class StringCalculator {
    public int add(String str) {
        return str.isEmpty() ? 0 : sum(toIntArray(str));
    }

    private int sum(int[] intArray) {
        int res = 0;
        for (int number : intArray) {
            if (number < 0) {
                throw new IllegalArgumentException("Negatives are not allowed");
            }
            res += number;
        }

        return res;
    }

    private int[] toIntArray(String str) {
        if (str.startsWith("//")) {
            String delimiter = str.substring(2, 3);
            str = str.substring(2).replace(delimiter, ",");
        }

        str = str.replace("\n", ",");
        String[] strArray = str.split(",");

        int[] intArray = new int[strArray.length];

        for (int i = 0; i < strArray.length; i++) {
            if (!strArray[i].isEmpty()) {
                intArray[i] = Integer.parseInt(strArray[i]);
            }
        }

        return intArray;
    }
}
