package DSA.Stack;
import java.io.*;
import java.util.*;

class Stack2
{
	int top=-1;
	int max=10;
	int[] arr = new int[max];
	
	public void push(Scanner in)
	{
		if(top==max-1)
		{
			System.out.println("Overflow..!!");
		}
		else
		{
			int val = in.nextInt();
			top++;
			arr[top]=val;
			System.out.println("Item Pushed");
		}
	}

	public void pop() 
	{
		int ele;
		if(top==-1)
		{
			System.out.println("Underflow");
		}
		else
		{
			ele = arr[top];
			top--;
			System.out.println("Item popped is "+ele);
		}
	}

	public void peek() 
	{
		if(top==-1)
		{
			System.out.println("Stack is Empty..");
		}
		else
		{
			System.out.println(arr[top]);
		}
	}

	public void display() 
	{
		if(top==-1)
		{
			System.out.println("Stack is Empty..");
		}
		for(int i=top;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
}
public class StackImpl 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int choice = 0;
		Stack2 s = new Stack2();
		System.out.print("Stack Implemetation using Array");
		while(choice!=5)
		{
			System.out.println("Choose the Option");
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
