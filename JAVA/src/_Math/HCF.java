package _Math;

public class HCF {


    // division method
    public static  int getGcd(int n1,int n2){
        int gcd , remainder;

        System.out.print("Greatest Common Divisor of "+ n1 + " and " + n2 + " : ");
        // keep dividing until we get 0;


        while (n1%n2 !=0)
        {
            remainder = n1 % n2;

            n1=n2;
            n2=remainder;
        }
        gcd = n2;
        return gcd;
    }
      public static int hcf(int a,int b)
      {
          int ans =1 ;
          int min = (a>b) ? b : a;
          for (int i=1;i<=min;i++)
          {
              if (a%i==0 && b%i==0)
              ans=i;
          }
          return ans;
      }
    public static void main(String[] args) {
        System.out.println(hcf(3,9));
        System.out.println(getGcd(4,8));
    }
}

