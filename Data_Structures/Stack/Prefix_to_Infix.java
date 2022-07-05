package Stack;

import java.util.*;

public class Prefix_to_Infix {

    public static void main(String[] args) {
        Stack<String> s=new Stack<String>();
        Scanner obj=new Scanner(System.in);
        String str=obj.next();



        for(int i=str.length()-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='^')
            {
                String op1=s.pop();
                String op2=s.pop();
                String res="("+op1+ch+op2+")";
                s.push(res);

            }
            else
            {
                s.push(ch+"");
            }
        }
        System.out.println(s.pop());


    }

}
