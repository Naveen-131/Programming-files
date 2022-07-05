package DSA.DoubleLinkedList;

import java.util.*;
class Node2
{
	int data;
	Node2 prev;
	Node2 next;
	
	public Node2(int data)
	{
		this.data = data;
		this.prev = null;
		this.next = null;
	}
}
class DRList
{
	public Node2 head,tmp=null;
	public int size = 0;
	
	public void Insertion(Scanner in)
	{
		int x = in.nextInt();
		Node2 newnode = new Node2(x);
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
			Node2 dis=head;
			while(dis!=null)
			{
				System.out.println(dis.data);
				dis = dis.next;
			}
			//System.out.println(dis.data);
		}
	}
	public void reverseList() 
	{
		Node2 curr = head;
		Node2 nxt;
		while(curr!=null)
		{
			nxt = curr.next;
			curr.next = curr.prev;
			curr.prev = curr.next;
			curr = nxt;
		}
		curr=head;
		head = tmp;
		tmp = curr;
		System.out.println("Head "+head.data);
		System.out.println("Tail "+tmp.data);
	}
}

public class ReverseDlist 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		DRList dl = new DRList();
		for(int i=0;i<3;i++)
			dl.Insertion(in);
		dl.display();
		dl.reverseList();
	}
}
