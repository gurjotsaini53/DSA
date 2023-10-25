package _DyanamicProgramming.FibonacciSeries;

import java.util.Scanner;



public class usingLoop {


    public static  long fibo(int n)
    {
        if(n<=1) return n;
      long  first =0,second=1, sum=0;

        for (int i=2;i<=n;i++)
        {
            sum=first+second;
            first=second;
            second=sum;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        System.out.println(fibo(n));


    }
}
