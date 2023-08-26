package _Math;

public class PrimeFactors {


    public static void PrimeFactor(int n , int i)
    {
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
    }
    public static void main(String[] args) {
        PrimeFactor(315,2);
    }
}
