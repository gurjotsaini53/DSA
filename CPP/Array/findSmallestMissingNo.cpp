#include <iostream>
using namespace std;
// Given a sorted array of n distinct integers where each integer is in the range from 0 to m-1 and m > n. Find the smallest number that is missing from the array. 

int findNumber(int arr[], int size)
{
    // find max
    int max=arr[0];
    for (int  i = 0 ; i<size;i++)
    {
        if (arr[i]>max)
        max=arr[i];
    }

    int fa[size+1+1]={0};

    for (int i  = 0 ; i<size;i++)
    {
        fa[arr[i]]++;
    }
    for (int i=0;i<=max+1+1;i++)
    {
        if (fa[i]<1)
        return i ; 
    }
    }
int main(){
    int size;
    cin>>size ;
    int arr[size];
    for (int i = 0 ; i< size ;i++)
    cin>>arr[i];
    
    cout<<findNumber(arr,size)<<endl;
}