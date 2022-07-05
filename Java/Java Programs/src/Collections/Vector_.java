package Collections;

import java.util.Iterator;
import java.util.Vector;

public class Vector_ {
    public static void main(String args[])
    {
        Vector<Integer> v=new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        v.add(3,40);
        System.out.println(v);

        System.out.println(v.get(2));
        System.out.println(v);
        System.out.println(v.remove(2));
        System.out.println(v);

        System.out.println("Size of the vector"+v.size());
        v.set(2,15);
        System.out.println(v);

        Iterator itr=v.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }

}
