package JavaT_Points.Basic;

public class Q4{

    static int factorial(int n) {

        if(n>1)
        {
            return n*factorial(n-1);
        }
        else
        {
            return 1;
        }
    }
    public static void main (String [] args)
    {

        int n=5;
        System.out.println(factorial(5));

    }
}
