package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;


class Arraylist {
	
	static ArrayList<Integer> reverseList(ArrayList<Integer> l1)
	{
		int m=20,n=30;
		
			Integer x=l1.indexOf(m);
			l1.set(x,n);
	
		return l1;
	}
	
    public static  void main(String[] args)
    {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(20);
        arr.add(4,40);
        System.out.println(arr);
        System.out.println(arr.get(2));
        arr.remove(4);
        System.out.println(arr);
        arr.set(3,20);
        System.out.println(arr);
        arr.add(2,20);
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);
        
       
      
        //Iterating ArrayList
        for(int num:arr)
        {
        	System.out.println(" * "+num);
        }
        System.out.println("ArrayList size "+arr.size());
        arr.add(2,100);
        System.out.println(arr);
        //Sorting
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println("Index of 30: "+arr.indexOf(30));

        for(int i=0;i<arr.size();i++)
        {
            System.out.println(arr.get(i));
        }

        Iterator itr=arr.iterator();
        while(itr.hasNext())
        {
            System.out.print("  "+itr.next());
        }

        Collections.addAll(arr,1000,200,300);
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);

        System.out.println("Index at "+Collections.binarySearch(arr,200));    
        
     
       System.out.println(reverseList(arr));
       
      
       
      
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       





    }

}
