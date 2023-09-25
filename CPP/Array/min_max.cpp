#include <iostream>
using namespace std ;

int maxElement(int arr[],int size)
{
    int max=arr[0];
    for (int i =0;i<size;i++)
    {
        if (arr[i]>max){
        max=arr[i];
        }
    }
    return max;
}
int minElement(int arr[],int size)
{
    int min=arr[0];
    for (int i =0;i<size;i++)
    {
        if (arr[i]<min){
        min=arr[i];
        }
    }
    return min;
}
 int main(){
    int size;
    cin>>size ;
    int arr[size];
    for (int i = 0 ; i<size;i++)
    {
        cin>>arr[i];
    }
   cout<<"maximum element is "<<maxElement(arr,size)<<endl;
   cout<<"minimum element is "<<minElement(arr,size)<<endl;

 }