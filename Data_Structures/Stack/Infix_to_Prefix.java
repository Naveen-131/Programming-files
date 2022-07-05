package Stack;
import java.util.*;
public class Infix_to_Prefix {
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
    static StringBuilder conversion(String exp)
    {
        StringBuilder output=new StringBuilder();
        StringBuilder input=new StringBuilder(exp);
        input.reverse();
        Stack<Character> s=new Stack<Character>();
        char[] ch=new String(input).toCharArray();

        for(int i = 0;i<ch.length; i++)
        {
            if(ch[i]=='(')
            {
                ch[i]=')';
                i++;
            }
            else if(ch[i]==')')
            {
                ch[i]='(';
                i++;
            }
        }
        for(int i=0;i<ch.length;i++)
        {
            char c=ch[i];
            if(precedence(c)>0)
            {
                while(!s.empty() && precedence(s.peek())>=precedence(c))
                {
                    output.append(s.pop());
                }
                s.push(c);
            }
            else if(c=='(')
            {
                s.push(c);
            }
            else if(c==')')
            {
                char k=s.pop();
                while(k!='(')
                {
                    output.append(k);
                    k=s.pop();
                }
            }
            else
            {
                output.append(c);
            }
        }
        for(int i=0;i<=s.size();i++)
        {
            output.append(s.pop());
        }

        return output.reverse();
    }


    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        String str=obj.next();
        System.out.println("Prefix Expresion :"+conversion(str));





    }



}
