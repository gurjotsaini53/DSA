package _Math;

import javax.sql.rowset.spi.SyncResolver;
import java.util.Scanner;


class LcmOfTwoNumbers {

    private int a,b,ans;
    LcmOfTwoNumbers(int x, int y)
    {
        this.a=x;
        this.b=y;
    }
    public int LCM()
    {
        ans = 1;
           int max = (a>b) ? a:b;
             for (int i=1;i<=max;i++)
             {
                 if (a%i==0 && b%i==0)
                 {
                     ans  =  i ;
                 }
             }
             return ans;
    }

}
public class LCM {


    public static  void main(String [] args)
    {
        Scanner inp = new Scanner(System.in);

        int a, b ;
        a= inp.nextInt();
        b= inp.nextInt();

        LcmOfTwoNumbers lcm = new LcmOfTwoNumbers(a,b);
        System.out.println(lcm.LCM());

    }
}
