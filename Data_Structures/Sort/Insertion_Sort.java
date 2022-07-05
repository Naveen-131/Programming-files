package Sort;

public class Insertion_Sort {
    public static void main(String[] args)
    {
        int[] arr={15,10,1,30,8,45,-10,7};
        int temp=0;

        for(int i=1;i< arr.length;i++)
        {
            temp=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}