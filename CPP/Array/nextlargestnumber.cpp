#include <bits/stdc++.h> 
using namespace std; 

void reverse(string str , int s , int e)
{
    while(s<e)
    {
        swap(str[s],str[e]);
        e--;
        s++;
    }
}
void swap(char a, char b)
{
    char temp = a;
    a = b; 
    b = temp ;
}
int main(){
    string str  ; 
    cin >>  str ; 
    int n = str.length() ;
    char temp;
     int i ; 
    for ( i = n-1; i>=0 ;i--)
    {
        if (i==0)
        {
            return 0  ;
        }
        if (str[i]>str[i-1])
        {
         temp = str[i-1];
         break;
        }
    }
     
     char minimum = min(str[i], str[n-1]);
    for (int j = i ; j<=n-1;j++)
    {
        if (str[j]>temp && str[i]<minimum  ){
            swap(str[i],str[n-1]);
        }
    }
    reverse(str,i,n-1);
    for (i = 0 ; i<n-1;i++)
    {
        cout<<str[i];
    }
}