package _DyanamicProgramming.FibonacciSeries;

import java.util.Scanner;

public class WithTabulationBottom_up_approach {


    // in the bottom - up dynamc programming approach , we will reorganize, the order in which
    // we solve the subproblems

    // we will compute f[0] , f[1] and f[2] and so on.

    //

    // tabulation approach - not using recursion


    public static long [] table = new long[10000];
    public long getFibonacciSeries(int n)
    {
        table[0]=0;
        table[1]=1;

        for(int i=2;i<=n;i++)
        {
            table[i] = table[i-1] + table[i-2];
        }
        return table[n];
    }

    public void showResult(int n)
    {
        for (int i=0;i<=n;i++)
        {
            System.out.print(table[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        WithTabulationBottom_up_approach obj = new WithTabulationBottom_up_approach();
        System.out.println(obj.getFibonacciSeries(n));
        System.out.println("fibo series is till " + n );
        obj.showResult(n);
    }
}
