package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_{
    public static void main(String args[])
    {
        //Queue is an interface, we cannot provide the direct implementation of it.
        //In order to use the functionalities of Queue, we need to use classes that implement it:
        //ArrayDeque
        //LinkedList
        //PriorityQueue

        Queue<Integer> q=new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(30);
        System.out.println(q);

        System.out.println(q.peek());
        System.out.println(q.element());
        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q);
        q.add(50);
        System.out.println(q.poll());
        System.out.println(q);

        Iterator itr=q.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }


    }
}
