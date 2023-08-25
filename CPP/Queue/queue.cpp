#include <iostream>
using namespace std;

const int SIZE = 100;

class Queue{


    int arr[SIZE];
    int front ;
    int rear;
public:
    Queue(){
        front=-1;
        rear=-1;
    }
     bool isEmpty()
     {
        return rear==-1 && front==-1;
     }


    void enqueue(int element)
    {
        if (rear==SIZE-1)
        {
            cout<<"Queue Overflow -- cannot enqueue element"<<endl;
            return;
        }
        if (isEmpty())
        {
            front=0;
        }

        rear++;
        arr[rear]=element;
    }


    void dequeue(){
        if (isEmpty())
        {
            cout<<"Queue is Empty, cannot dequeue element."<<endl;
            return;
        }

        if (front==rear)
        {

            // if the queue has only one element , reset front and rear to -1
            front=-1;
            rear=-1;
        }
        else
        {
            front++;
        }
    }

     int peek(){
        if (isEmpty())
        {
              cout<<"Queue is empty , cannot peek element";
              return -1;
        }
        return arr[front];
     }

     
};

int main(){
      
      Queue q1;
      cout<<q1.isEmpty()<<endl;
      cout<<q1.peek()<<endl;


      q1.enqueue(100);
      q1.enqueue(200);
      q1.enqueue(300);
      q1.enqueue(400);


        cout<<q1.peek()<<endl;
        q1.dequeue();
        cout<<q1.peek()<<endl;
      cout<<q1.isEmpty()<<endl;
}