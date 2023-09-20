package _Math;

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        n=inp.nextInt();
        int temp =n, count=0;
        while(temp>0)
        {
            temp=temp/10;
            count ++;
        }
        System.out.println("Digits in "+  n + " is " + count);
    }
}
