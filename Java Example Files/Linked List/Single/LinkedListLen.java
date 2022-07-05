package DSA.LinkedList;

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

class LLcreation
{
	public Node1 head=null;
	Node1 tail = null;
	public int size=0;
	
	public void Inertion(int x)
	{
		Node1 nw = new Node1(x);
		if(head==null && size==0)
		{
			head = nw;
			tail = nw;
			size++;
		}
		else 
		{
			tail.next = nw;
			tail = nw;
			size++;
		}
	}
	
	public void getSize()
	{
		System.out.println(size);
	}
	
	public void display()
	{
		if(head==null)
		{
			System.out.println("Empty List");
		}
		else
		{
			Node1 tmp = head;
			while(tmp.next!=null)
			{
				System.out.println(tmp.data);
				tmp=tmp.next;
			}
			System.out.println(tmp.data);
		}
	}
}
public class LinkedListLen 
{
	public static void main(String args[])
	{
		LLcreation ll = new LLcreation();
		ll.Inertion(10);
		ll.Inertion(20);
		ll.getSize();
		ll.Inertion(30);
		ll.Inertion(40);
		ll.display();
		ll.getSize();
	}
}
