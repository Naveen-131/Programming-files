package Collections;

import java.util.Map;
import java.util.TreeMap;

public class Tree_Map {
    public static void main(String []args)
    {
        TreeMap<Integer,String> tm=new TreeMap<>();

        // Inserting the Elements
        tm.put(3, "Geeks");
        tm.put(2, "Geeks");
        tm.put(1, "Geeks");

        System.out.println(tm);

        //Changing the element
        tm.put(2, "For");
        System.out.println(tm);
        tm.put(4, "For");

        //remove
        tm.remove(3);

        System.out.println(tm);


        for(Map.Entry<Integer,String> m: tm.entrySet())
        {
            System.out.println("KEY :  "+m.getKey()+" VALUE: "+m.getValue());

        }





    }
}
