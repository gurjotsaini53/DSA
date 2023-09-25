#include <iostream>
#include <string.h>
using namespace std; 


char toLowercase(char ch)
{ 
    // if the given character is already in lowercase
    if (ch>='a' && ch<='z')
    {
        return ch ; 
    }
    else{
        return ch-'A'+'a';
    }
}
char toUppercase(char ch)
{
    // if the given character is already in uppercase
    if (ch>='A' && ch<='Z')
    {
        return ch ; 
    }
    else{
        return ch-'a'+'A';
    }
}
int main(){
 char ch; 
 cin>>ch;
 cout<<"lowercase : "<<toLowercase(ch)<<endl;
 cout<<"Uppercase : "<<toUppercase(ch)<<endl;
}