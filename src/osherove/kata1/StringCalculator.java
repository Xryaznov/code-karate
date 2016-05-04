package osherove.kata1;

import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**********************************
 * http://osherove.com/tdd-kata-1 *
 **********************************/

public class StringCalculator {
    public int add(String str) {
        return str.isEmpty() ? 0 : sum(toIntList(str));
    }

    private List<Integer> toIntList(String str) {
        List<Integer> integers = new ArrayList();

        str = str.replace("\n", ",");

        String[] arr = str.split(",");

        for (String s : arr) {
            if (!s.isEmpty()) {
                integers.add(Integer.parseInt(s));
            }
        }

        return integers;
    }

    private int sum(List<Integer> integers) {

        int res = 0;

        for (int i : integers) {
                res += i;
            }
        return res;
    }


}
