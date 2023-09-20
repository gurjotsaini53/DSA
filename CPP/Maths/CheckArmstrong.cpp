#include <iostream>
#include <cmath>
using namespace std;

int countDigit(int n)
{ int temp =n, count=0;
    while(temp>0)
    {
        temp=temp/10;
        count ++;
    }
    return count;
    }
int main(){


    int n;
    cin>>n;
    int temp = n, x=0, rem , digitCount=countDigit(n);

    while(temp > 0)
    {
        rem=temp%10;
        x+=pow(rem,digitCount);
        temp/=10;
    }
    
    if(n==x) cout<<"Armstrong"<<endl;
    else cout<<"Not Armstrong"<<endl;

}