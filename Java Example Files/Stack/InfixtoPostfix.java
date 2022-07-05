package DSA.Stack;

import java.io.*;
import java.util.*;

public class InfixtoPostfix 
{
	static int precedence(char c)
	{
		switch(c)
		{
			case'+':
			case'-':
				return 1;
			case'*':
			case'/':
				return 2;
			case'^':
				return 3;
		}
		return -1;
	}
	static String conversion(String exp)
	{
		String res="";
		Stack<Character> st = new Stack<Character>();
		for(int i=0;i<exp.length();i++)
		{
			char c = exp.charAt(i);
			if(precedence(c)>0)
			{
				while(st.isEmpty()==false && precedence(st.peek())>=precedence(c))
				{
					res+=st.pop();
				}
				st.push(c);
			}
			else if(c==')')
			{
				char x = st.pop();
				while(x!='(')
				{
					res+=x;
					x = st.pop();
				}
			}
			else if(c=='(')
			{
				st.push(c);
			}
			else
			{
				res+=c;
			}
		}
		for(int i=0;i<=st.size();i++)
		{
			res+=st.pop();
		}
		return res;
		
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String exp = in.nextLine();
		System.out.println("Postfix Expression is.. " + conversion(exp));
	}
}
