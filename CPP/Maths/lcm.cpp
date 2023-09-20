#include <iostream>
using namespace std;

int gcd(int a, int b)
{
 int gcd,rem;
    while(a%b!=0)
    {
       rem =  a%b ; 

        a=b;
        b=rem;
    }
    
    gcd = b;
    return gcd;
}
int main(){
    int a,b;
    cin>>a>>b ; 
   
   int lcm = (a*b)/gcd(a,b);
   cout<<lcm;
}