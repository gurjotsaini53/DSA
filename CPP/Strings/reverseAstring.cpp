#include <iostream>
#include <string.h>
using namespace std ;

void reverse(char str[], int n)
{
    int s = 0 ;
    int e = n-1;
    while(s<e)
    {
        // swap str[s] with str[e]
        char temp = str[s];
        str[s]=str[e];
        str[e]=temp;
        s++;
        e--;
    }
}
int main(){
 char str[100];
 cin>>str;
 reverse(str,strlen(str));
 cout<<str<<"\0";

 for (int i =  0 ; i < strlen(str) ;i++)
 {
    cout<<str[i];
 }
}