package osherove.kata1;

/**********************************
 * http://osherove.com/tdd-kata-1 *
 **********************************/

public class StringCalculator {
    public static int add(String numbers) {
        int res = 0;

        if (numbers.startsWith("//")) {
            String delimiter = numbers.substring(2, 3);
            numbers = numbers.substring(3);
            numbers = numbers.replaceAll(delimiter, ",");
            add(numbers);
        }

        if (!numbers.isEmpty()) {
            numbers = numbers.replaceAll("\n", ",");

            for (String i : numbers.split(",")) {
                if(isInt(i)) res += Integer.parseInt(i.trim());
            }
        }
        return res;
    }

    public static boolean isInt(String value) {
        try {
            Integer.parseInt(value.trim());
        }
        catch (NumberFormatException e) {
            return false;
        }
        return true;

    }
}
