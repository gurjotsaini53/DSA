package _Math;

import java.util.Scanner;

public class LcmOfMoreNumbers {
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
    public static int lcm(int arr[], int n)
    {

        int ans=1 ;
        for (int i=0;i<n;i++)
        {
            ans = (ans * arr[i]) / getGcd(ans,arr[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size;
        size= input.nextInt();
        int arr[]= new int[size];
        for (int i=0;i<size;i++)
        {
            arr[i]=input.nextInt();
        }

        System.out.println(lcm(arr,size));
    }
}
