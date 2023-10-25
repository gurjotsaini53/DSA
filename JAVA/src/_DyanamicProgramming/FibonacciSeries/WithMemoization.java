package _DyanamicProgramming.FibonacciSeries;

import java.util.Scanner;

public class WithMemoization {


 private   static int maxSize = 1000;
  private   long[]  cache= new long[maxSize];


  public WithMemoization(){
      for(int i=0;i<cache.length;i++)
          cache[i]=-1;
  }
    public long getFibo(int n){
        if (cache[n]==-1)
        {
            if(n<=1)
            {
                cache[n]=n;
            }
            else {
                cache[n] =  getFibo(n-2)+getFibo(n-1) ;
            }
        }
        return cache[n];
    }

    public void showResult()
    {
        for (int i=0;i<=cache.length;i++)
        {
            if (cache[i]==-1)
            {
                return;
            }
            else
            {
                System.out.println(cache[i]+" ");
            }
        }
    }
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        WithMemoization obj = new WithMemoization();

        System.out.println(obj.getFibo(n));

    }
}
