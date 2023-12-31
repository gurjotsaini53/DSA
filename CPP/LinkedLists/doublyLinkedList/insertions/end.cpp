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


void pushEnd(Node *&head , int value)
{
    // create a new node
    Node *newNode = new Node(value);
    Node *ptr = head ; 
    Node *current ;
    if (ptr==NULL)
    {
        // new node is head
        head =  newNode;

    }
    else
    {
       while(ptr->next!=NULL)
       {
        ptr=ptr->next;
       }

       ptr->next=newNode;
       newNode->prev=ptr;
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
     pushEnd(head,100);
     printList(head);
   
    return 0;
}