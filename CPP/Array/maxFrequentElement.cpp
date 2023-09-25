#include <iostream>
using namespace std;
int maxFrequentElement(int arr[],int size)
{
    int max=arr[0];
    for (int i=0;i<size;i++)
    {
        if (arr[i]>max)
        {
            max=arr[i];
        }
    }
    
    int fa[max+1]={0};
    for (int i = 0 ; i < size ; i++ )
    {
        fa[arr[i]]++;
    }
    int famax=fa[0], faindex=0;
    for (int i=0;i<max+1;i++)
    {
        if (fa[i]>famax)
        {
            famax=fa[i];
            faindex=i;
        }
    }
    return faindex;
}
int main(){
    int size;
    cin>>size;
    int arr[size];
    for (int i = 0 ; i<size;i++)
    {
        cin>>arr[i];
    }
   
    cout<<maxFrequentElement(arr,size);

}