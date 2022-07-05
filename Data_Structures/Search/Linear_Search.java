package Search;
import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        int[] arr={1,2,3,4,5,6,7,8,9};

        System.out.println("Enter the element to be found");
        int data=obj.nextInt();
        boolean flag=false;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==data)
            {
                System.out.println("Element is found at the index "+i);
                flag=true;
                break;

            }
        }
        if(flag==false)
        {
            System.out.println("Element is not found");
        }


    }
}
