package _Math;

public class PrimeSieve {

    public static void prime(int n)
    {
        boolean isPrime[] = new boolean[n+1];


        // true means prime
        for(int i=2;i<=n;i++)
        {
            isPrime[i]=true;
        }

        for (int i=2;i<=n;i++)
        {
            if (isPrime[i]==true){
                for(int j=i*i;j<=n;j+=i)
                {
                    isPrime[j]=false;
                }
            }
        }

        for(int i=2;i<=n;i++)
        {
            if (isPrime[i]==true)
            {
                System.out.print(i+" ");
            }
        }


    }
    public static void main(String[] args) {
        prime(50);
    }
}
