package Problems.Arrays;


import java.util.Scanner;

public class Sum_of_Arrays {
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        int[] arr=new int[5];
        String[] str=obj.nextLine().split(" ");
        for(int i=0;i< arr.length;i++)
        {
            arr[i]= Integer.parseInt(str[i]);
        }
        int sum=0;
        for(int i=0;i< arr.length;i++)
        {
            sum+=arr[i];
        }
        /*
        Method 2
        for(int i:arr)
            sum+=i;

         */
        System.out.println("Sum of array:"+sum);




    }
}
