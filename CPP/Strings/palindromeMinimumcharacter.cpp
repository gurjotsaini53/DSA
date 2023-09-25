#include <iostream>
using namespace std ;

bool palindrom(int n, string str)
{
    int s = 0 , e=n-1 ;
    while(s<=e)
    {
        if (str[s]!=str[e])
        return false;

        s++,e--;
    } 
    return true; 
}
int main(){
   int n ; 
   cin>> n ; 
   string s ; 
   cin>>s  ;
   cout<<palindrom(n,s);
}