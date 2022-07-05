package Stack;

import java.util.*;

public class Postfix_to_Infix {

    public static void main(String[] args) {

        Scanner obj=new Scanner(System.in);
        Stack<String> s=new Stack<String>();
        String str=obj.next();

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='+' || ch=='*' ||ch=='/' || ch=='-' || ch=='^')
            {
                String op1=s.pop();
                String op2=s.pop();
                String res="("+op2+ch+op1+")";
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

