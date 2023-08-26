#include <iostream>
using namespace std;

int clearIthbit(int n, int k)
{

    int mask = 1 << (k - 1);
    mask = ~mask;
    return n & mask;
}
int main()
{

    cout << clearIthbit(13, 4);

    return 0;
}
