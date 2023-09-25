#include <iostream>
using namespace std;

int firstOccurence(int arr[], int size, int key)
{

    int s = 0, h = size - 1;
    while (s < h)
    {
        int mid = (s + h) / 2;
        if (arr[mid] == key && arr[mid - 1] > key)
        {
            return mid;
        }
        else if (arr[mid] == key && arr[mid - 1] == key)
        {
            s = 0;
            h = mid - 1;
        }
        else if (arr[mid] > key)
        {
            h = mid - 1;
        }
        else
        {
            s = mid + 1;
        }
    }
}
int lastOccurence(int arr[], int size, int key)
{

    int s = 0, h = size - 1;
    while (s < h)
    {
        int mid = (s + h) / 2;
        if (arr[mid] == key && arr[mid + 1] > key)
        {
            return mid;
        }
        else if (arr[mid] == key && arr[mid + 1] == key)
        {
            s = mid + 1;
        }
        else if (arr[mid] > key)
        {
            h = mid - 1;
        }
        else
        {
            s = mid + 1;
        }
    }
}
int main()
{
    int arr[7] = {1, 2, 3, 3, 3, 3, 4};
    int first = firstOccurence(arr, 7, 3);
    int last = lastOccurence(arr, 7, 3);
    int ans = last - first + 1;
    cout << ans;
}