package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_HashSet {
    public static void main(String args[])
    {

        LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
        hs.add(10);
        hs.add(20);
        hs.add(50);
        hs.add(40);

        // print elements to the console
        System.out.println("Initial HashSet " + hs);

        // Removing the element b
        hs.remove(50);

        System.out.println("After removing element " + hs);

        Iterator itr=hs.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }



    }

}
