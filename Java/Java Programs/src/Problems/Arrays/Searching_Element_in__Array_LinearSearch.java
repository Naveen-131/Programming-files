package Problems.Arrays;

import java.util.Scanner;

public class Searching_Element_in__Array_LinearSearch {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int[] a={1,2,3,4,5,6,7,8,9};
        System.out.println("Enter the No to find");
        int find=obj.nextInt();
        boolean flag=false;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]==find)
            {
                System.out.println("Element "+a[i]+" found at index "+i);
                flag=true;
            }
        }
        if(flag==false)
        {
            System.out.println("Element is Not found in the Array");
        }

    }
}
