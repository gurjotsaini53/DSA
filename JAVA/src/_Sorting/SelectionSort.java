package _Sorting;

public class SelectionSort {
    public static void Sort(int arr[], int n)
    {
        for (int i=0;i<n-1;i++)
        {
            int min_index = i ;
            for (int j=i+1;j<n;j++)
            {
                if (arr[j]<arr[min_index])
                {
                    min_index=j;
                }
            }

            if (min_index!=i)

            {
                int temp = arr[min_index];
                arr[min_index]=arr[i];
                arr[i]=temp;
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
