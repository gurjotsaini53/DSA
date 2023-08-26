#include <iostream>
using namespace std;
 

int RemoveLastBit(unsigned int n ){
   return n&n-1;
}
int main(){

    cout<<RemoveLastBit(8)<<endl;
    cout<<RemoveLastBit(13)<<endl;
    return 0 ;
}
