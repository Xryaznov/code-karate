package programmr.challenges.java;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.assertTrue;

/**
 * @see <a href=http://www.programmr.com/challenges/quadrant-angle-1>Quadrant of an Angle</a>
 * <p>
 * A very simple challenge.
 * Write a program which accepts an Integer which is an Angle and prints the Quadrant number in which it is.
 * <p>
 * For Ex.
 * 1) if user input 30 then it should print 1.
 * 2) if user input 197 then it should print 3.
 */

public class QuadrantOfAnAngle {
    public static void main(String[] args) {
        int angle;

        if (args.length == 0) {
            System.out.println("Type an integer angle (in degrees) and press Enter:");
            Scanner sc = new Scanner(System.in);
            angle = sc.nextInt();
        } else {
            angle = Integer.parseInt(args[0]);
        }

        int quadrant = angle / 90 + 1;
        System.out.println("Quadrant is: " + quadrant);
    }


    @Test
    public void shouldPrint1OnAngle30() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        QuadrantOfAnAngle.main(new String[]{"30"});

        assertTrue(out.toString().contains("Quadrant is: 1"));
        System.setOut(null);
    }

    @Test
    public void shouldPrint3OnAngle197() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        QuadrantOfAnAngle.main(new String[]{"197"});

        assertTrue(out.toString().contains("Quadrant is: 3"));
        System.setOut(null);
    }

}
