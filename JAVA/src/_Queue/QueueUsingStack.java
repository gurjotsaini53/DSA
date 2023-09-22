package _Queue;

import java.util.Stack;

public class QueueUsingStack {


    /*

            enQueue(q, x):

            While stack1 is not empty, push everything from stack1 to stack2.
            Push x to stack1 (assuming size of stacks is unlimited).
            Push everything back to stack1.
            Here time complexity will be O(n)

            deQueue(q):

            If stack1 is empty then error
            Pop an item from stack1 and return it
            Here time complexity will be O(1)


     */
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int value)
    {
         while (!stack1.isEmpty()){
             stack2.push(stack1.pop());
         }

         stack1.push(value);

         while (!stack2.isEmpty()){
             stack1.push(stack2.pop());
         }
    }

    public int dequeue()
    {

        if (stack1.isEmpty())
        {
            return -1;
        }

        int pop = stack1.pop();
        return pop;

    }

    public static void main(String[] args) {

        QueueUsingStack q= new QueueUsingStack();

        q.enqueue(10);
        q.enqueue(20);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
