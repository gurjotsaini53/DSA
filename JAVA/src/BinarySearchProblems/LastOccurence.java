package BinarySearchProblems;

import java.util.Arrays;
import java.util.*;
public class LastOccurence {


    public static int Last(int arr[], int k )
    {
        int s = 0 , e = arr.length-1, result =-1, mid;

        while (s<=e)
        {
            mid = (s+e)/2;
            if(arr[mid]==k)
            {
                result=mid;
                s=mid+1;
            }
            else if (arr[mid]>k){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] =  new int[]{1,1,2,2,3,3,8,8,10,10,10,10};
        int k =10;
        System.out.println( k + " is found last at " + Last(arr,k)  + " index");
    }
}
