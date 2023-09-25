#include <bits/stdc++.h>

using namespace std;

// kth largets using frequency array

int kthlargest(int arr[], int n, int k){
    
    int maxEle = arr[0];
    for(int i=0; i<n; i++){
        if(arr[i]>maxEle)
            maxEle=arr[i];
    }
    
   
    
    int freqarray[maxEle + 1]={0};
    
    
    for(int i=0; i<n; i++){
        freqarray[arr[i]]++;
    }
    
    int count = k;
    
    for(int i=maxEle; i>=0; i--){
        if(freqarray[i] != 0){
            if(count == 1){
                return i;
            }
            else{
                count--;
            }
        }
    }
    
    return -1;
}

int main()
{
    int arr[] = {10, 10, 20, 30, 50, 100, 120, 80, 90, 150};
    int n = 10;
    int k = 3;
    cout << kthlargest(arr, n, k);
    
    return 0;
}
