package Stack;


import java.util.*;

class Infix_to_Postfix {

    static int precedence(char c)
    {
        switch(c)
        {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;

        }
        return -1;
    }


    static String conversion(String exp)
    {
        String output="";
        Stack<Character> s=new Stack<>();

        for(int i=0;i<exp.length();i++)
        {
            char c=exp.charAt(i);
            if(precedence(c) >0)
            {
                while(!s.empty() && precedence(s.peek())>=precedence(c))
                {
                    output+=s.pop();
                }
                s.push(c);
            }
            else if(c=='(')
            {
                s.push(c);
            }
            else if(c==')')
            {
                char x=s.pop();
                while(x!='(')
                {
                    output+=x;
                    x=s.pop();
                }
            }
            else
            {
                output+=c;
            }
        }
        for(int i=0;i<=s.size();i++)
        {
            output+=s.pop();
        }

        return output;

    }



    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner obj=new Scanner(System.in);
        String str=obj.next();
        System.out.println("Postfix Expression:"+ conversion(str));

    }

}
