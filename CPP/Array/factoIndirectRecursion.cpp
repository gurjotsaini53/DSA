#include <iostream>
using namespace std ; 

int fact(int n)
{
    if(n==0) z
    return 1;
    else
    return n*fact2(n-1);
}
int fact2(int n)
{
    if(n==0) return 1;
    else
    return n*fact(n-1);
}
int main(){
   cout<<fact(4);
}