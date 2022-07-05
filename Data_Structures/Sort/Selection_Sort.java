package Sort;

public class Selection_Sort {
    public static void main(String[] args)
    {
        int[] arr={32,10,42,-45,5,23,11,33};
        for(int i=0;i< arr.length;i++)
        {
            int min=i;
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            if(min!=i)
            {
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }

        for(int i=0;i< arr.length;i++)
        {
            System.out.print(" "+arr[i]+" ");
        }
    }
}
