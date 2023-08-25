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

    // creating Node manually

    Node *head = new Node();
    Node *second = new Node();
    Node *third = new Node();

    // intializing data to node
    head->data = 10;
    second->data = 20;
    third->data = 30;

    // linking Nodes to other nodes

    head->next = second;
    second->next = third;
    third->next = NULL;

    // third node is pointing to NULL because it is last node
    //  printing linked list
    printList(head);

    // count number of nodes in linked list

    cout<<"Number of nodes in linked is "<<countListLength(head)<<endl;
}