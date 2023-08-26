package _Array._ArrayQues.Sorting;

public class BubbleSort {


    public static void bubbleSort(int size, int [] arr)
    {
        int i,j;
        for (i=0;i<size-1;i++)
        {
            for ( j=0;j<size-i-1;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[] {5,4,3,2,1};
        int size = 5;
        bubbleSort(size,arr);
        for(int x:arr)
        {
            System.out.print(x + " ");
        }
    }
}
