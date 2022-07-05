package Problems;

import java.util.Scanner;

public class Count_no_of_Odd_Even_in_a_number {
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int temp=0;
        int count_odd=0;
        int count_even=0;
        while(num!=0)
        {
            temp=num%10;
            num/=10;
            if(temp%2==0)
            {
                count_even++;
            }
            else
            {
                count_odd++;
            }

        }
        System.out.println("Even count:"+count_even);
        System.out.println("Odd count:"+count_odd);
    }
}
