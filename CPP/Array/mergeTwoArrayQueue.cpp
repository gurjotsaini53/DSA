#include <iostream>
#include <queue>

using namespace std;

void mergeArray(int n1,int arr1[], int n2, int arr2[])
{
    queue<int> q1 ;
    for (int i = 0;i<n1;i++)
    {
        q1.push(arr1[i]);
    }

    queue<int>q2;
    for (int i = 0;i<n1;i++)
    {
        q2.push(arr2[i]);
    }
    
    while(!q1.empty())
    {
        cout<<q1.front()<<" ";
        q1.pop();
    }
    while(!q2.empty())
    {
        cout<<q2.front()<<" ";
        q2.pop();
    }
}
int main(){
    int n1,n2;
    cin>>n1;
    int arr1[n1];
    for(int i = 0 ; i< n1;i++)
    {
        cin>>arr1[i];
    }
    cin >> n2;
    int arr2[n2];
     for(int i = 0 ; i< n2;i++)
    {
        cin>>arr2[i];
    }
    mergeArray(n1,arr1,n2,arr2);
}