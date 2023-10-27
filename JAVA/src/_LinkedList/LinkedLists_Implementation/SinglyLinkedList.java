package LinkedLists_Implementation;

class Node{
	public int data;
	public Node next;
	
	public Node(int data)
	{
		this.data =  data;
		this.next=null;
	}
};

public class SinglyLinkedList {

	
	// traversing - forward direction
	
	public static void printList(Node head)
	{
		Node ptr = head;
		while(ptr!=null)
		{
			System.out.print(ptr.data + "->");
			ptr=ptr.next;
			
		}
		System.out.print("null\n");
	}
	
	// traversing - backward direction using recursion
	
	
	public static void printListBackward(Node head)
	{
		if (head==null) return ;
		printListBackward(head.next);
		System.out.print(head.data+"-");
          
	}
	
	
	
    // searching 
	
	public static void SearchList(Node head, int data)
	{
		// 1 based indexing of node i.e. first Node is 1
		
		int n =1;
		Node ptr = head;
		while(ptr!=null)
		{
			if (ptr.data==data)
			{
				System.out.println("Data found in " + n + " node" );
				return;
			}
			n++;
		    ptr=ptr.next;
		}
		System.out.println("Data not found");
	}
	
	
	// Insertion 
	        // 1. At begin
	public static Node insertAtBegin(Node head, int data)
	{
		Node newNode = new Node(data);
		if (head==null) head = newNode ; // if head is null then newNode is head node
		else
		{
			newNode.next=head;
		    head=newNode;
		}
		return head;
	}
	
			// 2. At End
	
	public static Node insertAtEnd(Node head,int data)
	{
		Node newNode = new Node(data);
		if (head==null) head = newNode ; // if head is null then newNode is head node
		else {
			Node ptr = head;
			while(ptr.next!=null)
			{
				ptr=ptr.next;
				
			}
			ptr.next=newNode;
		}
		return head;
		
	}
	
			// 3. At Middle
	public static Node insertAtMiddle(Node head, int data, int position )
	{
		// count node 
		int listLength = countNode(head);
		if(position > listLength)
		{
			System.out.println("Position out of range");
			return head;
		}
		// make a new Node
		Node newNode = new Node(data);
		
		if (head==null) 
			head=newNode;
		else if (position == 1)
		{
			newNode.next=head;
			head=newNode;
		}
		else
		{
			
			// 1 based indexing
			
			
			Node ptr =head;
			while(ptr!=null && (--position)>1)
			{
				ptr=ptr.next;
				
			}
			
			newNode.next=ptr.next;
			ptr.next=newNode;
			
			
		}
		
		return head;
	}
	
	// count Nodes
	
	public static int countNode(Node head)
	{
		int c=0;
		Node ptr=head;
		while(ptr!=null)
		{
			c++;
			ptr=ptr.next;
		}
		return c;
	}
	
	// Deletion 
	
			// 1. At begin
	
	public static Node deleteAtBegin(Node head)
	{
		if (head==null) 
		{
			System.out.println("List is empty");
		}
		else
		{
			head=head.next;
		}
		
		return head;
	}
	
	// 2. At End
			
		public static Node deleteAtEnd(Node head)
		{
			if (head==null) 
			{
				System.out.println("List is empty");
			}
			else
			{
				Node ptr=head;
				while(ptr.next.next!=null)
				{
					ptr=ptr.next;
				}
				ptr.next=null;
				 
			}
			
			
			return head;
		}
		
		// 3. At middle
		public static Node deleteAtMiddle(Node head,int position)
		{
			
			// count node
			int listLength = countNode(head);
			if (position > listLength) 
			{
				
				System.out.println("position out of bound");
			}
			else if (head==null) 
			{
				System.out.println("List is empty");
			}
			
			else if (position ==1)
			{
				head=head.next;
			}
			else
			{
				Node ptr=head;
				Node prev =ptr;
				while(ptr!=null && (--position)>1)
				{
					prev=ptr;
					ptr=ptr.next;
					
				}
				
				 
			}
			
			
			return head;
		}
		
	public static void main(String[] args) {
		
		
		Node head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		
		head.next=second;
		second.next=third;
		System.out.println("------Traversing---------");
		printList(head);
		printListBackward(head);
		System.out.println();
		
		
		System.out.println("------Searching---------");
		SearchList(head, 10);
		SearchList(head, 60);

		System.out.println("------Insertion---------");
		
		head=insertAtBegin(head,100);
		printList(head);
	    
		head=insertAtEnd(head,500);
		printList(head);
		
		
		head=insertAtMiddle(head,200,3);
		printList(head);
		
		System.out.println("------Deletion---------");
       
		head=deleteAtBegin(head);
		printList(head);
	    
		head=deleteAtEnd(head);
	    printList(head);
			
		
		head=deleteAtMiddle(head,2);
		printList(head);
		System.out.println("------Count Node---------");
        System.out.println("Total Number of Nodes : "+countNode(head));
	}
}

