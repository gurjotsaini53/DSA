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

void searchList(Node *head, int value)
{
   Node *ptr =head;
   if (ptr==NULL) cout<<"list is empty"<<endl;
   else
   {
    while(ptr!=NULL)
    {
        if (ptr->data==value) 
        {cout<<"data found"<<endl;
        return;}
        ptr=ptr->next;

    
    }
    cout<<"data not found"<<endl;
    return;
   }
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
     searchList(head,50);
     searchList(head,30);
    return 0;
}