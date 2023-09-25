#include <iostream>
using namespace std ;


int linearSearch(int arr[],int size, int element)
{
    for(int i=0;i<size;i++)
    {
        if (arr[i]==element)
        return i;
    }
    return -1 ;
}

int linearSearchRecursive(int arr[],int size,int element)
{
    
     if (size==0)
     return -1;
     else if (arr[size-1]==element)
     return size-1;

     else
     return linearSearchRecursive(arr,size-1,element);
}
int main(){
    int size,element;
    cin>> size; 
    int arr[size];
    for (int i =0 ;i<size;i++)
    cin>>arr[i];

    cin>>element;

   if (linearSearch(arr,size,element)==-1)
    cout<<"element not found"<<endl;
   else
   cout<<"element found at "<<linearSearch(arr,size,element)<<" location"<<endl;

   cout<<"using recursive linear search"<<linearSearchRecursive(arr,size,element)<<endl;
}