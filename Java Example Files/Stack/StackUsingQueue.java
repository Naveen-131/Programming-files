package DSA.Stack;

import java.util.*;

public class StackUsingQueue 
{
	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();
	
	public void push(int x)
	{
		if(q1.size()==0)
			q1.add(x);
		else
		{
			int qsize = q1.size();
			for(int i=0;i<qsize;i++)
			{
				q2.add(q1.remove());
			}
			q1.add(x);
			for(int i=0;i<qsize;i++)
			{
				q1.add(q2.remove());
			}
		}
	}
	
	public void pop()
	{
		if(q1.size()==0)
		{
			System.out.println("Undeflow..!");
		}
		else
		{
			System.out.println(q1.remove());
		}
	}
	public void display()
	{
		for(int k:q1)
		{
			System.out.println(k);
		}
	}
	public void peek()
	{
		System.out.println("Peek Element is.."+q1.peek());
	}
	public static void main(String args[])
	{
		StackUsingQueue st = new StackUsingQueue();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.display();
		st.peek();
		st.pop();
		st.pop();
	}
}
