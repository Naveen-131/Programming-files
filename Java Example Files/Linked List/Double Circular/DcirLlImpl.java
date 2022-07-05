package DSA.DoubleCLinkedList;

import java.util.*;

class Node
{
	int data;
	Node next;
	Node prev;
	
	public Node(int data)
	{
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}
class DoubleCList
{
	Node head = null,tail = null;
	public int size=0;
	public void BInsert(Scanner in) 
	{
		int x = in.nextInt();
		Node newnode = new Node(x);
		if(head==null)
		{
			head = tail = newnode;
			head.next = head;
			head.prev = newnode;
			size++;
			System.out.println("Inserted..!!");
		}
		else
		{
			newnode.next = head;
			head.prev = newnode;
			newnode.prev = tail;
			tail.next = newnode;
			head = newnode;
			size++;
			System.out.println("Inserted..!!");
		}
	}

	public void LInsert(Scanner in) 
	{
		int x = in.nextInt();
		Node newnode = new Node(x);
		if(head==null)
		{
			head = tail = newnode;
			head.next = head;
			head.prev = newnode;
			size++;
			System.out.println("Inserted..!!");
		}
		else
		{
			newnode.prev = tail;
			tail.next = newnode;
			newnode.next = head;
			head.prev = newnode; 
			tail = newnode;
			size++;
			System.out.println("Inserted..!!");
		}
	}

	public void SInsert(Scanner in) 
	{
		System.out.println("Enter position of insertion..!");
		int pos = in.nextInt();
		if(pos<1 || pos>size)
		{
			System.out.println("Invalid Position..!");
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
			tmp.next.prev = newnode;
			tmp.next = newnode;
			size++;
			System.out.println("Inserted..!!");
		}
	}

	public void display() 
	{
		if(head==null)
		{
			System.out.println("List is Empty..!!");
		}
		else
		{
			Node tmp = head;
			while(tmp!=tail)
			{
				System.out.println(tmp.data);
				tmp = tmp.next;
			}
			System.out.println(tmp.data);
		}
	}

	public void getSize() 
	{
		System.out.println(size);
	}

	public void BDelete() 
	{
		if(head==null)
		{
			System.out.println("List is Empty..!");
		}
		else if(head.next == head)
		{
			head = tail = null;
			size--;
			System.out.println("Element deleted..!");
		}
		else
		{
			 head = head.next;
			 head.prev = tail;
			 tail.next = head;
			 size--;
			 System.out.println("Element deleted..!");
		}
	}

	public void LDelete() 
	{
		if(head==null)
		{
			System.out.println("List is Empty..!");
		}
		else if(head.next == head)
		{
			head = tail = null;
			size--;
			System.out.println("Element deleted..!");
		}
		else
		{
			tail = tail.prev;
			tail.next =  head;
			head.prev = tail;
			size--;
			System.out.println("Element deleted..!");
		}
	}

	public void RDelete(Scanner in) 
	{
		System.out.println("Enter the position of deletion");
		int pos = in.nextInt();
		if(pos<1 || pos>size)
		{
			System.out.println("Invalid Position..!");
		}
		else if(head==null)
		{
			System.out.println("List is Empty..!");
		}
		else if(pos==1)
		{
			BDelete(); 
		}
		else if(pos==size)
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
			System.out.println("Element deleted..!");
		}
	}
	
}
public class DcirLlImpl 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int choice=0;
		DoubleCList ll = new DoubleCList();
		System.out.println("Implementation of Linked List");
		while(choice!=9)
		{
			System.out.println("Choose the Option");
			System.out.println("\n1.Insert at Beginning"
					+ "\n2.Insert at End"
					+ "\n3.Insert at a specific position"
					+ "\n4.Delete from Beginning"
					+ "\n5.Delete from End"
					+ "\n6.Delete from specific Position"
					+ "\n7.Display"
					+ "\n8.Size of List"
					+ "\n9.Exit");
			
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
					ll.BDelete();
					break;
				}
				case 5:
				{
					ll.LDelete();
					break;
				}
				case 6:
				{
					ll.RDelete(in);
					break;
				}
				case 7:
				{
					ll.display();
					break;
				}
				case 8:
				{
					ll.getSize();
					break;
				}
				case 9:
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
