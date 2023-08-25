#include <iostream>
using namespace std;

class Node
{
public:
    int data;
    Node *next;
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


void SearchList(Node *head, int value)
{
    Node *ptr = head;

    while(ptr!=NULL)
    {
        if(ptr->data==value)
        {
            cout<<"data found"<<endl;
            return;
        } 
        ptr=ptr->next;
    }
    cout<<"data not found"<<endl;
    }
int main()
{

    Node *head = new Node();
    Node *second = new Node();
    Node *third = new Node();

    head->data = 10;
    second->data = 20;
    third->data = 30;


    head->next = second;
    second->next = third;
    third->next = NULL;

    
    printList(head);
    SearchList(head,10);
    SearchList(head,40);
}