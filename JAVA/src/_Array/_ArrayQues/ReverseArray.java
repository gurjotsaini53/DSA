package _Array._ArrayQues;

import java.util.Scanner;


public class ReverseArray {

    public static void Reverse(int size, int [] arr)
    {
        for(int i=0;i<=size/2;i++)
        {
         int temp = arr[i];
         arr[i]=arr[size-i-1];
         arr[size-i-1]=temp;
        }
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
        Reverse(size,arr);
        for (int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }


    }
}
