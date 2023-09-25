#include <iostream>
using namespace std ;

// not working code

void allpairSum(int arr[], int size, int k )
{
    int s = 0 ;
    int e = size-1;
    while(s<=e)
    {
        if (arr[s]+arr[e]==k)
        {
            cout<<s<<" "<<e<<endl;
            s++;
            e--;
        }
        else if (arr[s]+arr[e]>k)
        {
                e--;
        }
        else
        {
            s++;
        }
    }
}
int main()
{
   int size,k ; 
   cin >> size;
   int arr[size];
   for (int i = 0 ; i <size ;i++)
   {
    cin>>arr[i];

   }
   cin>> k ;
   allpairSum(arr,size,k);

}