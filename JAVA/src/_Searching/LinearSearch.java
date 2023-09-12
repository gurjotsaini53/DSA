package _Searching;

public class LinearSearch {


    public static int getSearchResult(int arr[], int size , int key){
        for (int i=0;i<size;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int size =5;
        int key=4;
        int res = getSearchResult(arr,size,key);

        if (res==-1)
        {
            System.out.println("Element not found");
        }
        else
            System.out.println("Element found at "+ res + " index");
    }
}
