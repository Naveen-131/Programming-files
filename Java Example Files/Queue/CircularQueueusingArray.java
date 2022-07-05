package DSA.Queue;

import java.util.Scanner;

class CQueue
{
	int max = 5;
	int[] arr = new int[max];
	int front=-1,rear=-1;
	public void EnQueue(Scanner in) 
	{
		int x = in.nextInt();
		if(front==-1 && rear==-1)
		{
			front=rear=0;
			arr[rear]=x;
			System.out.println("Element Inserted..!");
		}
		else if((rear+1)%max==front)
		{
			System.out.println("Queue is Full..!/Overflow ");
		}
		else
		{
			rear = (rear+1)%max;
			arr[rear]=x;
		}
	}
	public void DeQueue() 
	{
		if(front==-1 && rear==-1)
		{
			System.out.println("Queue is Empty..!");
		}
		else if(front==rear)
		{
			System.out.println("Element Removed..! "+arr[front]);
			front = -1;
			rear = -1;
		}
		else
		{
			System.out.println("Element Removed..! "+arr[front]);
			front = (front+1)%max;
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
		int k = front;
		if(front==-1 && rear==-1)
		{
			System.out.println("Queue is Empty..!");
		}
		else
		{
			while(k!=rear)
			{
				System.out.println(arr[k]);
				k = (k+1)%max;
			}
			System.out.println(arr[rear]);
			/*for(int i=0;i<rear+1%max;i++)
			{
				System.out.println(arr[i]);
			}*/
		}
		
	}

}

public class CircularQueueusingArray 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int choice = 0;
		CQueue s = new CQueue();
		System.out.print("Circular Queue Implemetation using Array");
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
