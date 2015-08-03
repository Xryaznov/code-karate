package solutions.bigNumbers;

import java.util.Scanner;

public class bigNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");

        String number = sc.nextLine();

        sc.close();

        for (int i = 0; i < 5; i++)
        {
            for (char c : number.toCharArray())
            {
                System.out.print(Number.returnNumber(c)[i]);
                // System.out.print(Number.returnNumber(c)[i].replace('*', c));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
