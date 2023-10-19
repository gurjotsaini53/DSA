package _Array._ArrayQues;

public class CheckIFArraySortedOrNot {


    public static boolean check(int arr[])
    {
        int size = arr.length;
        for (int i=1;i<size;i++)
        {
            if (arr[i]>=arr[i-1])
            {

            }
            else
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
       int arr[] = {1,2,3,4,5};
       int arr2[] = {1,2,1,3,4,3,2};
        System.out.println(check(arr));
        System.out.println(check(arr2));
    }
}
