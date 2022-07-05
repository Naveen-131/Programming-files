package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Hash_Set {
    public static void main(String[] args)
    {
        Set<Integer> a=new HashSet<Integer>();
        a.addAll(Arrays.asList(new Integer[]{1,3,5,7,9,10}));
        Set<Integer> b= new HashSet<>();
        a.addAll(Arrays.asList(new Integer[]{1,2,3,6,8,9,11}));

        /* To find union
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("Union of the two Set : ");
        System.out.println(union);
         */

        // To find intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.println("Intersection of the two Set");
        System.out.println(intersection);

        /* To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(difference);

         */
        
        
        
 

    }
}
