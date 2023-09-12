package _Searching;

public class RecursiveLinearSearch {
    public static int getSearchResult(int arr[], int s, int e , int key){

        if(s<=e)
        {
            if (arr[s]==key)
            {
                return s;
            }
            else
            {
               return getSearchResult(arr,s+1,e,key);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
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
