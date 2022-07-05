package Collections;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sorted_Set {
    public static void main(String args[])
    {
        SortedSet<String> ts=new TreeSet<>();
        ts.add("Naveen");
        ts.add("B");
        ts.add("C");
        ts.add("v");
        System.out.println(ts);

        System.out.println("Sorted Set is " + ts);

        String check = "D";

        // Check if the above string exists in
        // the SortedSet or not
        System.out.println("Contains " + check
                + " " + ts.contains(check));

        // Print the first element in
        // the SortedSet
        System.out.println("First Value " + ts.first());

        // Print the last element in
        // the SortedSet
        System.out.println("Last Value " + ts.last());
        // Removing the element b
        ts.remove("B");

        System.out.println("After removing element " + ts);


        Iterator itr=ts.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
