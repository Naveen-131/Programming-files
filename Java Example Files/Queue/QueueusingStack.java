package DSA.Queue;

import java.util.*;

class QueueSt
{
	Stack<Integer> st1 = new Stack<Integer>();
	Stack<Integer> st2 = new Stack<Integer>();
	int top1=-1,top2=-2;
	public void EnQueue(Scanner in) 
	{
		int x = in.nextInt();
		st1.push(x);
	}

	public void DeQueue() 
	{
		if(st1.isEmpty() && st2.isEmpty())
		{
			System.out.println("Queue Underflow..!");
			System.exit(0);
		}
		if(st2.isEmpty())
		{
			while(!st1.isEmpty())
			{
				st2.push(st1.pop());
			}
			System.out.println("Removed Element is.. "+st2.pop());
		}
		while(!st2.isEmpty())
		{
			st1.push(st2.pop());
		}
	}

	public void peek() 
	{
		if(st1.isEmpty())
		{
			System.out.println("Queue is Empty..!");
		}
		else
		{
			if(st2.isEmpty())
			{
				while(!st1.isEmpty())
				{
					st2.push(st1.pop());
				}
				System.out.println("Front/Peek Element is.. "+st2.peek());
			}
			while(!st2.isEmpty())
			{
				st1.push(st2.pop());
			}
		}
	}

	public void display() 
	{
		if(st1.isEmpty())
		{
			System.out.println("Queue is Empty..!");
		}
		else
		{
			for(int x:st1)
			{
				System.out.println(x);
			}
		}
	}
	
}

public class QueueusingStack 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		QueueSt s = new QueueSt();
		int choice=0;
		while(choice!=5)
		{
			System.out.println("Enter your choice..!!");
			System.out.println("\n1.EnQueue\n2.DeQueue\n3.Peek\n4.Display\n5.Exit");
			choice = in.nextInt();
			switch(choice)
			{
				case 1:
				{
					s.EnQueue(in);
					break;
				}
				case 2:
				{
					s.DeQueue();
					break;
				}
				case 3:
				{
					s.peek();
					break;
				}
				case 4:
				{
					s.display();
					break;
				}
				case 5:
				{
					System.out.println("Exiting...");
					System.exit(0);
					break;
				}
				default:
				{
					System.out.println("Enter valid Choice");
				}
			}
		}
	}
}
