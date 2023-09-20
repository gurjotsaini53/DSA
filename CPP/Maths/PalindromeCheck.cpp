 #include <iostream>
using namespace std;

int main(){
    int n;
    cin>>n;

    
        int temp = n, rev=0, rem;
        while (temp>0){
            rem = temp%10;
            rev = rev*10+rem;
            temp/=10;
        }

        if (rev==n) cout<< "Number is Palindrome";
        else cout<<"Number is not Palindrome";

}