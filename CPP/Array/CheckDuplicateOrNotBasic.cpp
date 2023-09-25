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

    int flag = 0;
    for (int i = 0; i < n; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (arr[i] == arr[j] && i != j)
            {
                flag = 1;
            }
        }
    }
    if (flag == 1)
    {
        cout << "array contain duplicates" << endl;
    }
    else
    {
        cout << "array does not contain duplicates" << endl;
    }
}
