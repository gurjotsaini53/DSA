#include <iostream>
using namespace std ;

int getLength(char str[])
{
    int count =  0 ; 
    for (int i =  0 ; str[i] != '\0' ;i++)
    {
        count++;
    }
    return count;
}
int main(){
 char str[100];
 cin>>str;
 cout<<"Length of the String is : "<< getLength(str)<<"\n";
}