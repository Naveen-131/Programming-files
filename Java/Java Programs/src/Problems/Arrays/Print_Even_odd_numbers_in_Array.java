package Problems.Arrays;

import java.util.Scanner;

public class Print_Even_odd_numbers_in_Array {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int[] arr=new int[10];
        String[] str=obj.nextLine().split(" ");
        System.out.println("Even Numbers of the Array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Integer.parseInt(str[i]);
            if(arr[i]%2==0)
            {
                System.out.print(" "+arr[i]);

            }
        }
        System.out.println();
        System.out.println("Odd Number of the array:");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.print(" "+arr[i]);

            }
        }





    }

}
