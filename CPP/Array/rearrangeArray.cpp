#include <iostream>
using namespace std;
not working;
void RearrangeArray(int arr[], int size)
{
    // find max
    int max=arr[0];
    for (int  i = 0 ; i<size;i++)
    {
        if (arr[i]>max)
        max=arr[i];
    }
     int fa[size+1]={0};

    for (int i  = 0 ; i<size;i++)
    {
        fa[arr[i]]++;
    }
    //////////////////////////



    for (int i  = 0 ; i<size;i++)
    {
        if (fa[arr[i]]>=1)
        {
            arr[i]=i;
        }
        else{
            arr[i]=-1;
        }
    }
    
    
    }

    void printarray(int arr[], int size)
    {
        for(int  i= 0 ; i<size;i++)
        cout<<arr[i]<<" ";

        cout<<endl;
    }
int main(){
    int size; 
    cin>>size; 
    int arr[size];
    for (int i = 0 ;i<size;i++)
    cin>>arr[i];
     
    RearrangeArray(arr,size);
    printarray(arr,size);
}