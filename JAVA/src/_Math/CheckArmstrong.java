package _Math;

import java.util.Scanner;

public class CheckArmstrong {


    public static int countDigit (int n)
    {
        int temp =n, count=0;
        while(temp>0)
        {
            temp=temp/10;
            count ++;
        }
        return  count;
    }
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);

        n =  inp.nextInt();
        int digitCount=countDigit(n);
        int temp = n, x=0, rem ;

        while (temp>0)
        {
            rem = temp%10;
            x+=Math.pow(rem,digitCount);
            temp/=10;
        }

        if(n==x) System.out.println(n + " is a armstrong number");
        else System.out.println(n + " is not a armstrong number ");

    }
}
