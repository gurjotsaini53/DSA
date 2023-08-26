package _Array._ArrayQues.Searching.BinarySearchQues;

public class CountElements {
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
}
