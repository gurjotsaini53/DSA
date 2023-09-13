package _Sorting;

public class QuickSort {

        public static void swap(int arr[], int left , int right)
        {
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
        }
        public static void Sort(int arr[], int lowIndex, int highIndex)
        {
           int pivot =arr[highIndex];

           int leftPointer = lowIndex;
           int rightPointer = highIndex;


           while(leftPointer<highIndex)
           {
               while (arr[leftPointer]<=pivot && leftPointer<rightPointer)
               {
                   leftPointer++;
               }

               while (arr[rightPointer]>=pivot && rightPointer>leftPointer)
               {
                   rightPointer--;
               }

               swap(arr,leftPointer,rightPointer);
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
            Sort(arr,0,size-1);
            for (int x:arr)
            {
                System.out.print(x+" ");
            }
            System.out.println();

        }

}
