package _Array;

import com.sun.rowset.internal.Row;

import java.security.interfaces.DSAKey;
import java.util.Scanner;

public class RowColumnSum {

    public static int RowColumnSumFunc(int N, int q , int col , char ch)
    {
           int sum  = 0;

   if (q>col && ch=='C') return 0;
           if(ch=='R')
           {
               int first_Term_row = 1 +(q-1)*col ;
               for (int i = first_Term_row; i <=N && (i<=first_Term_row+col-1) ;i++)
            {
                sum+=i;
            }
           }
           else if (ch=='C')
           {
               for (int i=col;i<=N;i+=col)
               {
                   System.out.println(i);
                   sum+=i;
               }
           }

           return sum;

    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N = inp.nextInt();
        int col = inp.nextInt();
        int q = inp.nextInt();
        char ch = inp.next().charAt(0);
        System.out.println("Sum is " + RowColumnSumFunc(N,q,col,ch));

    }
}
