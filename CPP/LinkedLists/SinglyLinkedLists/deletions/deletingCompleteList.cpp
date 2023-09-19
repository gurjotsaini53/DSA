#include <iostream>
using namespace std;

class Node
{
public:
    int data;
    Node *next;

    Node(int value)
    {
        this->data = value;
        this->next=NULL;
    }
};

void printList(Node *head)
{

    Node *ptr = head;
    if (ptr==NULL)
    {
        cout<<"list is empty"<<endl;
    }
    while (ptr != NULL)
    {
        cout << ptr->data << " ";
        ptr = ptr->next;
    }
    cout << "\n";
}


void deleteList(Node *&head)
{
      if (head==NULL)
      {
      cout<<"List is empty"<<endl;
      }
      else
       {
         Node *ptr = head;
         Node *DeleteNode;
        while(head!=NULL)
        {
       head = ptr->next;
       DeleteNode = ptr;
       ptr=ptr->next;

        }
       }
}

int countListLength(Node *head)
{
    Node *ptr = head;
    int count = 0 ;
    while(ptr!=NULL)
    {
        count++;
        ptr=ptr->next;
    }

    return count;
}

int main()
{
    Node *head = new Node(10);
    Node *second = new Node(20);
    Node *third = new Node(30);

    head->next = second;
    second->next = third;
    third->next = NULL;



    printList(head);
    deleteList(head);
    printList(head);

}