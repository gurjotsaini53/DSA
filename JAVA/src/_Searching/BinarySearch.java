package _Searching;

public class BinarySearch {

    public static int getSearchResult(int arr[], int size , int key){

        int s=0;
        int e=size-1,mid;

        while (s<=e)
        {
            //mid=(s+e)/2;
            mid=s+(e-s)/2;
            if (arr[mid]==key)
            {
                return mid;
            }
            else if (arr[mid]>key)
                e=mid-1;
            else
                s=mid+1;
        }


        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};  // arr must be sorted in binary search
        int size =5;
        int key=6;
        int res = getSearchResult(arr,size,key);

        if (res==-1)
        {
            System.out.println("Element not found");
        }
        else
            System.out.println("Element found at "+ res + " index");
    }
}
