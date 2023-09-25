#include <iostream>
using namespace std;

int max(int num1, int num2)
{
    if(num1>num2)
    {
    return num1;

    }
    else{

    return num2;
    }
}
int maximumcosecutive(int arr[],int size)
{
    int maxElement = arr[0];
    for (int i = 0 ; i<size;i++)
    {
        if (arr[i]>maxElement)
        maxElement=arr[i];
    }

    int fa[maxElement+1]={0};
    for(int i = 0 ;i<size;i++)
    {
        fa[arr[i]]++;
    }
    int num=0,count=0;

    for(int i = 0 ; i<maxElement+1;i++)
    {
        if(fa[i]>=1)
        {
        count++;
        }
        else if(fa[i]<1)
        {
            num=max(num,count);
            count=0;
        }
    }
    return count;
}
int main(){
    int size ; 
    cin>>size ; 
    int arr[size];
    for (int i  = 0; i<size;i++)
    {
        cin>>arr[i];
    }
    cout<<maximumcosecutive(arr,size)<<endl;
}