#include <bits/stdc++.h>

using namespace std;

void search(int n, int key, int arr[][10])
{

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if (key == arr[i][j])
            {
                cout << "Element found at " << i << " th row " << j << " jth column" << endl;
                return;
            }
        }
    }

    cout << "Element not found " << endl;
    return;
}
int main()
{
    int n, key;
    cin >> n;
    int arr[n][n];
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cin >> arr[i][j];
        }
    }
    cin >> key;
    search(n, key,arr);
}
