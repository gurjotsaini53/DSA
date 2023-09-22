package _Stack.Ques;

public class TwoStackInArrayImplementation {

    private  int arr[] ;
    private int top1 ;
    private int top2;


    public TwoStackInArrayImplementation(int capacity){
        arr  = new int[capacity];
        top1=-1;
        top2=capacity;
    }


    // push element into stack 1
    public boolean push1(int value)
    {
        if (top1+1<top2)
        {
            arr[++top1]=value;
            return true;
        }
        else {

            return false; // stack 1 is full
        }

    }

    // push an element onto stack 2

    public boolean push2(int value)
    {
        if (top2-1>top1)
        {
            arr[++top2]=value;
            return true;
        }
        else {
            return false; // stack 2 is full
        }

    }

     // pop from stack 1
    public int pop1()
    {
        if (!isEmpty1())
        {
            return arr[top1--];
        }
        else {
            throw new IllegalStateException("Stack 1 is empty");
        }
    }


    // pop from stack 2
    public int pop2()
    {
        if (!isEmpty2())
        {
            return arr[top2++];
        }
        else {
            throw new IllegalStateException("Stack 1 is empty");
        }
    }


    // check stack 1 is empty

    public boolean isEmpty1(){
        if (top1==-1)
            return true;
        else return false;
    }

    // check stack 2 is empty

    public boolean isEmpty2(){
        if (top2==arr.length)
            return true;
        else return false;
    }
    public static void main(String[] args) {

    }
}
