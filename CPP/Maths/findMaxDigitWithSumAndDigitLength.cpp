#include <iostream>
using namespace std ;

int formMaxNumber(int D)
{
    int num = 0  ;
    while(D--)
    {
        num=num*10+9;
    }
    return num;
}

int sumofDigit(int N)
{
    int sum=0;
    while(N>0)
    {
        int rem= N%10;
        sum+=rem;
        N/=10;
    }
    return sum;
}
int digit(int D, int S)
{

    int MaxRange= formMaxNumber(D);
    for (int i = MaxRange ; i>=0 ;i--)
    {
        if (sumofDigit(i)==S)
        {
            return i;
        }
    }
    return -1;
}

int main(){
   int D, S;
   cin>>D>>S ;
   cout<<digit(D,S)<<endl;

}
