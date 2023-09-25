#include <iostream>
using namespace std ;
char generatechar(int n)
{
     char character ='A' ;
    while(n>1)
    {
        character++;
        n-- ;
    }
    return character;
}

int main(){
    int n ;
    cin >> n ;
    string str=""; 
    cout<<generatechar(n);
}