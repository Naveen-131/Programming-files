package JavaT_Points.Basic;

import java.util.Scanner;

public class Q2 {
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int temp=0;
        boolean flag=true;
        temp=num/2;
        if(num==0 || num==1)
        {
            System.out.println(num+"  is not prime number");
        }
        for(int i=2;i<=temp;i++)
        {
            if(num%i==0)
            {
                System.out.println(num+"  not a prime number");
                flag=false;
                break;
            }
        }
        if(flag==true)
        {
            System.out.println(num+" is prime number");
        }
    }
}
