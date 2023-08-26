package _Math;

public class HCF {

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
    }
}

