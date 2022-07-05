package Collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Navigable_Set {

    public static void main(String args[])
    {
        NavigableSet<Integer> ns=new TreeSet<>();
        ns.add(0);
        ns.add(1);
        ns.add(2);
        ns.add(3);
        ns.add(4);
        ns.add(5);
        ns.add(6);

        System.out.println("Normal order: " + ns);
        System.out.println("Reverse order: " + ns.descendingSet());

        // Removing the element b
        ns.remove(5);

        System.out.println("After removing element " +ns);

        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("Navigable Set:  " + ns);

        System.out.println("pollLast(): " + ns.pollLast());
        System.out.println("Navigable Set:  " + ns);

        for(int i:ns)
        {
            System.out.println(i);
        }

    }
}
