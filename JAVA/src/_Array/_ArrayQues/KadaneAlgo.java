package _Array._ArrayQues;

public class KadaneAlgo {


    public static int max(int a , int b)
    {
        return (a>b) ? a :b;
    }

    public static  int kadane(int arr[])
    {
        int size = arr.length;
        int sum=0,maxi=Integer.MIN_VALUE;
        for (int i=0;i<size;i++)
        {
            // step 1
            sum+=arr[i];
            // step 2
            maxi = max(maxi,sum);
            // step 3
            if (sum<0) sum=0;
        }

        return maxi;
    }
    public static void main(String[] args) {
   int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        System.out.println(kadane(arr));
    }
}
