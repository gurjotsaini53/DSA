#include <iostream>
using namespace std;
int maxi(int n,int arr[])
{
   int max=arr[0];
   for (int i = 0 ; i<n;i++)
   {
    if (arr[i]>max)
    max=arr[i];
   }
   return max;
}
int mini(int n,int arr[])
{
   int min=arr[0];
   for (int i = 0 ; i<n;i++)
   {
    if (arr[i]<min)
    min=arr[i];
   }
   return min;
}



int main(){


    int n1 =7 ; 
    int  arr[n1]={2,4,6,7,9,10,11};

    int hashSize = maxi(n1,arr);

    int hashmap[hashSize+1]={0};

    for (int i = 0 ; i<n1;i++)
    {
        hashmap[arr[i]]++;

    }
    int minimum = mini(n1,arr) , count=0;
    for (int i = minimum ; i < hashSize+1 ;i++)
    {
        if (hashmap[i]==0)
        {
            count++;
        }
    }

    cout<<count<<endl;
}