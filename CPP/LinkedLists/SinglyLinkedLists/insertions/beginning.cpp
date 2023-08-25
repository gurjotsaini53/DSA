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



void pushBegin(Node *&head, int value)
{
      // first create a new node
      Node * newNode  = new Node(value);


      if (head==NULL)
      {
        // then new node is head means first node
        head = newNode;
      }
      else
       {
        // point newNode->next = head and head =  newNode;
        newNode->next = head;
        head=newNode;
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
    pushBegin(head,100);
    printList(head);

}