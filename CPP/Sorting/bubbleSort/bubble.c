#include <stdio.h>

void bubbleSort(int arr[], int n)
{
    for(int i=0;i<n-1;i++)
    {
        for (int j=0;j<n-1-i;j++)
        {
            if (arr[j]>arr[j+1])
            {
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}
int main(){

    int arr[]= {8,5,7,3,2} , n=5;
    bubbleSort(arr,n);
    for(int i=0;i<n;i++)
    {
        printf("%d ",arr[i]);
    }
}
