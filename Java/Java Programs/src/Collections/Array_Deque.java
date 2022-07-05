package Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

public class Array_Deque {
    public static void main(String[] args)
    {
        Deque<Integer> q=new ArrayDeque<>();

        q.add(10);
        q.addFirst(5);
        q.addLast(20);
        q.add(20);
        System.out.println(q);

        System.out.println("Front: "+q.getFirst());
        System.out.println("Rear: "+q.getLast());

        q.remove();
        System.out.println(q);
        q.removeLast();
        System.out.println(q);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q);

        //deque as a stack

        q.push(60);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q);


        Iterator itr=q.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next());
        }








    }
}
