#include <iostream>
using namespace std;

int power(int x, int n)
{
    if (n==0) return 1;
    int pow =1;
    for (int i=1;i<=n;i++)
    {
        pow*=x;
    }
    return pow;
}
int main(){
  
     int x,n;
     cin>>x>>n;
    
    cout<<power(x,n);
     
}