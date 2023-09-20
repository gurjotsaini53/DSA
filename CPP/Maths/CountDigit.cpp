#include <iostream>
using namespace std;

int main(){
    int n;
    cin>>n;

    int temp =n, count=0;
    while(temp>0)
    {
        temp=temp/10;
        count ++;
    }
    cout<<"Digits in " << n <<" is " << count<<endl;
}