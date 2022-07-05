package DSA.Queue;

import java.util.Scanner;
import java.io.*;

class Node
{
	int data;
	Node next;
	
	public Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}

class QueueList
{
	private  static Node rear=null,front=null;

	public void EnQueue(Scanner in) 
	{
		int x = in.nextInt();
		Node n = new Node(x);
		if(front==null && rear==null)
		{
			front=n;
			rear=n;
		}
		else
		{
			rear.next = n;
			rear=n;
		}
	}

	public void DeQueue() 
	{
		if(front==null && rear==null)
		{
			System.out.println("Queue Underflow..!");
		}
		Node temp = front;
		System.out.println("Removing.. "+temp.data);
		front = front.next;
		if(front==null)
		{
			rear=null;
		}
	}

	public void peek() 
	{
		if(front==null && rear==null)
		{
			System.out.println("Queue is Empty..!");
		}
		else
		{
			System.out.println(front.data);
		}
	}

	public void display() 
	{
		if(front==null)
		{
			System.out.println("Stack is Empty..!!");
		}
		else
		{
			System.out.println("Elements are..");
			while(front!=null)
			{
				System.out.println(front.data);
				front = front.next;
			}
		}
	}
	
}

public class QueueusingList 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		QueueList s = new QueueList();
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
