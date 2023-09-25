#include <iostream>
using namespace std ;

int main(){
   // making array of char
   char name[20];
   cout<<"Enter your name : ";
   cin>>name;
   // placing null character
   name[2]='\0'; 
   cout<<"Entered name is : "<<name<<"\n";
   for (int i = 0 ;i<20;i++)
   cout<<name[i]<<" ";
   // Gurjot 
}