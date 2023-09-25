#include <iostream>
using namespace std  ;
int reverse(int arr[],int size)
{
    for (int i=0;i<size/2;i++)
    {
        int temp = arr[i];
        arr[i]=arr[size-1-i];
        arr[size-1-i]=temp;
    }
}


void printArray(int arr[], int n) {
    
    for(int i=0; i<n; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
}
int main(){
    int size; 
    cin>>size;
    int arr[size];
    for (int i = 0;i<size;i++)
    {
      cin>>arr[i];
    }
   reverse(arr,size);
   
   printArray(arr,size);
}