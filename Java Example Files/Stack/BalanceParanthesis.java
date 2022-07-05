package DSA.Stack;

import java.io.*;
import java.util.*;

public class BalanceParanthesis 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		Stack<Character> s = new Stack<Character>();
		String str = in.next();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='{' || str.charAt(i)=='[' || str.charAt(i)=='(')
			{
				s.push(str.charAt(i));
			}
			else if(!s.empty() && ((str.charAt(i)=='}'&& s.peek() == '{')||(str.charAt(i)==']'&& s.peek() == '[')||(str.charAt(i)==')'&& s.peek() == '(')))
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
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("Not Balanced..!!");
		}
		
	}
}
