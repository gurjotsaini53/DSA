#include <iostream>
using namespace std ;

void rightRotate(int arr[],int size, int k)
{
  while(k--)
  {
    int temp=arr[size-1];
    for (int i =size-2 ;i>=0;i--)
    {
        arr[i+1]=arr[i];
    }
    arr[0]=temp;
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
    int k ;
    cin>>k;
rightRotate(arr,n,k);
   printarray(arr,n);

}