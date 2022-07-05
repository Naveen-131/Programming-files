package Problems;

import java.util.Scanner;

public class Factorial_Of_Number {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int fact=1;

        for(int i=num;i>0;i--)
        {
            fact=fact*i;
        }


        System.out.println("factorial "+fact);
    }
}
