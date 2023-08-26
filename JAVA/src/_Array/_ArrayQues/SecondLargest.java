package _Array._ArrayQues;

import java.util.Scanner;

public class SecondLargest {

    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int arr[] = new int[size];
        for (int i=0;i<size;i++)
        {
            arr[i]=inp.nextInt();
        }

        System.out.println(SecondSmallest(arr,size));


    }

    private static int SecondSmallest(int[] arr, int size) {

        // find max
        int max = Integer.MIN_VALUE, second=Integer.MIN_VALUE;
        for (int i=0;i<size;i++)
        {
            if (arr[i]>max) max=arr[i];

        }
        for (int i=0;i<size;i++)
        {
            if (arr[i]>second && arr[i]!=max) {
                second = arr[i];
            }

        }

        return second;


    }

}
