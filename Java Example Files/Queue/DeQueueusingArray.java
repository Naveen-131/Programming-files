package DSA.Queue;

import java.util.*;

class DeQueue
{
	int max=10;
	int[] arr = new int[max];
	int front=-1,rear=-1;
	public void EnQueueFront(Scanner in) 
	{
		int x = in.nextInt();
		if((rear+1)%max==front)
		{
			System.out.println("Queue is Full / Oveflow..!");
		}
		else if(front==-1 && rear==-1)
		{
			front=rear=0;
			arr[front]=x;
			System.out.println("Element Inserted..!");
		}
		else if(front==0)
		{
			front=max-1;
			arr[front]=x;
			System.out.println("Element Inserted..!");
		}
		else
		{
			front--;
			arr[front]=x;
			System.out.println("Element Inserted..!");
		}
	}

	public void DeQueueFront() 
	{
		if(front==-1 && rear==-1)
		{
			System.out.println("Queue is Empty..!");
		}
		else if(front==rear)
		{
			System.out.println("Element Removed..! "+arr[front]);
			front=rear=-1;
		}
		else if(front==max-1)
		{
			System.out.println("Element Removed..! "+arr[front]);
			front=0;
		}
		else
		{
			System.out.println("Element Removed..!"+arr[front]);
			front++;
		}
			
	}

	public void EnQueueRear(Scanner in) 
	{
		int x = in.nextInt();
		if((rear+1)%max==front)
		{
			System.out.println("Queue is Full / Oveflow..!");
		}
		else if(front==-1 && rear==-1)
		{
			front=rear=0;
			arr[rear]=x;
			System.out.println("Element Inserted..!");
		}
		else if(rear==max-1)
		{
			rear=0;
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
	
	public void DeQueueRear() 
	{
		if(front==-1 && rear==-1)
		{
			System.out.println("Queue is Empty..!");
		}
		else if(front==rear)
		{
			System.out.println("Element Removed..! "+arr[rear]);
			front=rear=-1;
		}
		else if(rear==0)
		{
			System.out.println("Element Removed..! "+arr[rear]);
			rear = max-1;
		}
		else
		{
			System.out.println("Element Removed..! "+arr[rear]);
			rear--;
		}
	}

	public void display() 
	{
		int i = front;
		while(i!=rear)
		{
			System.out.println(arr[i]);
			i=(i+1)%max;
		}
		System.out.println(arr[rear]);
	}

	public void getFront() 
	{
		System.out.println(arr[front]);
	}

	public void getRear() 
	{
		System.out.println(arr[rear]);
	}
	
}

public class DeQueueusingArray 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		DeQueue s = new DeQueue();
		int choice=0;
		while(choice!=8)
		{
			System.out.println("Enter your choice..!!");
			System.out.println("\n1.EnQueueFront\n2.DeQueueFront\n3.EnQueueRear\n4.DeQueueRear\n5.Display\n6.GetFront\n7.GetRear\n8.Exit");
			choice = in.nextInt();
			switch(choice)
			{
				case 1:
				{
					s.EnQueueFront(in);
					break;
				}
				case 2:
				{
					s.DeQueueFront();
					break;
				}
				case 3:
				{
					s.EnQueueRear(in);
					break;
				}
				case 4:
				{
					s.DeQueueRear();
					break;
				}
				case 5:
				{
					s.display();
					break;
				}
				case 6:
				{
					s.getFront();
					break;
				}
				case 7:
				{
					s.getRear();
					break;
				}
				case 8:
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
