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


int countList(Node *head)
{
    int count=0;
    Node *ptr = head;
    do{
      count++;
        ptr=ptr->next;
    }
    while(ptr!=head);
    return count;
}
void popList(Node *&head,int pos)
{
    Node *ptr =  head;
    Node *current;
    int totalnodes = countList(head);
    if (ptr==NULL)
    {
      cout<<"List is empty"<<endl;
    }

    else if (pos==0)
    {
         do{
           ptr=ptr->next;
       }
       while(ptr->next!=head);
       Node *deleteNode  = ptr->next;
       head=head->next;
       ptr->next=head;

       delete deleteNode;
        
    }

    else if (pos==totalnodes)
    {
           do{
            current=ptr;
           ptr=ptr->next->next;
       }
       while(ptr->next!=head);
      

      


    }
    else{
       do{
           ptr=ptr->next;
       }
       while(ptr->next!=head);


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
       popList(head,0);
       printList(head);
    return 0;
}