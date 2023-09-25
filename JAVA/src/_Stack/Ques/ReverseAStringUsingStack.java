package _Stack.Ques;

import java.util.Stack;

public class ReverseAStringUsingStack {

    private String str;
    public ReverseAStringUsingStack(String str)
    {
        this.str=str;
    }

    public void Reverse() {
        Stack<Character> stack = new Stack<>();
        char ch[] = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            stack.push(ch[i]);
        }


        while (!stack.isEmpty())
        {
            System.out.print(stack.pop());
        }
    }
    public static void main(String[] args) {
        ReverseAStringUsingStack obj = new ReverseAStringUsingStack("Gurjot");
        obj.Reverse();
    }
}
