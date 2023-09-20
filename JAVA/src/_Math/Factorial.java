package _Math;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        n= inp.nextInt();

        int fact =1;
        for (int i=1;i<=n;i++)
        {
            fact*=i;
        }

        System.out.println("Factorial of " + n + " is " + fact);
    }
}
