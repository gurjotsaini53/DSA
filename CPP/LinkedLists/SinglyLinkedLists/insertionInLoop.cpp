#include <iostream>
using namespace std;

class Node
{
public:
    int data;
    Node *next;
    
    Node() { 
        // default constructor for empty list;
      
    }
    Node(int value)
    {
        this->data = value;
        this->next=NULL;
    }
};

void printList(Node *head)
{

    Node *ptr = head;
    if (ptr==NULL)
    {
        cout<<"list is empty"<<endl;
    }
    while (ptr != NULL)
    {
        cout << ptr->data << " ";
        ptr = ptr->next;
    }
    cout << "\n";
}



void pushEnd(Node *&head, int value)
{
      // first create a new node
      Node * newNode  = new Node(value);


      if (head==NULL)
      {
        // then new node is head means first node
        head = newNode;
      }
      else
       {
           Node *ptr = head;
           while(ptr->next!=NULL)
           {

            ptr=ptr->next;
           }

           ptr->next=newNode;
       }
}

int countListLength(Node *head)
{
    Node *ptr = head;
    int count = 0 ;
    while(ptr!=NULL)
    {
        count++;
        ptr=ptr->next;
    }

    return count;
}

int main()
{
    Node *head = new Node();
 head=NULL;
    int n, value;
    cin>>n ; 
    while(n--)
    {
        cin>>value;
        pushEnd(head,value);
    }
    printList(head);

}