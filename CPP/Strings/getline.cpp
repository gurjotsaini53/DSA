#include <iostream>
using namespace std; 

void reverse(string str)
{
    int s = 0 ;
    int e = str.length()-1;
    while(s<e)
    {
        // swap str[s] with str[e]
        char temp = str[s];
        str[s]=str[e];
        str[e]=temp;
        s++;
        e--;
    }
}
void reversewords(string str, int n){
    string temp = "";
    int k = 0 , j = 0 , p=0; 
    for (int i = 0 ; i<n;i++)
    {
            if (str[i]!='\0')
            {
                temp[k++]=str[i];
            }
            else{
                 reverse(temp);
                 for (int j = 0 ;j <temp.length();j++)
                 {
                    str[p++] = temp[j];
                 }
                 temp = "";
            }
    }
}
int main(){
    string s ; 
    getline(cin,s);
    reversewords(s,s.length());
    cout<<s<<"\n";

}