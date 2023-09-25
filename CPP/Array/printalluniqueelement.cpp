#include <iostream>
using namespace std;
void printAllUnique(int arr[],int size)
{
    // find max element 
    int max=arr[0];
    for (int i=0;i<size;i++)
    {
        if (arr[i]>max)
        {
            max=arr[i];
        }
    }
    // create a frequency array of size (max+1) as we need last index = max 
    // and initialize it with the zero
    int fa[max+1]={0};
    for (int i = 0 ; i < size ; i++ )
    {
        fa[arr[i]]++;
    }
    for (int i=0;i<max+1;i++)
    {
        if (fa[i]==1)
        {
            cout<<i<<" ";
            // indexes of frequency array are elements of the original array
        }
    }
}
int main(){
    int size;
    cin>>size;
    int arr[size];
    for (int i = 0 ; i<size;i++)
    {
        cin>>arr[i];
    }
    cout<<"unique elements in the array are"<<endl;
    printAllUnique(arr,size);

}