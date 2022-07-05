package DSA.Queue;

import java.util.*;

class Book implements Comparable<Book>
{
	int id,qty;
	String name,author,pub;
	
	public Book(int id,String name,String author,String pub,int qty)
	{
		this.id = id;
		this.name = name;
		this.author = author;
		this.pub = pub;
		this.qty = qty;
	}
	
	public int compareTo(Book b)
	{
		if(qty>b.qty)
			return 1;
		else if(qty<b.qty)
			return -1;
		else
			return 0;	
	}
}

public class PQueue1 
{
	public static void main(String args[])
	{
		PriorityQueue<Book> pq = new PriorityQueue<Book>();
		Book b1 = new Book(211,"C","Prakash","Raj Ent",100);
		Book b2 = new Book(311,"C++","Ram","KP Ent",10);
		Book b3 = new Book(111,"C#","Sai","Fun Ent",99);
		
		pq.add(b1);
		pq.add(b2);
		pq.add(b3);
		
		System.out.println("Before Removing..");
		
		for(Book b:pq)
		{
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.pub+" "+b.qty);
		}
		
		System.out.println("\nAfter Removing\n");
		
		pq.remove();
		for(Book b:pq)
		{
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.pub+" "+b.qty);
		}
	}
}
