package _Searching;

public class RecursiveBinarySearch {
    public static int getSearchResult(int arr[], int s, int e , int key){

        int mid ;

        if (s<=e)
        {
            //mid=(s+e)/2;
            mid=s+(e-s)/2;
            if (arr[mid]==key)
            {
                return mid;
            }
            else if (arr[mid]>key)
            {
                return getSearchResult(arr,s,mid-1,key);
//                e=mid-1;
            }
            else {
                return getSearchResult(arr,mid+1,e,key);

//                s = mid + 1;
            }
        }


        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};  // arr must be sorted in binary search
        int size =5;
        int key=1;
        int res = getSearchResult(arr,0,size-1,key);

        if (res==-1)
        {
            System.out.println("Element not found");
        }
        else
            System.out.println("Element found at "+ res + " index");
    }
}
