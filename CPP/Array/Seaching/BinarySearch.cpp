#include <iostream>
using namespace std ;

int binarySearch(int arr[],int size, int element)
{
    int start=0 , end = size-1 ,mid ;
    while(start<=end)
    {
         mid = (start+end)/2;
         if (arr[mid]==element)
         return mid;
         else if (arr[mid]>element)
         end = mid -1;
         else
         start=mid+1;
    } 
    return -1;
}

int recursiveBinarySearch(int arr[], int start , int end , int element)
{
    if (start<=end)
    {
        int mid = (start+end)/2 ;
        if (arr[mid]==element)
        {
            return mid;
        }
        else if (arr[mid]>element)
        return recursiveBinarySearch(arr,start,mid-1,element);

        else
        return recursiveBinarySearch(arr,mid+1,end,element);
    }
    return -1;
}
int main(){
    int size,element;
    cin>> size; 
    int arr[size];
    for (int i =0 ;i<size;i++)
    cin>>arr[i];

    cin>>element;

   if (binarySearch(arr,size,element)==-1)
    cout<<"element not found"<<endl;
   else
   cout<<"element found at "<<binarySearch(arr,size,element)<<" location"<<endl;
   
   cout<<"by using recursive binary search "<<recursiveBinarySearch(arr,0,size-1,element)<<endl;
}