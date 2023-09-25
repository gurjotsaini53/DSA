#include <iostream>
using namespace std;
void insertAtBegining(int arr[], int size, int val)
{
    size = size + 1; // increasing the size of array
    //  shifting the array and making the first place empty
    for (int i = size - 1; i >= 0; i--)
    {
        arr[i] = arr[i - 1];
    }
    arr[0] = val;
}

void insertAtEnd(int arr[], int size, int val)
{
    size = size + 1 ; 
    arr[size-1]=val ;
}
void insertAtIndex(int arr[], int size, int val , int index)
{
  
    size = size + 1 ; 
    for (int i = size - 1; i >= index; i--)
    {
        arr[i] = arr[i - 1];
    }

    // storing value at given index
    arr[index] = val;
}
int main()
{
    int n;
    cin >> n; // input the size of array

    int a[n];
    // array declaration
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    int val;
    // value to be added
    cin >> val;
  // insertAtBegining(a,n,val);
   // insertAtEnd(a,n,val);

   // take value as index in below case;
    insertAtIndex(a,n,100,val);
    // printing the array
    for (int i = 0; i < n+1; i++)
    {
        cout << a[i] << " ";
    }
    return 0;
}