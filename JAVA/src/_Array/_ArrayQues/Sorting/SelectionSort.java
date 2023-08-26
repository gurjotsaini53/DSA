package _Array._ArrayQues.Sorting;

public class SelectionSort {


    public static void SelectionSortSol(int [] arr)
    {
        int size = arr.length;

      for (int i=0;i<size-1;i++)
      {
          int min=i;
          for(int j=i+1;i<size;j++)
          {
              if (arr[min]>arr[j])
              {
                  min=j;
              }
          }
             if (min!=i) {
                 int temp = arr[i];
                 arr[i] = arr[min];
                 arr[min] = temp;
             }

      }
    }
    public static void main(String[] args) {
        int arr[] = new int[] {5,4,3,2,1};
        int size = 5;
        SelectionSortSol(arr);
        for(int x:arr)
        {
            System.out.print(x + " ");
        }
    }
}
