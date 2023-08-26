package _Array._ArrayQues.Searching;
import java.util.Scanner;
public class LinearSearch {

    public static int LinearSearch(int size,int arr[], int key)
    {
        for (int i=0;i<size;i++)
        {
            if (arr[i]==key) return i;
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

        int ans = LinearSearch(size,arr,key);

        if (ans==-1) System.out.println("Element not found");
        else System.out.println("Element found at " + ans + " index");

    }
}
