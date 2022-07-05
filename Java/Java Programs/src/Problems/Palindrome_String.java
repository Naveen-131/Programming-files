package Problems;

import java.util.Scanner;

public class Palindrome_String {
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        String in=obj.nextLine();
        String rev="";
        for(int i=in.length()-1;i>=0;i--)
        {
            rev=rev+in.charAt(i);
        }
        if(in.equals(rev))
        {
            System.out.println("Palindrome String");

        }
        else
        {
            System.out.println("Not a Palindrome String");
        }

    }
}
