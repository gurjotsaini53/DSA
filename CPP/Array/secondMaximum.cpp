#include <iostream>
using namespace std;

int secondMaximum(int arr[], int size)
{
    int max =  arr[0] , maxIndex = 0 ;
    for (int i = 0 ; i < size ;i++)
    {
        if (arr[i]>max){
        max=arr[i];
        maxIndex=i;
        }
    } 

    int secondMax=arr[0], secondMaxIndex=0;
    for (int i = 0 ;i<size;i++)
    {
        if (arr[i]!=max && arr[i]>secondMax)
        {
            secondMax=arr[i];
            secondMaxIndex=i;
        }
    }
    return secondMax;
}
int main(){
    int size;
    cin>>size;
    int arr[size];
    for (int i = 0 ; i<size;i++)
    {
        cin>>arr[i];
    }
    cout<<secondMaximum(arr,size);

}