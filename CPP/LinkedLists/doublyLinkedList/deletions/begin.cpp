#include <iostream>
using namespace std;

class Node{
    public :
    int data ;
    Node *prev , *next;

    Node(int value)
    {
        this->data = value;
        this->prev = NULL;
        this->next = NULL;
    }
};

void popBegin(Node *&head)
{
   
    Node *ptr = head ; 
    Node *current ;
    if (ptr==NULL)  cout<<"List is empty"<<endl;
    else
    {
       head=head->next  ;
       head->prev=NULL;
       delete ptr;
    }
}
void printList(Node *head)
{  
    Node*ptr= head;
    if (ptr == NULL)
    {
        cout << "list is empty"<<endl;
    }
    else
    {
        while(ptr!=NULL)
        {
            cout<<ptr->data<<" ";
            ptr=ptr->next;
        }
        cout<<"\n";
    }
}

int main(){
      
      Node *head = new Node(10);
      Node *second = new Node(20);
      Node *third = new Node(30);


     head->next= second;
     second->next = third;
     third->next = NULL;


     head->prev=  NULL;
     second->prev = head;
     third->prev= second;

     printList(head);
     cout<<"After removing first"<<endl;
     popBegin(head);
     printList(head);
  
    return 0;
}