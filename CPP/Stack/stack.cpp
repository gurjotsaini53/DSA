#include <iostream>
using namespace std;
const int SIZE = 100;
class Stack{

     int top;
     int arr[SIZE];

     public:

     Stack(){
        top=-1;
     }

     void push(int element){
            if (top==SIZE-1)
            {
                cout<<"Stack Overflow - can't push element"<<endl;
            }
            else
            {
                arr[++top]=element;
            }

     }

     int pop(){
        if(isEmpty()) {
            cout<<"Stack is empty"<<endl;
            return -1;
        }
        else
        return arr[top--];
     }


     int peek(){
        if (isEmpty())
        {
            cout<<"Stack is empty"<<endl;
        
        }
        else return arr[top];
     }
     bool isEmpty(){
        if (top==-1) return true;
        else return false;
     }

     bool isFull(){
        if (top==SIZE-1) return true;
        else return false;
     }


};

int main(){

    Stack st;
    cout<<st.isEmpty()<<endl;
    cout<<st.isFull()<<endl;
    st.push(100);
    cout<<st.isEmpty()<<endl;
    st.push(200);
    st.push(300);

    cout<<st.peek()<<endl;

    cout<<st.pop()<<endl;
    cout<<st.peek()<<endl;
    
    cout<<st.pop()<<endl;
    cout<<st.peek()<<endl;
    cout<<st.pop()<<endl;
    cout<<st.isEmpty()<<endl;

}