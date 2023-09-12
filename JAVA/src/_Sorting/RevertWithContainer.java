package _Sorting;
import java.util.Stack;
public class RevertWithContainer {


    public static void RevertWithContainer(int arr[], int size)
    {
        Stack<Integer> s1= new Stack<>();

        for (int x:arr)
        {
            s1.push(x);
        }

        for (int i=0;i<size;i++)
        {
            arr[i]=s1.pop();
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int size = 5;

        for (int x:arr)
        {
            System.out.print(x+ " ");
        }
        System.out.println();

        RevertWithContainer(arr,size);

        for (int x:arr)
        {
            System.out.print(x+ " ");
        }
        System.out.println();
    }
}
