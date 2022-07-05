package DSA.LinkedList;

class Node2
{
	int data;
	Node2 next;
	
	public Node2(int data)
	{
		this.data = data;
		this.next = null;
	}
}

class LLc
{
	public Node2 head=null;
	Node2 tail = null;
	public int size=0;
	
	public void Inertion(int x)
	{
		Node2 nw = new Node2(x);
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
	
	public void Reverse()
	{
		Node2 prev,curr,nxt;
		prev = null;
		curr = nxt = head;
		
		while(nxt!=null)
		{
			nxt = nxt.next;
			curr.next = prev;
			prev = curr;
			curr = nxt;
		}
		head = prev;
	}
	
	public void display()
	{
		if(head==null)
		{
			System.out.println("Empty List");
		}
		else
		{
			Node2 tmp = head;
			while(tmp.next!=null)
			{
				System.out.println(tmp.data);
				tmp=tmp.next;
			}
			System.out.println(tmp.data);
		}
	}
}


public class ReverseLList 
{
	public static void main(String args[])
	{
		LLc ll = new LLc();
		ll.Inertion(10);
		ll.Inertion(20);
		ll.Inertion(30);
		ll.Inertion(40);
		ll.Reverse();
		ll.display();
	}
}
