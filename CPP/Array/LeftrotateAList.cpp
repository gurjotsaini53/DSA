#include <iostream>
using namespace std ;


void leftRotate(int arr[],int size,int k)
{
    while(k--)
    {
        int temp = arr[0];
        for (int i=0;i<=size-2;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[size-1]=temp;
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
  leftRotate(arr,n,k);
   printarray(arr,n);

}