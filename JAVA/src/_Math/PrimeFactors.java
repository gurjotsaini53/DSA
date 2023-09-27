package _Math;

public class PrimeFactors {


    public static void PrimeFactor(int n )
    {
        int i=2;
        while(n>1)
        {
            if (n%i==0)
            {
                System.out.print(i + " ");
                n/=i;
            }
            else{
                i++;
            }
        }
        return;
    } public static void PrimeFactor1(int n) {

        for (int i = 2; i <= n; i++)
        {
            while (n%i==0)
            {
                n/=i;
                if (n!=1)
                {
                    System.out.print(i+" x ");
                }
                else {
                    System.out.println(i);
                }
            }
        }
    }



    public static void main(String[] args) {
        PrimeFactor(13);
        System.out.println();
        PrimeFactor1(121);

    }
}
