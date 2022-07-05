package DSA.Stack;

import java.io.*;
import java.util.*;

public class Prefix 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String str = "-/*2*5+3652";
		//char[] arr = str.toCharArray();
		int res;
		Stack<Double> st = new Stack<Double>();
		for(int i=str.length()-1;i>=0;i--)
		{
			char c = str.charAt(i);
			if(Character.isDigit(c))
			{
				st.push((double) (c-'0'));
			}
			else 
			{
				double op1 = st.pop();
				double op2 = st.pop();
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
					st.push(Math.pow(op1, op2));
					break;
				}
			}
		}
		System.out.println(st.peek());
	}
}
