package Collections;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Linked_HashMap {
    public static void main(String args[])
    {
        LinkedHashMap<Integer,String> hm=new LinkedHashMap<>();
        // Add mappings using
        // put() method
        hm.put(3, "Geeks");
        hm.put(2, "Geek");
        hm.put(1, "Geeks");

        // print mappings to the console
        System.out.println("Mappings of LinkedHashMap : " + hm);

        // print mappings to the console
        System.out.println("Initial map : " + hm);

        // Update the value with key 2
        hm.put(2, "For");
        hm.put(4,"Naveen");
        hm.put(5,"Sai");

        // print the updated map
        System.out.println("Updated Map : " + hm);



        // Remove the mapping with Key 4
        hm.remove(4);

        // print the updated map
        System.out.println("Updated Map : " + hm);

        for(Map.Entry<Integer,String> m:hm.entrySet())
        {
            System.out.println("Key : "+m.getKey()+" Value : "+m.getValue());
        }


    }
}
