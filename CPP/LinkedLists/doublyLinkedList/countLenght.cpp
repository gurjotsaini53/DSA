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

int countList(Node *head)
{

    int count=0;
    Node *ptr=head;
    while(ptr!=NULL)
    {
   count++;
   ptr=ptr->next;
    }
    return count;
}
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
      Node *fourth  = new Node(40);


     head->next= second;
     second->next = third;
     third->next = fourth;
     fourth->next = NULL;


     head->prev=  NULL;
     second->prev = head;
     third->prev= second;
     fourth->prev=third;

     printList(head);
      cout<<countList(head)<<endl;
    return 0;
}