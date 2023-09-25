#include <iostream>
using namespace std;
void deleteByValue(int arr[], int size, int val)
{
    int index;
    for (int i = 0; i < size; i++)
    {
        if (arr[i] == val)
        {
            index = i;
            break;
        }
    }

    for (int i = index; i < size; i++)
    {
        arr[i] = arr[i + 1];
    }

    size = size - 1;
}
int main()
{
    int n, index;
    cin >> n; // input the size of array

    int a[n];
    // array declaration
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }

    int val;
    cout << "enter value to delete  : ";
    cin >> val;

    

    // printing the array
    for (int i = 0; i < n-1; i++)
    {
        cout << a[i] << " ";
    }
    cout << endl;
    cout << "value deleted successfully :)" << endl;
    return 0;
}