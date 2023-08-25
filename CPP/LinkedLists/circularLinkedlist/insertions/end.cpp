#include <iostream>
using namespace std;

class Node{
    public :
    int data ;
    Node *next;

    Node(int value)
    {
        this->data = value;
        this->next = NULL;
    }
};

void printList(Node *head)
{
    Node *ptr = head;
    do{
      cout<<ptr->data<<" ";
        ptr=ptr->next;
    }
    while(ptr!=head);
    cout<<"\n";
}
void pushEnd(Node *&head,int value)
{
    Node *newNode = new Node(value);
    Node *ptr =  head;
    if (ptr==NULL)
    {
       head=newNode;
    }
    else{
       do{
           ptr=ptr->next;
       }
       while(ptr->next!=head);

       ptr->next= newNode;
       newNode->next=head;

    }
}
int main(){
      
      Node *head = new Node(10);
      Node *second = new Node(20);
      Node *third = new Node(30);
      Node *fourth  = new Node(40);
     

       head->next = second;
       second->next = third;
       third->next = fourth;
       fourth->next = head;
       

       printList(head);
       pushEnd(head,100);
       printList(head);
    return 0;
}