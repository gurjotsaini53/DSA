#include <iostream>
using namespace std ;

int firstUniqiueOccurenceInString(string str)
{
  // return first unique occurence wala character in the string 
  int fa[26]={0};
    int size=str.size();
for (int i = 0 ; i<size;i++)
  {
    if (str[i]==' ')
    {
      continue;
    }
    fa[str[i]-'a']++;
  }
//  for(int i = 0 ;i<26;i++)
//  {
//     cout<<fa[i]<<" ";
//  }
    for (int i = 0 ;i<size;i++)
    {
       if (fa[str[i]-'a']==1)
       {
        return i; // unique character frequency index
       }
    }
    return -1;
}
 int main(){
    string str;
    cin>>str;
    if (firstoccurence(str)==-1){
   cout<<"no unique character"<<endl;
   return 0;
    }
  cout<<"unique character is "<<str[firstoccurence(str)]<<endl;

  
 }