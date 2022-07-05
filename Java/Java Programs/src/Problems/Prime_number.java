package Problems;

import java.util.Random;
import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int count=0;

        if(num>1)
        {
            for(int i=1;i<=num;i++)
            {
                if(num%i==0)
                {
                    count++;
                }


            }
            if(count==2)
            {
                System.out.println("Prime Number:"+num);
            }
            else
            {
                System.out.println("Not a Prime Number:"+num);
            }


        }


    }
}
