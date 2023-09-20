package _Math;

public class Power {
    public  static int power(int x, int n)
    {
        if (n==0) return 1;
        int pow =1;
        for (int i=1;i<=n;i++)
        {
            pow*=x;
        }
        return pow;
    }
    public static void main(String[] args) {
        System.out.println(power(2,10));
        System.out.println(power(3,4));
    }
}
