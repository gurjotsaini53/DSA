#include <stdio.h>

void insertionSort(int arr[], int n)
{
   for (int i=1;i<n;i++)
   {
    int current = arr[i];
    int j=i-1;

    while(arr[j]>current && j>=0)
    {
        arr[j+1]=arr[j];
        j--;
    }

    arr[j+1]=current;
   }
}
int main(){

    int arr[]= {8,5,7,3,2} , n=5;
    insertionSort(arr,n);
    for(int i=0;i<n;i++)
    {
        printf("%d ",arr[i]);
    }
}
