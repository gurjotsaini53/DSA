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
    for (int i = 0; i < n; i++)
    {
        if (arr[i] > max)
        {
            max = arr[i];
            maxIndex = i;
        }
    }
    cout << max << " is maximum number and is present at " << maxIndex << " index" << endl;
}
