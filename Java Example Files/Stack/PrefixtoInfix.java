package DSA.Stack;

import java.io.*;
import java.util.*;

public class PrefixtoInfix 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String str = in.next();              // *+ab/ef
		Stack<String> st = new Stack<String>();
		for(int i=str.length()-1;i>=0;i--)
		{
			char c = str.charAt(i);
			if(c=='+'||c=='-'||c=='*'||c=='/'||c=='^')
			{
				String op1 = st.pop();
				String op2 = st.pop();
				String res = "("+op1+c+op2+")";
				st.push(res);
			}
			else
			{
				st.push(c+"");
			}
		}
		System.out.println(st.pop());  //((a+b)*(e/f))
	}
}
