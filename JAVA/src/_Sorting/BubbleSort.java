package _Sorting;

public class BubbleSort {

    public static void Sort(int arr[], int n)
    {
        if (n==1)
            return;
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n-i-1;j++)
            {
                if (arr[j+1]<arr[j])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
         for (int x:arr)
         {
             System.out.print(x+" ");
         }
        System.out.println();
        int size=5;
        Sort(arr,size);
        for (int x:arr)
        {
            System.out.print(x+" ");
        }
        System.out.println();

    }
}
