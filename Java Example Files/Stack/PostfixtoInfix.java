package DSA.Stack;

import java.io.*;
import java.util.*;

public class PostfixtoInfix 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String str = in.next();         //ABC/-AK/L-*
		Stack<String> st = new Stack<String>();
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(c=='+'||c=='-'||c=='*'||c=='/'||c=='^')
			{
				String op2 = st.pop();
				String op1 = st.pop();
				String res  = "("+op1+c+op2+")";
				st.push(res);
			}
			else
			{
				st.push(c+"");
			}
		}
		System.out.println(st.pop()); //((A-(B/C))*((A/K)-L))
	}
}
