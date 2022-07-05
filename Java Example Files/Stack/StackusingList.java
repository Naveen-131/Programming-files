package DSA.Stack;

import java.io.*;
import java.util.*;

class Node
{
	int data;
	Node next;
}
class Stack1
{
	private Node top;
	public Stack1()
	{
		this.top = null;
	}
	public void push(Scanner in)
	{
		Node n = new Node();
		int x = in.nextInt();
		n.data = x;
		n.next = top;
		top = n;
		System.out.println("Element Inserted");
	}
	public void pop() 
	{
		if(top==null)
		{
			System.out.println("Stack is Empty --> Underflow");
		}
		else
		{
			System.out.println("Removed Element is.. "+top.data);
			top = top.next;
		}
	}
	public void peek() 
	{
		if(top!=null)
		{
			System.out.println(top.data);
		}
		else
		{
			System.out.println("Stack is Empty..!!");
		}
	}
	public void display() 
	{
		if(top==null)
		{
			System.out.println("Stack is Empty..!!");
		}
		else
		{
			System.out.println("Elements are..");
			while(top!=null)
			{
				System.out.println(top.data);
				top = top.next;
			}
		}
	}
}

public class StackusingList 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		Stack1 s = new Stack1();
		int choice=0;
		while(choice!=5)
		{
			System.out.println("Enter your choice..!!");
			System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Display\n5.Exit");
			choice = in.nextInt();
			switch(choice)
			{
				case 1:
				{
					s.push(in);
					break;
				}
				case 2:
				{
					s.pop();
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
