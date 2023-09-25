#include <iostream>
#include <string.h>
using namespace std; 

bool checkPalindrome(char str[], int n )
{
    int s = 0 ; 
    int e = n-1 ; 
    while(s<e)
    {
        if (str[s++]!=str[e--])
        return false ;
    }
    return true;
}

int main(){
   char str[200];
   cin>>str;
   if (checkPalindrome(str, strlen(str)))
   {
    cout<<"Yes string is palindrome"<<endl;

   }
   else
   {
    cout<<"string is not palindrome"<<endl;
   }
}