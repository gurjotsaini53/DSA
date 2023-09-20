package _Math;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        int temp = n, rev=0, rem;
        while (temp>0){
            rem = temp%10;
            rev = rev*10+rem;
            temp/=10;
        }

        System.out.println("Reverse of " + n +" is " + rev);
    }
}
