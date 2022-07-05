package Problems.Arrays;

public class Max_Min_In_Array {
    public static void main(String[] args)
    {
        int[] a = {2, -1, 0, 20, -4};
        int max=a[0];
        int min=a[0];

        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("Maximum value in array:"+max);
        System.out.println("Minimum value in array:"+min);
    }

}
