#include <iostream>
using namespace std ;

void allPairSum(int arr[], int size, int k )
{
   for (int  i = 0 ; i < size ; i++)
   {
    for (int j = i+1;j<size-1;j++)
    {
        if(arr[i]+arr[j]==k)
        {
            cout<<arr[i]<<" "<<arr[j]<<endl;
        }
    }
   }
}
 int main(){
    int size , k; 
    cin >> size; 
    int arr[size];
    for (int i = 0 ; i<size;i++)
    {
        cin>>arr[i];
    }
    cin>>k;
    allPairSum(arr,size,k);
    return 0 ;
 }