package _Array._ArrayQues;

public class PrefixSumArray {


    public static void prefix(int arr[])
    {
        int size = arr.length;

        for(int i=1;i<size;i++)
        {
            arr[i]+=arr[i-1];

        }



        // printing array
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
  int arr[] ={10, 20, 10, 5, 15};
          prefix(arr);
    }
}
