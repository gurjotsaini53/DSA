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
      
      // creating manually list
      Node *head = new Node(10);
      Node *second = new Node(20);
      Node *third = new Node(30);

     // forward linking 

     head->next= second;
     second->next = third;
     third->next = NULL;

     // backward linking

     head->prev=  NULL;
     second->prev = head;
     third->prev= second;


     // head prev and third next will be automatically NULL by contructor but we have shown for better understanding 
     

     printList(head);
     printReverseList(head);
 
    return 0;
}