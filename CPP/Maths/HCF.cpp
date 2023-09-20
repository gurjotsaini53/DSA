#include <iostream>
using namespace std;

int main(){
    int a,b;
    cin>>a>>b ; 
    int gcd,rem;
    while(a%b!=0)
    {
       rem =  a%b ; 

        a=b;
        b=rem;
    }
    
    gcd = b;
    
    cout<<"HCF = " <<gcd;
}