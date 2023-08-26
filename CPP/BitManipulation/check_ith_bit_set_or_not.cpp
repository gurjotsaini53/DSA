#include <iostream>
using namespace std;
 

void isKthBitSet(int n , int k ){
    
    int mask = 1<<(k-1);
    if (n&mask)
    {
        cout<<"SET"<<endl;
    }
    else{
        cout<<"NOT SET"<<endl;
    }

}
int main(){

    isKthBitSet(13,3);

    return 0 ;
}
