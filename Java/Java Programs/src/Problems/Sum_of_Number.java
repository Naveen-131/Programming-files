package Problems;

import java.util.Scanner;

public class Sum_of_Number {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int  num=obj.nextInt();
        int sum=0;
        while(num!=0)
        {
            sum+=num%10;
            num/=10;

        }
        System.out.println("Total sum of the number:"+sum);
    }
}
