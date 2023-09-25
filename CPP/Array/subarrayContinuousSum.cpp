#include <iostream>
using namespace std;
int main(){

    int size ,sum; 
    cin>>size;
    int arr[size];
     for (int i = 0 ;  i<size;i++)
     cin>>arr[i];
     
     cin>>sum ; 

     for (int i = 0 ; i<size;i++)
     {
        int sumSubarray = 0  ; 
        for (int j = i ; j<size;j++)
        {
            sumSubarray+=arr[j];
            if (sumSubarray==sum)
            {
                cout<<i<<" "<<j<<endl;
            }
        }
     }
     return 0 ; 
}