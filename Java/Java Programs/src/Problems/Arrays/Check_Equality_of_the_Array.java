package Problems.Arrays;

public class Check_Equality_of_the_Array {
    public static void main(String [] args)
    {
        int[] a={1,2,3,4,5,6};
        int[] b={1,2,3,4,5,6};
        int count=0;
        if(a.length==b.length)
        {
            for(int i=0;i<a.length;i++)
            {
                if(a[i]==b[i])
                {
                    count++;
                }
            }
            String print=count%a.length==0?"same":"Not same";
            System.out.println(print);
        }
        else
        {
            System.out.println("Not same");
        }
    }
}
