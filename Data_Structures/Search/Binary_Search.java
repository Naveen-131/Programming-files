package Search;

import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int[] arr={1,5,10,15,17,30,35,37,43,54};

        int l=0,r=arr.length-1;


        System.out.println("Enter the element to be found");
        int data=obj.nextInt();
        boolean flag=false;

        while(l<r)
        {
            int mid=(l+r)/2;
            if(data==arr[mid])
            {
                System.out.println("Element found ar index "+mid);
                flag=true;
                break;
            }
            else if(data<arr[mid])
            {
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        if(flag==false)
        {
            System.out.println("Element is not found");
        }
    }
}
