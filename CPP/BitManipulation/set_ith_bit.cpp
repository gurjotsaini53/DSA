#include <iostream>
using namespace std;
 

int setIthBit(int n , int i ){
    
    int mask = 1<<(i-1);
    return  (n | mask);


}
int main(){

    cout<<setIthBit(13,2);

    return 0 ;
}
