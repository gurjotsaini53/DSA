#include <iostream>
using namespace std;

bool checkPrime(int n)
{
    bool flag = true;
//        for (int i=2;i<=n-1;i++)
//        for (int i=2;i<=Math.pow(n,0.5);i++)
//        for (int i=2;i*i<=n;i++)
        for (int i=2;i<=n/i;i++)

        {

            if (n%i==0) {
                flag = false;
                break;
            }

        }
        return flag;
}
int main()
{
  int n;
  cin>>n;
  if (checkPrime(n)) cout<<"Prime"<<endl;
  else cout<<"Not Prime"<<endl;
}