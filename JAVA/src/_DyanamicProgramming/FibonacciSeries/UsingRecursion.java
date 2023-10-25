package _DyanamicProgramming.FibonacciSeries;

import java.util.Scanner;

public class UsingRecursion {

    public static  long fibo(int n)
    {
        if(n<=1) return n;
       return fibo(n-2)+ fibo(n-1);
    }


    // for larger value of n all calculations will take more time
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        System.out.println(fibo(n));


    }
}
