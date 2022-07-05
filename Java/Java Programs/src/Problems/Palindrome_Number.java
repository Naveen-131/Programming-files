package Problems;

import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=obj.nextInt();
        int temp=num;
        int rev=0;
        while(num!=0)
        {
            rev=num%10+rev*10;
            num/=10;
        }
        if(temp==rev)
        {
            System.out.println("Palindrome Number"+rev);
        }
        else
        {
            System.out.println("not palindrome number");
        }
    }
}
