package _Stack;

public class StackArrayImp {

    private final static int  default_capacity = 10;
    private int top;
    private int [] StackArray ;
    private int maxSize;



    public StackArrayImp(int size)
    {
        maxSize=size;
        StackArray = new int[maxSize];

        top=-1;
    }
    public StackArrayImp(){
        this(default_capacity);
    }


    public boolean isEmpty()
    {
        return top==-1;
    }

    public boolean isFull(){
        return (top+1==maxSize);
    }

    public int size(){
        return top+1;
    }

    public void makeEmpty(){
        top=-1;
    }


    public int pop(){
        if (!isEmpty())
        {
            return StackArray[top--];
        }
        if (top<maxSize/4){
            resize(maxSize/2);
            return pop();
        }
        else{
            System.out.println("This stack is already empty");
            return -1;
        }
    }

    public void push(int value){
        if (isFull())
        {
        //   System.out.println("Can't add stack is full - stack Overflow");
       // return;

            resize(maxSize*2);
             push(value);

        }
        else{
            StackArray[++top]=value;
        }
    }


    private void resize(int newSize)
    {
        int [] transferArray = new int[newSize];
        for (int i=0;i<StackArray.length;i++)
        {
            transferArray[i]=StackArray[i];
        }
        // this reference change here
        StackArray = transferArray;
        maxSize=newSize;
    }

    public int peek(){
        if (!isEmpty())
        {
            return StackArray[top];
        }
        else {
            System.out.println("The Stack is empty, can't peek");
            return -1;
        }
    }
    public static void main(String[] args) {


        StackArrayImp s1= new StackArrayImp(10);

        s1.push(10);
        s1.push(20);
        s1.push(30);

        System.out.println(s1.peek());;
        System.out.println(s1.isEmpty());
        s1.pop();
        System.out.println(s1.peek());;

        System.out.println(s1.size());
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.push(60);
        s1.push(70);
        s1.push(80);
        s1.push(90);
        s1.push(100);

        System.out.println(s1.isFull());



    }
}
