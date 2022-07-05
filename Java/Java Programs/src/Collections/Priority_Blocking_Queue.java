package Collections;

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class Priority_Blocking_Queue {
        public static void main(String args[])
        {

        Queue<Integer> pbq= new PriorityBlockingQueue<Integer>();

        // Adding items to the pbq
        // using add()
        pbq.add(10);
        pbq.add(20);
        pbq.add(15);

        // Printing the top element of
        // the PriorityBlockingQueue
        System.out.println(pbq.peek());
        System.out.println(pbq);

        // Printing the top element and
        // removing it from the
        // PriorityBlockingQueue
        System.out.println(pbq.poll());
            System.out.println(pbq);
            pbq.add(40);


        // Printing the top element again
        System.out.println(pbq.peek());
            System.out.println(pbq);

    }
}
