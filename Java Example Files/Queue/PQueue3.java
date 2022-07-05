package DSA.Queue;

import java.util.*;

public class PQueue3 
{
	public static void main(String args[])
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
		pq.add(100);
		pq.add(121);
		pq.add(118);
		pq.add(11);
		pq.add(1227);
		
		System.out.println(pq);
		
		System.out.println(pq.poll()+" next "+pq.poll());
		
		System.out.println(pq.remove(121));
		
		System.out.println(pq);
	}
}
