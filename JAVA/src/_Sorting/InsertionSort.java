package _Sorting;

public class InsertionSort {
    public static void Sort(int arr[], int n)
    {
        int temp ;
        if (n==1) return;
        for (int i=0;i<n;i++)
        {
            for(int j=i;j>0;j--)
            {
                if (arr[j]<arr[j-1])
                {
                    temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

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
