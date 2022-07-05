package Problems.Arrays;

public class Find_Duplicate_Elements_in_Array {
    public static void main(String[] args)
    {
        String[] a={"Naveen","kumar","Rathish","kumar","latha","madhavan","madhavan"};
        boolean flag=false;


        for(int i=0;i<a.length;i++)
        {

            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println(" Duplicate Element found "+a[i]+" at index of "+i);
                    flag=true;
                }
            }
        }
        if(flag==false)
        {
            System.out.println("No Duplicate elements in the array");
        }
    }
}
