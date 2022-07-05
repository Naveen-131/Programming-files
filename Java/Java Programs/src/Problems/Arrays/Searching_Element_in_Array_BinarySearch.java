package Problems.Arrays;

import java.util.Scanner;

public class Searching_Element_in_Array_BinarySearch {
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        int[] arr={10,20,30,40,50,60,70,80,90,100};
        int mid= arr.length/2;
        System.out.println("Enter the element to be found");
        int target=obj.nextInt();
        boolean flag=false;

        if(mid==target)
        {
            System.out.println("Element found at the index "+mid);
            flag=true;
        }
        else if( target<mid )
        {
            for(int i=mid-1;i>=0;i--)
            {
                if(arr[i]==target)
                {
                    System.out.println("Element found at the index "+i);
                    flag=true;
                }
            }
        }
        else
        {
            for(int i=mid+1;i<arr.length;i++)
            {
                if(arr[i]==target)
                {
                    System.out.println("Element found at the index "+i);
                    flag=true;
                }
            }
        }

        if(flag==false)
        {
            System.out.println("Element not found");
        }

    }
}
