package Problems;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Find_Largest_Of_3_Numbers {


    public static void main(String []args)
    {
        int n1=-30;
        int n2=50;
        int n3=100;

        int lar=n1>n2?n1:n2;
        int largest=lar>n3?lar:n3;
        System.out.println("Largest:"+largest);
        /*
        method 2
        if(n1>n2 && n1>n3)
            N1 is largest
        else if(n2>n1 && n2>n3)
            N2 is largest
        else
            N3 is Largest

         */

    }
}
