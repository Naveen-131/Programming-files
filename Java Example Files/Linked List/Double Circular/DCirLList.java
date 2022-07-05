package DSA.DoubleCLinkedList;

class Node1
{
	int data;
	Node1 next;
	Node1 prev;
	
	public Node1(int data)
	{
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}

class DcList
{
	Node1 head = null,tail = null;
	
	public void Insertion(int x)
	{
		Node1 newnode = new Node1(x);
		if(head==null)
		{
			head = tail = newnode;
			head.next = head;
			head.prev = newnode;
			System.out.println("Inserted..!!");
		}
		else 
		{
			tail.next = newnode;
			newnode.prev = tail;
			newnode.next = head;
			head.prev = newnode;
			tail = newnode;
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
			Node1 tmp = head;
			while(tmp!=tail)
			{
				System.out.println(tmp.data);
				tmp = tmp.next;
			}
			System.out.println(tmp.data);
		}
	}
}
public class DCirLList 
{
	public static void main(String args[])
	{
		DcList dl = new DcList();
		dl.Insertion(10);
		dl.Insertion(50);
		dl.Insertion(20);
		dl.Insertion(40);
		dl.Insertion(30);
		dl.display();
	}
}
