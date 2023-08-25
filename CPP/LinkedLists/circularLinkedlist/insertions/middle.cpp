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
void pushMiddle(Node *&head,int value,int pos)
{  
    // count total nodes in list
    int totalNode= countList(head);
    Node *newNode = new Node(value);
    Node *ptr =  head;
    Node* current;
    int k = 0; 
    if (ptr==NULL)
    {
       head=newNode;
    }
    else if (pos==0){
        // insert at begin 
       do{
           ptr=ptr->next;
       }
       while(ptr->next!=head);

       newNode->next=head;
       ptr->next = newNode;
       head=newNode;

    }
    else if(pos==totalNode){
        do{
           ptr=ptr->next;
       }
       while(ptr->next!=head);

       ptr->next= newNode;
       newNode->next=head;
    }
    else{
          while(k<pos && ptr->next!=head)
          {
            current=ptr;
            ptr=ptr->next;
            k++;
          }

          current->next= newNode;
          newNode->next=ptr;
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
       pushMiddle(head,100,2);
       printList(head);
    return 0;
}