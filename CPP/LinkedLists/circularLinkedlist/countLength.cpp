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