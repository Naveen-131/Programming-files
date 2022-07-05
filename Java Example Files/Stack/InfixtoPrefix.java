package DSA.Stack;

import java.io.*;
import java.util.*;

public class InfixtoPrefix 
{
	static int precedence1(char c)
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
	static StringBuilder prefix(String exp)
	{
		StringBuilder res = new StringBuilder();
		StringBuilder in = new StringBuilder(exp);
		in.reverse();
		Stack<Character> st = new Stack<Character>();
		char[] arr = new String(in).toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='(')
			{
				arr[i]=')';
				i++;
			}
			else if(arr[i]==')')
			{
				arr[i]='(';
				i++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			char x = arr[i];
			if(precedence1(x)>0)
			{
				while(st.isEmpty()==false && precedence1(st.peek())>=precedence1(x))
				{
					res.append(st.pop());
				}
				st.push(x);
			}
			else if(x==')')
			{
				char k = st.pop();
				while(k!='(')
				{
					res.append(k);
					k = st.pop();
				}	
			}
			else if(x=='(')
			{
				st.push(x);
			}
			else
			{
				res.append(x);
			}
		}
		for(int i=0;i<=st.size();i++)
		{
			res.append(st.pop());
		}
		return res.reverse();
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println("Prefix conversion is "+ prefix(str));
	}
}
