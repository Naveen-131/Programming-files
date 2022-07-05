package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist {
    public static void main(String [] args)
    {
        LinkedList<String> list=new LinkedList<String>();

        //Adding elements
        list.add("one");
        list.add("two");
        list.add(2,"three");
        System.out.println(list);

        list.addFirst("hello");
        list.addLast("Wellcome");
        System.out.println(list);

        list.add(4,"bye");
        System.out.println(list);

        //Removing Elements
        list.remove(4);
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.addLast("four");
        list.addLast("five");

        System.out.println(list);

        //fetching elements

        System.out.println(list.get(3));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.remove("five");
        System.out.println(list);

        //changing elements

        list.set(3,"Hello");
        System.out.println(list);
        list.add(3,"four");

        System.out.println("Size of linked list "+list.size());

        //iterator

        Iterator itr=list.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("Backward iteration" );
        Iterator itr1=list.descendingIterator();

        while(itr1.hasNext())
        {
            System.out.println(itr1.next());
        }



        ListIterator listIt = list.listIterator();

        // Iterating the list in forward direction
        System.out.println("Forward iteration:");
        while(listIt.hasNext()){
            System.out.println(listIt.next());
        }

        // Iterating the list in backward direction
        System.out.println("\nBackward iteration:");
        while(listIt.hasPrevious()) {
            System.out.println(listIt.previous());
        }

        //converting Linked list to array list
        System.out.println("Arraylist" );
        ArrayList<String> arr=new ArrayList<>(list);
        for(String s:arr)
        {
            System.out.println(s);
        }


    }
}
