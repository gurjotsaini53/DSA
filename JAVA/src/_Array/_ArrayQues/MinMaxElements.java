package _Array._ArrayQues;

import java.util.Scanner;

public class MinMaxElements {


    public static int Min( int [] arr, int size)
    {
        int min = arr[0];
        for (int i=0;i<size;i++)
        if (arr[i]<min) min=arr[i];

        return min;

    }
    public static int Max( int [] arr, int size)
    {

        int max =arr[0];
        for(int i=0;i<size;i++)
        {
               if (arr[i]>max) max=arr[i];
        }
        return max;
    }


    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int arr[] = new int[size];
        for (int i=0;i<size;i++)
        {
            arr[i]=inp.nextInt();
        }
        System.out.println("Max : " + Max(arr,size));
        System.out.println("Min : " + Min(arr,size));


    }
}
