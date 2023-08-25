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
void search(Node *head, int value)
{
    Node *ptr = head;
    if (ptr==NULL)
    {
        cout<<"list is empty"<<endl;
        return ;
    }
    else  {

    do{
        if (ptr->data==value)
        {
        cout<<"data found"<<endl;
            return;
        }
        ptr=ptr->next;
    }
    while(ptr!=head);
    }
    cout<<"data not found"<<endl;
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
       search(head,20);
       search(head,60);
    return 0;
}