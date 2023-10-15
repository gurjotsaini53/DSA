package _Stack.Ques;

public class Stack2InArrayOptimized {

    private int top1 ;
    private int top2;
    private  int size;

    private int arr[];


    public Stack2InArrayOptimized(int capacity)
    {
        top1=-1;
        top2=capacity;
        arr = new int[capacity];
        size=capacity;

    }


    public void push1(int value)
    {
        if (top2-top1 > 1)
        {
            top1++;
            arr[top1]=value;
        }
        else{
            System.out.println("Stack Overflow");
        }
    }

    public void push2(int value)
    {
        if (top2-top1 > 1)
        {

        top2--;
        arr[top2]=value;

        }
        else{
            System.out.println("Stack Overflow");
        }
    }
    public int pop1()
    {
        if (top1 >= 0)
        {

                int popedValue = arr[top1];
                top1--;
                return popedValue;


        }
        else{
            System.out.println("Stack underflow");
            return -1;
        }
    }

    public int pop2()
    {
        if (top2<size)
        {
            int popedValue = arr[top1];
            top1++;
            return popedValue;

        }
        else{
            System.out.println("Stack underflow");
            return -1;

        }
    }

    public void printArr()
    {
        for (int i=0;i<arr.length;i++)

        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
      Stack2InArrayOptimized obj = new Stack2InArrayOptimized(10);


        obj.push1(10);
        obj.push1(20);
        obj.push1(30);


        obj.push2(100);
        obj.push2(90);
        obj.push2(80);
        obj.push2(70);
        obj.push2(60);
        obj.push2(50);

        obj.push2(40);


        obj.push1(5000); // stack overflow
        obj.pop1();
        obj.push1(5000);


        obj.printArr();





    }
}
