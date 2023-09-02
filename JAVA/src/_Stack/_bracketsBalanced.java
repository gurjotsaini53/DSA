package _Stack;

import java.util.Stack;

public class _bracketsBalanced {

    public static boolean isPared(char leftBracket , char rightBracket){

        char [][] pairBracket = {{'(',')'},{ '[',']' },{'{','}'}}  ;

        for (char[] pair : pairBracket )
        {
            if (pair[0]==leftBracket && pair[1]==rightBracket)
            {
                return true;
            }
        }
        return false;
    }

    public static boolean isBalanced(String brackets) throws IllegalAccessException {
        if (brackets==null)
        {
            throw new IllegalAccessException("Brackets is NULL");
        }

        Stack<Character> bracketsStack = new Stack<>();

        for (char bracket : brackets.toCharArray())
        {
            switch (bracket)
            {
                case '(':
                case '{':
                case '[':
                    bracketsStack.push(bracket);
                    break;
                case ')':
                case '}':
                case ']':
                    if (bracketsStack.isEmpty()  || !isPared(bracketsStack.pop(),bracket ))
                        return false;
                default:
                    return false; // not other character allowed

            }
        }
        return bracketsStack.isEmpty();
    }

    public static void main(String[] args) throws IllegalAccessException {
        System.out.println(isBalanced("[(])"));
    }
}
