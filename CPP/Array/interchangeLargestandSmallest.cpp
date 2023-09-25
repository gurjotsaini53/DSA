#include <iostream>
using namespace std;

int main()
{

    int n;
    cout << "Enter size of Array = ";
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {

        cin >> arr[i];
    }
    int max = arr[0];
    int maxIndex = 0;
    int min = arr[0];
    int minIndex = 0;
    for (int i = 0; i < n; i++)
    {
        if (arr[i] > max)
        {
            max = arr[i];
            maxIndex = i;
        }
        if (arr[i] < min)
        {
            min = arr[i];
            minIndex = i;
        }
    }

    int temp = arr[minIndex];
    arr[minIndex] = arr[maxIndex];
    arr[maxIndex] = temp;

    for (int i = 0; i < n; i++)
    {

        cout << arr[i] << " ";
    }
}
