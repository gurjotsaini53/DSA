package _Array._ArrayQues;

public class PairProduct {

    public static boolean PairProduct(int arr[], int size, int k)
    {
       for (int i=0;i<size;i++)
       {
           for(int j=i+1;j<size;j++)
           {
               if (arr[i]*arr[j]==k) return true;
           }
       }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1,2,3,4};
        int size = arr.length;
        int k =  8;
        System.out.println(PairProduct(arr,size,k));
    }
}
