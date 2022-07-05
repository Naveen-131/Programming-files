package DSA.Queue;

import java.util.*;

public class PQueue 
{
	public static void main(String args[])
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Custom());
		pq.add(4);
		pq.add(2);
		pq.add(1);
		pq.add(3);
		//pq.add(2);
		System.out.println("Priority Queue "+pq);
	}
}

class Custom implements Comparator<Integer>
{
	@Override
	public int compare(Integer num1,Integer num2)
	{
		int value = num2.compareTo(num1);
		if(value>0)
		{
			return -1;
		}
		else if(value<0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
