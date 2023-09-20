#include <iostream>
using namespace std;

int gcd(int a, int b)
{
 int gcd,rem;
    while(a%b!=0)
    {
       rem =  a%b ; 

        a=b;
        b=rem;
    }
    
    gcd = b;
    return gcd;
}

int lcm(int arr[], int n)
{
    int lcm =1;
    for (int i=0;i<n;i++)
    {
        lcm = (lcm*arr[i])/gcd(lcm,arr[i]);
    }
    return lcm;
}
int main(){
  
     int n;
     cin>>n;
     int arr[n];
      
      for (int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    cout<<lcm(arr,n);

     
}