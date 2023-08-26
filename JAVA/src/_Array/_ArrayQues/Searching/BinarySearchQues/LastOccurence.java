package _Array._ArrayQues.Searching.BinarySearchQues;

public class LastOccurence {
    public  static int LastOccurence(int size, int [] arr,int key)
    {
        int mid, ans =-1, s=0,e=size-1;

        while(s<=e)
        {
            mid=(s+e)/2;
            if (arr[mid]==key)
            {
                ans = mid;
                s=mid+1;
            }
            else if(arr[mid]<key) s=mid+1;
            else if (arr[mid]>key) e=mid-1;
        }
        return ans;
    }
    public  static int firstOccurence(int size, int [] arr,int key)
    {
        int mid, ans =-1, s=0,e=size-1;

        while(s<=e)
        {
            mid=(s+e)/2;
            if (arr[mid]==key)
            {
                ans = mid;
                e=mid-1;
            }
            else if(arr[mid]<key) s=mid+1;
            else if (arr[mid]>key) e=mid-1;
        }
        return ans;
    }

    public static int CountElements(int size, int arr[], int key)
    {
        int first = firstOccurence(size,arr,key);
        int Last= LastOccurence(size,arr,key);
        if(first==-1 || Last==-1) return -1;
        return Last-first+1;
    }
    public static void  main(String [] args)
    {
        int arr[] = {1,2,3,3,3,3,4,4,6,7};
        int size=9;
        System.out.println("Count Element : " + CountElements(size,arr,4));

    }

}
