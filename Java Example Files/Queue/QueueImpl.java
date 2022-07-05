package DSA.Queue;

import java.util.Scanner;

class Queue2
{
	int max = 10;
	int[] arr = new int[max];
	int front=-1,rear=-1;

	public void EnQueue(Scanner in) 
	{
		int x = in.nextInt();
		if(rear==max-1)
		{
			System.out.println("Queue Overflow..!");
		}
		else if(front==-1 && rear==-1)
		{
			front=rear=0;
			arr[rear]=x;
			System.out.println("Element Inserted..!");
		}
		else
		{
			rear++;
			arr[rear]=x;
			System.out.println("Element Inserted..!");
		}
		
	}

	public void DeQueue() 
	{
		if(front==-1 && rear==-1)
		{
			System.out.println("Queue Underflow..!");
		}
		else if(front==rear)
		{
			System.out.println("Element Removed..! "+arr[front]);
			front=rear =-1;
		}
		else
		{
			System.out.println("Element Removed..! "+arr[front]);
			front++;
		}
		
	}

	public void peek() 
	{
		if(front==-1 && rear==-1)
		{
			System.out.println("Queue is Empty..!");
		}
		else
		{
			System.out.println(arr[front]);
		}
	}

	public void display() 
	{
		if(front==-1 && rear==-1)
		{
			System.out.println("Queue is Empty..!");
		}
		else
		{
			for(int i=front;i<rear+1;i++)
			{
				System.out.println(arr[i]);
			}
		}

	}
	
}
public class QueueImpl 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int choice = 0;
		Queue2 s = new Queue2();
		System.out.print("Queue Implemetation using Array");
		while(choice!=5)
		{
			System.out.println("Choose the Option");
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
