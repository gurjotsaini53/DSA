package _Math;

public class PrimeNumbers {
    public static void checkPrime(int n)
    {
        boolean flag = true;
//        for (int i=0;i<=n-1;i++)
//        for (int i=0;i<=Math.pow(n,0.5);i++)
//        for (int i=0;i*i<=n;i++)
        for (int i=0;i<=n/i;i++)

        {

            if (n%i==0) {
                flag = false;
                break;
            }

        }

        if (flag) System.out.println("Prime Number");
        else System.out.println("Not Prime Number");
    }
    public static void main(String [] args)
    {

    }
}
