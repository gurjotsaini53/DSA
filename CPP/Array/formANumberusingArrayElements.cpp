#include <iostream>
#include <math.h>
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

    int i = 0;

    int num = 0;

    while (i < n)
    {
        num = num * 10 + arr[i];
        i++;
    }
    cout << num << endl;
}
