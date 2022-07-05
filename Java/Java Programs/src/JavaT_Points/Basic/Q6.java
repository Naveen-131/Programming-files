package JavaT_Points.Basic;

import java.util.Random;

public class Q6 {
    public static void main(String[] args)
    {
        System.out.println("Random number using Math Function: "+Math.random());
        Random r=new Random();
        int x= r.nextInt(50);
        System.out.println("Random number Using Random class: "+x);
    }
}
