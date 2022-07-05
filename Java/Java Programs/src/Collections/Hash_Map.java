package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hash_Map {
    public static void main(String args[]){

        HashMap<Integer,String> hm=new HashMap<>();

        hm.put(1,"Naveen");
        hm.put(5,"Sai");
        hm.put(3,"Kumar");

        System.out.println(hm);

        // Print size and content
        System.out.println("Size of map is:- "+ hm.size());

        Iterator itr=hm.keySet().iterator();

        while(itr.hasNext())
        {

            System.out.println(" :  "+hm.get(itr.next()));
        }

        hm.put(2, "Geeks");
        hm.put(4, "Geeks");

        System.out.println("Initial Map " + hm);

        hm.put(2, "For");

        System.out.println("Updated Map " + hm);


        // Initial HashMap
        System.out.println("Mappings of HashMap are : "
                + hm);

        // remove element with a key
        // using remove method
        hm.remove(4);

        // Final HashMap
        System.out.println("Mappings after removal are : "
                + hm);









    }
}
