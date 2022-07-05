package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Balanced_Parenthesis {

    public static void main(String[] args){

        Scanner obj=new Scanner(System.in);
        // TODO Auto-generated method stub
        Stack<Character> s=new Stack<>();

        String str=obj.next();

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i)=='{')
            {
                s.push(str.charAt(i));
            }
            else if(!s.empty() && ( (str.charAt(i)=='}' && s.peek()=='{' ) || (str.charAt(i)==']' && s.peek()=='[') || (str.charAt(i)==')' && s.peek()=='(') ) )
            {
                s.pop();
            }
            else
            {
                s.push(str.charAt(i));
            }
        }

        if(s.empty())
        {
            System.out.println("Balanced Parenthesis");
        }
        else
        {
            System.out.println("InBalanced Parenthesis");
        }

    }

}
