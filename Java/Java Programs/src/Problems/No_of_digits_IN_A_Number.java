package Problems;

import java.util.Scanner;

public class No_of_digits_IN_A_Number {
    public static void   main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int count=0;
        while(num!=0)
        {
            num=num/10;
            count++;
        }
        System.out.println("Count of Digits :"+count);

    }
}
