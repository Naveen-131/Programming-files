package DSA.LinkedList;

import java.util.*;

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
class LList
{
	public Node head=null,tail = null;
	public int size=0;
	public void BInsert(Scanner in) 
	{
		int x = in.nextInt();
		Node newnode = new Node(x);
		if(head==null)
		{
			head = newnode;
			tail = newnode;
			size++;
			System.out.println("Data Inserted..!");
		}
		else
		{
			newnode.next = head;
			head = newnode;
			size++;
			System.out.println("Data Inserted..!");
		}
	}

	public void LInsert(Scanner in) 
	{
		int x = in.nextInt();
		Node newnode = new Node(x);
		if(head==null)
		{
			head = newnode;
			tail = newnode;
			size++;
			System.out.println("Data Inserted..!");
		}
		else
		{
			tail.next = newnode;
			tail = newnode;
			newnode = tail;
			size++;
			System.out.println("Data Inserted..!");
		}
	}

	public void RInsert(Scanner in) 
	{
		System.out.println("Enter the position ");
		int pos = in.nextInt();
		if(pos>size)
		{
			System.out.println("Invalid Position..!!");
		}
		else
		{
			int i=1;
			int x = in.nextInt();
			Node newnode = new Node(x);
			Node temp = head;
			while(i<pos)
			{
				temp = temp.next;
				i++;
			}
			newnode.next = temp.next;
			temp.next = newnode;
			System.out.println("Element Inserted..!");
			size++;
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
			if(head!=tail)
			{
				head=head.next;
				System.out.println("Element Deleted..!!");
				size--;
			}
			else
			{
				head = tail = null;
				System.out.println("Element Deleted..!!");
				size--;
			}
		}
	}

	public void LDelete() 
	{
		if(head==null)
		{
			System.out.println("List is Empty..!");
		}
		else if(head.next==null)
		{
			head=null;
			tail=null;
			size--;
			System.out.println("Element Deleted..!");
		}
		else
		{
			Node prev=head,tmp=head;
			while(prev.next!=null)
			{
				tmp = prev;
				prev = prev.next;
			}
			tmp.next=null;
			tail=tmp;
			size--;
			System.out.println("Element Deleted..!");
		}
	}

	public void RDelete(Scanner in) 
	{
		System.out.println("Enter the pos");
		int pos = in.nextInt();
		if(head==null)
		{
			System.out.println("List is Empty");
		}
		else if(size==1)
		{
			head = tail = null;
			size--;
			System.out.println("Element Deleted..!");
		}
		else if(pos==1)
		{
			head = head.next;
			size--;
			System.out.println("Element Deleted..!");
		}
		else
		{
			int i=1;
			Node tmp=head;
			Node nxt;
			while(i<pos-1)
			{
				tmp = tmp.next;
				i++;
			}
			nxt = tmp.next;
			tmp.next = nxt.next;
			size--;
			System.out.println("Element Deleted..!");
		}
	}
	
	public void getSize() 
	{
		System.out.println("Size of the list is ... "+size);
	}
	
	public void display() 
	{
		if(head==null)
		{
			System.out.println("List is Empty..!!");
		}
		else
		{
			Node n = head;
			System.out.println("Elements are..");
			while(n.next!=null)
			{
				System.out.println(n.data);
				n = n.next;
			}
			System.out.println(n.data);
		}
	}

	
}
public class LinkedListImpl 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int choice=0;
		LList ll = new LList();
		System.out.println("Implementation of Linked List");
		while(choice!=9)
		{
			System.out.println("Choose the Option");
			System.out.println("\n1.Insert at Beginning\n2.Insert at End\n3.Insert after a given position\n4.Delete from Beginning\n5.Delete from End\n6.Delete from specific Position\n7.Display\n8.Size of List\n9.Exit");
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
					ll.RInsert(in);
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
