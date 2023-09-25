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
    int secondMax = arr[0];

    for (int i = 0; i < n; i++)
    {
        if (arr[i] > max)
            max = arr[i];
    }

    for (int i = 0; i < n; i++)
    {
        if (arr[i] > secondMax && max != arr[i])
        {
            secondMax = arr[i];
        }
    }

    cout << "max is " << max << endl;
    cout << "second max is " << secondMax << endl;
}
