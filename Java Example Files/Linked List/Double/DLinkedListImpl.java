package DSA.DoubleLinkedList;

import java.util.Scanner;

class Node
{
	int data;
	Node prev,next;
	
	public Node(int data)
	{
		this.data = data;
		this.prev = null;
		this.next = null;
	}
}
class DoubleList
{
	public Node head,tail = null;
	public int size = 0;
	public void BInsert(Scanner in) 
	{
		int x = in.nextInt();
		Node newnode = new Node(x);
		if(head==null)
		{
			head = tail = newnode;
			size++;
			System.out.println("Data Inserted at Beginning..!");
		}
		else
		{
			head.prev = newnode;
			newnode.next = head;
			head = newnode;
			size++;
			System.out.println("Data Inserted at Beginning..!");
		}
	}

	public void LInsert(Scanner in) 
	{
		int x = in.nextInt();
		Node newnode = new Node(x);
		if(head==null)
		{
			head = tail = newnode;
			size++;
			System.out.println("Data Inserted at End..!");
		}
		else
		{
			tail.next = newnode;
			newnode.prev = tail;
			tail = newnode;
			size++;
			System.out.println("Data Inserted at End..!");
		}
	}
	
	public void SInsert(Scanner in) 
	{
		System.out.println("Enter the position of Insertion");
		int pos = in.nextInt();
		if(pos>size)
		{
			System.out.println("Invalid Positon");
		}
		else if(pos==1)
		{
			BInsert(in);
		}
		else
		{
			int x = in.nextInt();
			Node newnode = new Node(x);
			Node tmp = head;
			for(int i=1;i<pos-1;i++)
			{
				tmp = tmp.next;
			}
			newnode.prev = tmp;
			newnode.next = tmp.next;
			tmp.next = newnode;
			newnode.next.prev = newnode;
			size++;
			System.out.println("Data Inserted at Position "+pos);
		}
	}

	public void RInsert(Scanner in) 
	{
		System.out.println("Enter the position of Insertion");
		int pos = in.nextInt();
		if(pos>size)
		{
			System.out.println("Invalid Positon");
		}
		else
		{
			int x = in.nextInt();
			Node newnode = new Node(x);
			Node tmp = head;
			for(int i=1;i<pos;i++)
			{
				tmp = tmp.next;
			}
			newnode.prev = tmp;
			newnode.next = tmp.next;
			tmp.next =  newnode;
			newnode.next.prev = newnode;
			size++;
			System.out.println("Data Inserted at Position "+(pos+1));
		}
	}

	
	public void BDelete() 
	{
		if(head==null)
		{
			System.out.println("List is Empty..!");
		}
		else
		{
			 //Node tmp = head;
			 head = head.next;
			 head.prev = null;
			 size--;
			 System.out.println("Element Deleted...!");
		}
		
	}

	public void LDelete() 
	{
		if(head ==null || tail == null)
		{
			System.out.println("List is Empty..!");
		}
		else
		{
			Node tmp = tail;
			tail = tail.prev;
			tail.next = null;
			size--;
			System.out.println("Element Deleted...!");
		}
	}

	public void RDelete(Scanner in) 
	{
		System.out.println("Enter Position of deletion..!");
		int pos = in.nextInt();
		if(size==pos)
		{
			LDelete();
		}
		else
		{
			Node tmp = head;
			for(int i=1;i<pos;i++)
			{
				tmp = tmp.next;
			}
			tmp.prev.next = tmp.next;
			tmp.next.prev = tmp.prev;
			size--;
			System.out.println("Element Deleted...!");
		}
	}

	public void getSize() 
	{
		if(size==0)
		{
			System.out.println("List is Empty..!");
		}
		else
		{
			System.out.println("Size of the List is..."+size);
		}
	}
	
	public void display() 
	{
		if(head==null)
		{
			System.out.println("List is Empty..!");
		}
		else
		{
			Node tmp = head;
			while(tmp!=null)
			{
				System.out.println(tmp.data);
				tmp = tmp.next;
			}
		}
	}

	
}

public class DLinkedListImpl 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int choice=0;
		DoubleList ll = new DoubleList();
		System.out.println("Implementation of Linked List");
		while(choice!=10)
		{
			System.out.println("Choose the Option");
			System.out.println("\n1.Insert at Beginning"
					+ "\n2.Insert at End"
					+ "\n3.Insert at a specific position"
					+ "\n4.Insert after a given position"
					+ "\n5.Delete from Beginning"
					+ "\n6.Delete from End"
					+ "\n7.Delete from specific Position"
					+ "\n8.Display"
					+ "\n9.Size of List"
					+ "\n10.Exit");
			
			choice = in.nextInt();
			switch(choice)
			{
				case 1:
				{
					ll.BInsert(in);
					break;
				}
				case 2:
				{
					ll.LInsert(in);
					break;
				}
				case 3:
				{
					ll.SInsert(in);
					break;
				}
				case 4:
				{
					ll.RInsert(in);
					break;
				}
				case 5:
				{
					ll.BDelete();
					break;
				}
				case 6:
				{
					ll.LDelete();
					break;
				}
				case 7:
				{
					ll.RDelete(in);
					break;
				}
				case 8:
				{
					ll.display();
					break;
				}
				case 9:
				{
					ll.getSize();
					break;
				}
				case 10:
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
