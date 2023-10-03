package _LinkedList.SinglyLL;


class Node{
    int data;
    Node next ;
    Node (int x)
    {
        this.data=x;
        this.next = null;
    }
}


///  a singly linked list contain operations

// 1. traversal
//2. searching
//3. insertion (begin , end , middle)
//4. deletion (begin , end , middle)
//5. CountList
public class SinglyLLCreate {

    Node head;

    public SinglyLLCreate()
    {
        head = null;
    }

// traveral in singly linked list

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


    // searching

    public void Search(Node head, int key)
    {
        int k = 1;

        Node ptr = head;
        while (ptr!=null)
        {

            if (ptr.data==key)
            {
                System.out.println("value found at "  + k + "th Node");
                return;
            }
            k++;
            ptr=ptr.next;
        }

        System.out.println("Not Found");
    }

    public int search(Node head , int key)
    {
        Node ptr = head;
        int pos = 1 ;
        while (ptr!=null){
            if (ptr.data==key)
            {
                return pos;
            }
            pos++;
            ptr=ptr.next;
        }
        return -1;
    }


    // insertions in singly linked list
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
  public void InsertAtMiddle(Node head, int pos, int val)
  {

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

        System.out.println(obj.search(obj.head,200));
        obj.Search(obj.head,200);

    }
}
