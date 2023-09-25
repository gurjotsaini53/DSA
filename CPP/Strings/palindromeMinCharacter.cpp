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
int mini(string str)
{
    int start = 0 ; 
    int end = str.length()-1;
    int sum=0;
    while(start<end)
    {
        if (str[start]!=str[end])
        {
             sum++;
             start++;
        }
        else
        {
            start++;
            end--;
        }
    }
    return sum ; 
}
int main(){
   int n ; 
   cin>> n ; 
   string s ; 
   cin>>s  ;
   cout<<mini(s);
}