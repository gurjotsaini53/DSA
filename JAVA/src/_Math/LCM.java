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
    public static  int getGcd(int n1,int n2){
        int gcd , remainder;

        while (n1%n2 !=0)
        {
            remainder = n1 % n2;

            n1=n2;
            n2=remainder;
        }
        gcd = n2;
        return gcd;
    }

    public int getLcm() {
      return  (a*b)/getGcd(a,b);

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
        System.out.println(lcm.getLcm());

    }
}
