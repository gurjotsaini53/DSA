package _Stack;

import java.util.Stack;

public class SortAStack {

    private Stack<Integer> stack;

    public SortAStack(){
        this.stack= new Stack<>();
    }

    public void addElementsInStack(){
        stack.add(5);
        stack.add(8);
        stack.add(10);
        stack.add(7);
        stack.add(2);
        stack.add(4);
        stack.add(1);
        stack.add(12);
    }

    public Stack<Integer> getStack(){
        return stack;
    }
    public void sort_Stack(Stack<Integer> _stack) {
        Stack<Integer> temp_stack = new Stack<>();


        while (!_stack.empty()) {
            int current_popped_value = _stack.pop();

            while (!temp_stack.empty() && temp_stack.peek() > current_popped_value) {
             _stack.push(temp_stack.pop());
            }
            temp_stack.push(current_popped_value);
        }

        // fill element in _Stack

        while (!temp_stack.empty())
        {
            _stack.push(temp_stack.pop());
        }

    }

    public void printStack(Stack<Integer> _stack){
           while (!_stack.empty())
           {
               System.out.print(_stack.pop()+ "  ");
           }
    }

    public static void main(String[] args) {


        SortAStack obj = new SortAStack();

        obj.addElementsInStack();
        obj.sort_Stack(obj.getStack());
        obj.printStack(obj.getStack());

    }
}
