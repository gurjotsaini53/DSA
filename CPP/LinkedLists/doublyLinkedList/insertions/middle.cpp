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

void printReverseList(Node *head)
{
    Node *ptr = head ; 

    if(ptr==NULL) cout<<"list is empty"<<endl; 
    else{
        while(ptr->next!=NULL)
        {
            ptr=ptr->next;
        }
        while(ptr!=NULL)
        {
            cout<<ptr->data<<" ";
            ptr=ptr->prev;
        }

        cout<<"\n";
    }
}

void pushMiddle(Node *&head , int value,int pos)
{
    // create a new node
    Node *newNode = new Node(value);
    Node *ptr = head ; 
    int k=0;
    Node *current ;
    if (ptr==NULL)
    {
        // new node is head
        head =  newNode;

    }
    else if (pos==0)
    {
        newNode->next=head;
        head->prev=newNode;
        head=newNode;
    }
    else
    {
       while(ptr->next!=NULL && k<pos)
       {
        k++;
        current=ptr;
        ptr=ptr->next;
       }

       current->next=newNode;
       newNode->prev=current ; 

       newNode->next=ptr;
       ptr->prev=newNode;
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
     pushMiddle(head,100,1);
     printList(head);
     printReverseList(head);
    return 0;
}