#include <iostream>
using namespace std;

void printArray(int arr[], int n) {
    
    for(int i=0; i<n; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
}

void sort012(int arr[],int size)
{
    int count0=0 , count1=0 , count2=0;
    for(int i =  0 ; i < size ; i++)
    {
        if(arr[i]==0)
        {
            count0++;
        }
        if(arr[i]==1)
        {
            count1++;
        }
        if(arr[i]==2)
        {
            count2++;
        }
    }
    int k = 0 ;
    while(count0--){
        arr[k]=0;
        k++;
    }
    while(count1--){
        arr[k]=1;
        k++;
    }
    while(count2--){
        arr[k]=2;
        k++;
    }
}
int main(){
    int size; 
    cin>>size;
    int arr[size];
    for (int i = 0;i<size;i++)
    {
      cin>>arr[i];
    }
  
    sort012(arr,size);
   printArray(arr,size);
}