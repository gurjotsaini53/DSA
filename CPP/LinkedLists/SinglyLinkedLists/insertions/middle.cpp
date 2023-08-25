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


void pushMiddle(Node *&head, int value, int pos)
{
      // first create a new node
      Node * newNode  = new Node(value);
      int k=0;


      if (head==NULL)
      {
        // then new node is head means first node
        head = newNode;
      }
      else if (pos==0)
      {
        newNode->next=head;
        head=newNode;
      }
      else
       {
          Node *ptr = head;
          Node *prev;
          int k=0;

          while(ptr!=NULL && k < pos) 
          {
            prev=ptr;
            ptr=ptr->next;
            k++;
          }

          prev->next= newNode;
          newNode->next=ptr;
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
    pushMiddle(head,100,0);
    printList(head);

}