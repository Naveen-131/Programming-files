package Sort;

public class Bubble_sort {
    public static void main(String[] args)
    {
        int[] array={5,15,13,25,32,55,60,64};
        int temp = 0;
        for (int i = 0; i < (array.length - 1 ); i++)
        {
            int flag=0;
            for (int j = 0; j < array.length - i - 1; j++)
            {
                if (array[j] > array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag=1;
                }
            }
            if(flag== 0)
            {
                break;
            }
        }
        for(int i=0;i< array.length;i++)
        {
            System.out.print(array[i]+"  ");
        }
    }
}
