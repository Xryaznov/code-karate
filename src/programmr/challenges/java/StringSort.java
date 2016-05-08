package programmr.challenges.java;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

import static org.junit.Assert.assertEquals;

/**
 * @see <a href="http://www.programmr.com/challenges/string-sort-1">String Sort</>
 * <p>
 * Write a program which takes input as a string and sort all the alphabets in string.
 * <p>
 * Example:
 * <p>
 * 1.If user gives input "helloworld" then output string should be "dehllloorw".
 * 2. If user gives input "PROGRAMR" then output string should be "AGMOPRRR".
 */

public class StringSort {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string:\n");
        String str;
        str = br.readLine();

        //write your logic here
        str = stringSort(str);
        //end
        System.out.println("Sorted string:\n" + str);
    }

    private static String stringSort(String str) {
        ArrayList<String> strings = new ArrayList<>();
        String[] arr = str.split("");
        for (String s : arr) {
            strings.add(s);
        }
        strings.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        String res = "";
        for (String s : strings) {
            res += s;
        }
        return res;
    }

    @Test
    public void onHelloworld() {
        assertEquals("dehllloorw", stringSort("helloworld"));
    }

    @Test
    public void onProgrammr() {
        assertEquals("AGMOPRRR", stringSort("PROGRAMR"));
    }

}

