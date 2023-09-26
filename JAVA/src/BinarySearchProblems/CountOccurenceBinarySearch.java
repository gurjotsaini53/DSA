package BinarySearchProblems;

public class CountOccurenceBinarySearch {


    public static int Count(int arr[], int k)
    {
        int first  = FirstOccurence.First(arr,k);
        int last = LastOccurence.Last(arr,k);
        if (first==-1 || last==-1)
        {
            return -1;

        }

        return last-first+1;
    }
    public static void main(String[] args) {
        int arr[] =  new int[]{1,1,2,2,3,3,8,8,10,10,10,10};
        int k =10;
        System.out.println( k + " is found " + Count(arr,k)  + " times");
    }
}
