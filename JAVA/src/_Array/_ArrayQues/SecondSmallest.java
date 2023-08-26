package _Array._ArrayQues;

import java.util.Scanner;

public class SecondSmallest {

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

        // find min
        int min = Integer.MAX_VALUE, second=Integer.MAX_VALUE;
        for (int i=0;i<size;i++)
        {
            if (arr[i]<min) min=arr[i];

        }
        for (int i=0;i<size;i++)
        {
            if (arr[i]<second && arr[i]!=min) {
                second = arr[i];
            }

        }

        return second;


    }
}
