package programmr.challenges.java;

import org.junit.Test;

import java.util.Scanner;

/**
 * @see <a href=http://www.programmr.com/challenges/quadrant-angle-1>Quadrant of an Angle</a>
 * <p>
 * A very simple challenge.
 * Write a program which accepts an Integer which is an Angle and prints the Quadrant number in which it is.
 * For Ex.
 * 1) if user input 30 then it should print 1.
 * 2) if user input 197 then it should print 3.
 */

public class QuadrantOfAnAngle {
    public static void main(String[] args) {
        int angle;
        System.out.println("Type an integer angle (in degrees) and press Enter:");
        Scanner sc = new Scanner(System.in);
        angle = sc.nextInt();
        int quadrant = angle / 90 + 1;
        System.out.println("Quadrant is:" + quadrant);
    }


    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }

}
