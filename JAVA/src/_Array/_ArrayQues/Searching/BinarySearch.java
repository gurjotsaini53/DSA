package _Array._ArrayQues.Searching;

import java.util.Scanner;

public class BinarySearch {

    public static int BinarySearch(int size, int arr[], int key)
    {
        int s=0, e=size-1, mid;
        while(s<=e)
        {
            mid = (s+e)/2;
            if (arr[mid]==key) return mid;
            else if (arr[mid]>key) e=mid-1;
            else if (arr[mid]<key) s=mid+1;

        }
        return -1;
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

        int key= inp.nextInt();

        int ans = BinarySearch(size,arr,key);

        if (ans==-1) System.out.println("Element not found");
        else System.out.println("Element found at " + ans + " index");

    }
}
