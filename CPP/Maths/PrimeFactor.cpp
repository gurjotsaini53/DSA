#include <iostream>
using namespace std;

void primeFactor(int n)
{
     for (int i = 2; i <= n; i++)
        {
            while (n%i==0)
            {
                n/=i;
                if (n!=1)
                {
                    cout<<i<<" X ";
                }
                else {
                    cout<<i;
                }
            }
        }
}

int main(){


    int n;
    cin>>n;
    primeFactor(n);
}