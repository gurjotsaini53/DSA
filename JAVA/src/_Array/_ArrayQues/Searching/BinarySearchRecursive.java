package _Array._ArrayQues.Searching;

import java.util.Scanner;

public class BinarySearchRecursive {
    public static int BinarySearchRecursive(int s , int e, int arr[], int key)
    {
        int mid;
        if (s<=e) {
            mid = (s + e) / 2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] > key) return BinarySearchRecursive(s, mid - 1, arr, key);
            else if (arr[mid] < key)  return BinarySearchRecursive(mid + 1, e, arr, key);
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

        int ans = BinarySearchRecursive(0,size-1,arr,key);

        if (ans==-1) System.out.println("Element not found");
        else System.out.println("Element found at " + ans + " index");

    }
}
