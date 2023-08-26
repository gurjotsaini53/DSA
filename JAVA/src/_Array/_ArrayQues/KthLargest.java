package _Array._ArrayQues;

import java.util.Arrays;
import java.util.Scanner;

public class KthLargest {

    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int arr[] = new int[size];
        for (int i=0;i<size;i++)
        {
            arr[i]=inp.nextInt();
        }

        int k = inp.nextInt();
        System.out.println(kthLargest(arr,size,k));


    }

    private static int kthLargest(int[] arr, int size, int k) {
        // perform sorting
        // you can use any sorting algo

        // k=0 for largest
        // k=1 for second largest
        // k=2 for third largest
        Arrays.sort(arr);
        return arr[size-1-k];
    }
}
