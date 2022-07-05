package DSA.Queue;

import java.util.*;

class Node1
{
	int data;
	Node1 next;
	
	public Node1(int data)
	{
		this.data = data;
		this.next = null;
	}
}

class CQueueList
{
	private  static Node1 rear=null, front=null;
	
	public void EnQueue(Scanner in) 
	{
		int x = in.nextInt();
		Node1 n = new Node1(x);
		if(rear==null)
		{
			front=rear=n;
			rear.next=front;
			System.out.println("Element Inserted..!");
		}
		else
		{
			rear.next=n; ;
			rear = n;
			rear.next=front;
			System.out.println("Element Inserted..!");
		}
	}

	public void DeQueue() 
	{
		if(front==null && rear==null)
		{
			System.out.println("Queue is Empty..!");
			System.exit(0);
		}
		int temp = front.data;
		if(front==rear)
		{
			front= rear=null;
			System.out.println("Item Removed..! "+temp);
		}
		else
		{
			System.out.println("Item Removed..! "+temp);
			front = front.next;
			rear.next = front;
		}
	}

	public void peek() 
	{
		if(rear==null)
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
		Node1 temp = front;
		if(rear==null)
		{
			System.out.println("Queue is Empty..!!");
		}
		else
		{
			System.out.println("Elements are..");
			while(temp.next!=front)
			{
				System.out.println(temp.data);
				temp = temp.next;
			}
			System.out.println(temp.data);
		} 
	}
	
}
public class CircularQueueusingList 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		CQueueList s = new CQueueList();
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
