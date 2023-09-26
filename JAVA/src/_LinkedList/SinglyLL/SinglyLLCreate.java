package _LinkedList.SinglyLL;



public class SinglyLLCreate {
    class Node{
        int data;
        Node next ;
        Node (int x)
        {
            this.data=x;
            this.next = null;
        }
    }

    Node head;

    public SinglyLLCreate()
    {
        head = null;
    }


    public  Node InsertAtHead(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }
    public  Node InsertAtTail(int data)
    {
        Node newNode = new Node(data);

        if(head==null)
        {
            head = newNode;
            // if head is null then newnode is head node
        }
        else {

            Node ptr = head;
            while (ptr.next!=null)
            {
                ptr=ptr.next;
            }
            ptr.next=newNode;
        }
        return head;
    }


    public void printSLL(Node head)
    {
        Node ptr = head;

        while (ptr!=null)
        {
            System.out.print(ptr.data + " -> ");
            ptr=ptr.next;
        }

        System.out.println();
    }


    public int CountNode(Node head)
    {
        Node ptr = head;
        int count = 0 ;
        while (ptr!=null){
            ptr=ptr.next;
            count++;
        }
        return count;
    }
  public void InsertAtMiddle(Node head, int pos)
  {

      if (pos==1){

      }
  }

  public Node deleteAtHead()
  {
      if (head==null){
          System.out.println("List in empty");
          return null;
      }
      else
      {
          Node temp = head;
          head=head.next;
          temp.next=null;
          return head;

      }
  }
    public static void main(String[] args) {
    SinglyLLCreate obj = new SinglyLLCreate();

//   obj.head = obj.InsertAtHead(10);;
//    obj.head = obj.InsertAtHead(20);;
//    obj.head = obj.InsertAtHead(30);;
//



        // head insertion
        obj.InsertAtHead(10);
        obj.InsertAtHead(20);
        obj.InsertAtHead(30);

        // tail insertion
    obj.InsertAtTail(100);
        obj.InsertAtTail(200);

        obj.deleteAtHead();

    obj.printSLL(obj.head);
    }
}
