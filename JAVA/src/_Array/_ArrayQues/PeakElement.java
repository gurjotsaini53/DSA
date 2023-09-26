package _Array._ArrayQues;

public class PeakElement {

    public static int peek(int arr[])
    {

        int size = arr.length;
        if (size==1)
            return 0;
        if (arr[0]>=arr[1])
            return 0;

        if (arr[size-1]>=arr[size-2])
        {
            return size-1;
        }

        for (int i=1;i<size-1;i++)
        {
            if (arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
            {
                return i;
            }
        }

        return -1;
    }

    public static void peek1(int arr[])
    {

        int size = arr.length;
        if (size==1)
            System.out.println(arr[0]);
        if (arr[0]>=arr[1])
            System.out.println(arr[0]);

        if (arr[size-1]>=arr[size-2])
        {
            System.out.println(arr[size-1]);

        }

        for (int i=1;i<size-1;i++)
        {
            if (arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
            {
                System.out.println(arr[i]);
            }
        }

    }


    public static void main(String[] args) {
        int arr[] = new int[]{10, 20, 15, 2, 23, 90, 67} ;

        int peekIndex = peek(arr);
        System.out.println(arr[peekIndex]);

        System.out.println("Find all peek elements");
        peek1(arr);
    }
}
