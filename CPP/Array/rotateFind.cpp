#include <iostream>
using namespace std;

int found(int arr[], int size)
{
    int s = 0, h = size - 1;
    while (s < h)
    {
        int mid = (s + h) / 2;
        if (arr[mid] > arr[mid - 1])
        {
            return mid;
        }
        else if (arr[mid] < arr[mid + 1])
        {
            s = mid + 1;
        }
        else
        {
            h = mid - 1;
        }
    }
}

int main()
{
    int arr[6] = {3, 4, 5, 6, 1, 2};
    int ans = found(arr, 6);
    cout << ans << endl;
}
