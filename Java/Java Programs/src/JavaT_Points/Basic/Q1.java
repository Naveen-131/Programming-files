package JavaT_Points.Basic;

import java.util.Scanner;

public class Q1 {
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
        int n1=obj.nextInt();
        int n2=obj.nextInt();
        System.out.print(n1+" ");
        System.out.print(n2+" ");
        int temp=0;
        int end=50;
        while(n2<end)
        {
            temp=n1+n2;
            System.out.print(temp+" ");
            n1=n2;
            n2=temp;

        }




    }
}
