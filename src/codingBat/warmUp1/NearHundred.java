package codingBat.warmUp1;

/**
 * Given an int n, return true if it is within 10 of 100 or 200.
 * Note: Math.abs(num) computes the absolute value of a number.
 */

public class NearHundred {
    public boolean nearHundred(int n) {
        if (n > 210) {
            return false;
        }

        if (n < 90) {
            return false;
        }

        int rem = n % 100;
        return rem <= 10 || rem >= 90;
    }
}
