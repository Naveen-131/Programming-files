package DSA.DoubleLinkedList;

import java.util.*;

class Node1
{
	int data;
	Node1 prev;
	Node1 next;
	
	public Node1(int data)
	{
		this.data = data;
		this.prev = null;
		this.next = null;
	}
}
class DList
{
	public Node1 head,tmp=null;
	public int size = 0;
	
	public void Insertion(Scanner in)
	{
		int x = in.nextInt();
		Node1 newnode = new Node1(x);
		if(head==null)
		{
			head=tmp=newnode;
			System.out.println("Inserted...!");
		}
		else
		{
			tmp.next = newnode;
			newnode.prev = tmp;
			tmp = tmp.next;
			System.out.println("Inserted...!");
		}
	}
	public void display()
	{
		if(head==null)
		{
			System.out.println("List is Empty...!");
		}
		else
		{
			Node1 dis=head;
			while(dis!=null)
			{
				System.out.println(dis.data);
				dis = dis.next;
			}
			//System.out.println(dis.data);
		}
	}
	public void findmiddle() 
	{
		Node1 p1 = head;
		Node1 p2 = head;
		while(p2!=null && p2.next!=null)
		{
			p1 = p1.next;
			p2 = p2.next.next;
		}
		System.out.println(p1.data);
	}
}
public class DListcreation 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		DList dl = new DList();
		for(int i=0;i<4;i++)
			dl.Insertion(in);
		dl.display();
		dl.findmiddle();
	}
}
