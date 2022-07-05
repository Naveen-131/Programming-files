package Problems;

public class Swapping_2_numbers {

    public static void main(String []args)
    {
        //method 1
        int a=10;
        int b=20;
        a=a+b;
        b=a-b;
        a=a-b;
        /*method 2
        a=a*b
        b=a/b
        a=a/b
         */
        System.out.println("After Swapping A:"+a);
        System.out.println("After swapping B:"+b);
    }
}
