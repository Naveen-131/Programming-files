package Collections;

import java.util.Stack;

public class Stack_ {
    public static void main(String args[])
    {
        Stack<Integer> s=new Stack<>();
        //add
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println(s);

        //remove
        s.pop();
        System.out.println(s);

        //fetch
        System.out.println(s.peek());
        s.push(40);
        s.push(20);


        //search

        System.out.println("Index of element 30 is :"+s.search(30));
        System.out.println(s);

        System.out.println("Check stack is empty: "+s.isEmpty());

    }
}
