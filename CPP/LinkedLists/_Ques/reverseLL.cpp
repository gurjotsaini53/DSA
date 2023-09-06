#include <iostream>
#include <list>
using namespace std;

void print(list<int> ll)
{
    list<int>::iterator i = ll.begin();
    while (i != ll.end())
    {

        cout << *i << " ";
        i++;
    }
}

list<int> reverse(list<int>ll)
{
        list<int>ans ;
         list<int>::iterator i = ll.end();
    while (i != ll.begin())
    {

        ans.push_back(*i);
        i++;
    }
    return ans;
}
int main()
{

    list<int> ll;
    ll.push_back(10);
    ll.push_back(20);
    ll.push_back(30);
    ll.push_back(40);
    ll.push_back(50);

    print(ll);
    ll=reverse(ll);
    print(ll);


}