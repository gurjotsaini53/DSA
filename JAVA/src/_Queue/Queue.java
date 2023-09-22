package _Queue;

import org.omg.Messaging.SyncScopeHelper;


//Queue is data structure which follow  FIFO principle (first in first out)

//The Queue interface is present in the java.util package.
//It is an ordered list of objects that follows the FIFO (First-In-First-Out) principle.

//The Queue is used to insert elements at the end of the queue and removes elements from the beginning of the queue.
// It supports all methods of Collection interface including insertion, deletion etc.
// LinkedList, ArrayBlockingQueue and PriorityQueue are the most commonly used implementations.
public class Queue {

    private static  final int defaultCapacity=10;
    private int front ;
    private int rear;
    private int nItems;


    private int maxSize;

    private int arr[];

    public Queue()
    {
        this(defaultCapacity);
    }
    public Queue(int size)
    {
        maxSize=size;
        arr=new int[maxSize];
        front=0;
        rear=-1;
        nItems=0;
    }


    // check the queue is full
    public boolean isFull()
    {
//        return rear==maxSize-1;
        return nItems==maxSize;
    }

    // check is queue empty?

    public boolean isEmpty(){
//        return (rear==-1 && front==-1);
        return nItems==0;
    }


    // max elements queue can hold
    public int getSize(){
        return maxSize;
    }


    // front element
    public int peekFront(){
        return arr[front];
    }

    // rear element
    public int peekRear(){
        return arr[rear];
    }


    // insert element at rear
    public void enqueue(int value)
    {
        if (isFull())
        {
            throw  new IllegalStateException("Queue is full can't add element");
        }
        else{
             arr[++rear]=value;
             nItems++;
        }
    }

    // remove first element
    public int dequeue() {
        int temp;
        if (isEmpty()) {
            return -1;
        } else {
             temp = arr[front];
            front++;
            nItems--;
        }
        return temp;

    }

    public static void main(String[] args) {
        Queue q1= new Queue(4);
        System.out.println(q1.isEmpty());
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);

        System.out.println(q1.isFull());
//        q1.insert(50);  // ERROR cannot add element to queue as stack is full


        System.out.println(q1.getSize()); // 4
        System.out.println(q1.peekFront()); // 10
        System.out.println(q1.peekRear()); // 40

        q1.dequeue();  // remove 10

        System.out.println(q1.peekFront()); // 20
    }
}
