package Problems.Arrays;

public class Find_Missing_No_in_Array_Range {
    public static void main(String []args)
    {
        int[] a={1,2,3,5};
        int sum1=0;
        int sum2=0;
        for(int i=0;i<a.length;i++)
        {
            sum1+=a[i];
        }
        for(int i=1;i<=5;i++)
        {
            sum2+=i;
        }
        System.out.println("Missing Element is:"+(sum2-sum1));
    }
}
