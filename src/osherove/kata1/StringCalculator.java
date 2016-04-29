package osherove.kata1;

/**********************************
 * http://osherove.com/tdd-kata-1 *
 **********************************/

public class StringCalculator {
    public static int add(String numbers) {
        int res = 0;

        if (!numbers.isEmpty()) {

            if (numbers.startsWith("//")) {
                String delimiter = numbers.substring(2, 3);
                numbers = numbers.replace(delimiter, ",");
                add(numbers.split("\n")[1]);
            }

            numbers = numbers.replace("\n", ",");
            res = calculate(numbers, res);
        }

        return res;
    }

    private static int calculate(String numbers, int res) {
        for (String i : numbers.split(",")) {
            if (isInt(i)) {
                res += Integer.parseInt(i.trim());
            }
        }
        return res;
    }

    public static boolean isInt(String i) {
        try {
            Integer.parseInt(i.trim());
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
