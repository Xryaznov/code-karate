package osherove.kata1;

/**********************************
 * http://osherove.com/tdd-kata-1 *
 **********************************/

public class StringCalculator {
    public int add(String numbers) {
        int res = 0;

        if (!numbers.isEmpty() && !numbers.startsWith("//")) {
            numbers = numbers.replace("\n", ",");
            String[] inputs = numbers.split(",");

            for (String i : inputs) {
                try {
                    res += Integer.parseInt(i);
                }
                catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        if (numbers.startsWith("//")) {
            String delimiter = numbers.substring(2, 3);
            numbers = numbers.replace("//", "").replace(delimiter, ",");
            res = add(numbers);
        }

        return res;
    }
}
