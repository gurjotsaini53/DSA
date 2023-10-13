#include <iostream>
using namespace std;


void toh(int n , char source , char auxilary , char Destination)
{
    if (n==0)
    return;
   
   toh(n-1,source,Destination,auxilary);
   cout<<"moving rod " << n << " from " <<source <<" to "<<Destination<<endl;
   toh(n-1,auxilary,source,Destination);
  

}
int main(){

    int n = 3;
    toh(n,'A','B','C');
}