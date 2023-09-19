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

void popMiddle(Node *&head, int pos)
{
      int TotalNodes  = countList(head);
    Node *ptr = head ; 
    Node *current ;
    int k = 0;
    if (ptr==NULL)  cout<<"List is empty"<<endl;
     else if (pos==0)
     {

        // first element
         head=head->next  ;
       head->prev=NULL;
       delete ptr;
     }
     else if (pos==TotalNodes-1)
     {

        // last element
        while(ptr->next!=NULL)
       {
        current=ptr;
        ptr=ptr->next;
       }
           
       current->next=NULL;
       delete ptr;
     }
    else
    {
      while(ptr->next!=NULL && k<pos)
      {
         
        current=ptr;
        k++;
        ptr=ptr->next;
      }

      current->next= ptr->next;
      ptr->next->prev = current;
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
     popMiddle(head,2);
     printList(head);
    return 0;
}