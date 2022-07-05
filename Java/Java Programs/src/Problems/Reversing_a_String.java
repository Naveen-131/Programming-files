package Problems;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Reversing_a_String {
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        String rev="";
        /*
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);

         */
        //method 2 using character array
        char[] a=str.toCharArray();
        for(int i=a.length-1;i>=0;i--)
        {
            rev=rev+a[i];
        }
        System.out.println(rev);



    }
}
