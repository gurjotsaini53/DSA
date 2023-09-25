#include <iostream>
using namespace std;
int main()
{
    int n;
    cin >> n;
    int a[n];
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    int max = a[0];
    for (int i = 1; i < n; i++)
    {
        if (max < a[i])
            max = a[i];
    }
    int fa[max + 1] = {0};

    for (int i = 0; i < n; i++)
    {
        fa[a[i]]++;
    }
    // printing the frequency array
    // for (int i = 0; i < max + 1; i++)
    // {
    //     cout << fa[i] << " ";
    // }
    for (int i = 0; i < max + 1; i++)
    {
        if (fa[i] != 0)
        {
            cout << i << " ";
            fa[i]--;
            continue;
        }
    }
}