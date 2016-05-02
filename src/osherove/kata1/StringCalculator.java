package osherove.kata1;

/**********************************
 * http://osherove.com/tdd-kata-1 *
 **********************************/

public class StringCalculator {
    public static int add(String numbers) {
        int res = 0;

        if (!numbers.isEmpty() && !numbers.startsWith("//")) {
            numbers = numbers.replace("\n", ",");

            for (String str : numbers.split(",")) {
                if (!str.isEmpty()) {
                    int i = Integer.parseInt(str);

                    if (i < 0) {
                        throw new IllegalArgumentException("Negatives are not allowed: " + i);
                    }

                    res += Integer.parseInt(str);
                }
            }
        }

        if (numbers.startsWith("//")) {
            String del = numbers.substring(2, 3); // length of "//"
            numbers = numbers.substring(2).replace(del, ",");
            res = add(numbers);
        }

        return res;
    }
}
