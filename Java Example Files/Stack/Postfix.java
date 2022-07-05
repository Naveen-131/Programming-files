package DSA.Stack;

import java.io.*;
import java.util.*;

public class Postfix 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String str = "100 200 + 2 / 5 * 7 +";
		Stack<Integer> st = new Stack<Integer>();
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(c==' ')
			{
				continue;
			}	
			else if(Character.isDigit(c))
			{
				int n=0;
				while(Character.isDigit(c))
				{
					n = n*10 + (int)(c-'0');
					i++;
					c = str.charAt(i);
				}
				i--;
				st.push(n);
			}
			else 
			{
				int op2 = st.pop();
				int op1 = st.pop();
				switch(c)
				{
				case '+':
					st.push(op1+op2);
					break;
				case '-':
					st.push(op1-op2);
					break;
				case '*':
					st.push(op1*op2);
					break;
				case '/':
					st.push(op1/op2);
					break;
				case '^':
					st.push(op1^op2);
					break;
				}
			}
		}
		System.out.println(st.peek());
	}
}
