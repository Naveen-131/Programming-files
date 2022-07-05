package JavaT_Points.Basic;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int a=0;
        int temp=num;

        while(num!=0)
        {
            a+=Math.pow((num%10),3);
            num/=10;

        }
        if(temp==a)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not a Armstrong Number");
        }

    }
}
