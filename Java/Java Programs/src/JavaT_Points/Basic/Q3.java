package JavaT_Points.Basic;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int rev=0;
        int temp=num;

        while(num!=0)
        {
            rev+=num%10;
            num/=10;
        }
        if(rev==temp)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not a Palindrome Number");
        }

    }
}
