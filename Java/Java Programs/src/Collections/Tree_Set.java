package Collections;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Tree_Set {

    public static void main(String args[])
    {
        TreeSet<String> ts=new TreeSet<>();

        // Elements are added using add() method
        ts.add("Geek");
        ts.add("For");
        ts.add("Geeks");

        System.out.println(ts);

        String check = "Geeks";

        // Check if the above string exists in
        // the treeset or not
        System.out.println("Contains " + check + " "
                + ts.contains(check));

        // Print the first element in
        // the TreeSet
        System.out.println("First Value " + ts.first());

        // Print the last element in
        // the TreeSet
        System.out.println("Last Value " + ts.last());

        String val = "Geek";

        // Find the values just greater
        // and smaller than the above string
        System.out.println("Higher " + ts.higher(val));
        System.out.println("Lower " + ts.lower(val));

        // Iterating though the TreeSet
        for (String value : ts)
            System.out.print(value + ", ");
        System.out.println();

    }
}
