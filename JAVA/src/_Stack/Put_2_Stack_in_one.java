package _Stack;

public class Put_2_Stack_in_one {
    public static void main(String[] args) {
        StackArrayImplementation s1 = new StackArrayImplementation();
        StackArrayImplementation s2 = new StackArrayImplementation();

        // result stack
        StackArrayImplementation res = new StackArrayImplementation();



        // stack s1
        s1.push(10);
        s1.push(20);
        s1.push(30);

        // stack s2
        s2.push(40);
        s2.push(50);
        s2.push(60);

        s2.push(s1.pop());
        s2.push(s1.pop());
        s2.push(s1.pop());


        // put s2(s1) content in s1

        res.push(s2.pop());
        res.push(s2.pop());
        res.push(s2.pop());

        // put s2 in s1

        s1.push(s2.pop());
        s1.push(s2.pop());
        s1.push(s2.pop());

        // put s1 in res;

        res.push(s1.pop());
        res.push(s1.pop());
        res.push(s1.pop());


        /// print res stack

        System.out.println(res.pop());
        System.out.println(res.pop());
        System.out.println(res.pop());
        System.out.println(res.pop());
        System.out.println(res.pop());
        System.out.println(res.pop());



    }
}
