package Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priority_Queue {
    public static void main(String args[]) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(30);
        q.add(50);

        System.out.println(q);

        System.out.println(q.peek());

        System.out.println(q.poll());

        System.out.println(q);

        System.out.println("Size of the queue: " + q.size());


        Iterator itr = q.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }





    }
}
