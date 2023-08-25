#include <iostream>
using namespace std;

void Swap(int &a, int &b)
{
    int temp=a;
    a=b;
    b=temp;
}
void bubbleSort(int arr[], int n)
{
    int i,j , flag;
    for(i=0;i<n-1;i++)
    {
        flag=0;
        for(j=0;j<n-1-i;j++)
        {
              if (arr[j]>arr[j+1])
              {
                swap(arr[j],arr[j+1]);
                flag=1;
              }
        }

        if (flag==0) break;
    }
}

int main(){
    int arr[]={8,5,7,3,2} , n= 5;
    bubbleSort(arr,n);
    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }
    
}