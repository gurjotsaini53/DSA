#include <iostream>
using namespace std;

void mergeArray(int n1,int arr1[], int n2, int arr2[])
{
    int size = n1+n2;
    int ans[size];
   int k=0;
    for (int i = 0 ;i<n1;i++)
    {
         ans[k++]=arr1[i];
    }
    for (int i = 0 ;i<n2;i++)
    {
         ans[k++]=arr2[i];
         
    }
    for (int i =0 ;i<size;i++)
    {
        cout<<ans[i]<<" ";
    }
}
int main(){
    int n1,n2;
    cin>>n1;
    int arr1[n1];
    for(int i = 0 ; i< n1;i++)
    {
        cin>>arr1[i];
    }
    cin >> n2;
    int arr2[n2];
     for(int i = 0 ; i< n2;i++)
    {
        cin>>arr2[i];
    }
    mergeArray(n1,arr1,n2,arr2);
}