package Problems;

import java.util.Scanner;

public class Reversing_a_number {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int rev=0;
        while (num!=0)
        {
            rev=num%10+rev*10;
            num/=10;
        }
        System.out.println("Reversed number"+rev);
        //method 2

        int n=120;
        StringBuffer r;
        StringBuffer sb=new StringBuffer(String.valueOf(n));
        r=sb.reverse();
        System.out.println("Reversed num:"+r);

        //method 3
        /*

        StringBuilder s=new StringBuilder();
        s.append(n);
        StringBuilder str=s.reverse();
        System.out.println(str);
         */


    }

}
