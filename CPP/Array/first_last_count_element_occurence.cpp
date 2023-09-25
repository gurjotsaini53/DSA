#include <iostream>
using namespace std ;


int firstoccurence(int arr[],int size, int element)
{

    int s=0,e=size-1,mid;

    while(s<e)
    {
        mid = (s+e)/2;
        if (arr[mid]==element && arr[mid]>arr[mid-1])
        {
            return mid ;
        }
        else if(arr[mid]<element){
              s=mid+1;
        }
         else 
        {
            e=mid-1;
        }
    }
}

int lastoccurence(int arr[],int size,  int element)
{
    int s=0,e=size-1,mid;

    while(s<e)
    {
        mid = (s+e)/2;
        if (arr[mid]==element && arr[mid]<arr[mid+1])
        {
            return mid ;
        }
        else if(arr[mid]>element){
              e=mid-1;
        }
         else 
        {
           
             s=mid+1;
        }
    }
}


void printarray(int arr[],int size){
    for (int i = 0; i<size;i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}
int main(){
    int n ;
    cin>>n;
    int arr[n];
    for (int i = 0; i< n;i++)
    {
        cin>>arr[i];
    }
    int element ;
    cin>>element;
    int first = firstoccurence(arr,n,element);
    int last = lastoccurence(arr,n,element);

    int count  = (last-first+1);
    cout<<first<<endl;
    cout<<last<<endl;
    cout<<count<<endl;
     

}