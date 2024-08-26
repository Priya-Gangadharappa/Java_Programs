package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Properties_Priorityset {

	public static void main(String[] args) 
	{
		Queue q1=new PriorityQueue();
		PriorityQueue<String> p1=new PriorityQueue<String>();
		p1.add("rice");
		p1.add("wheat");
		p1.add("Ragi");
		p1.add("jowar");
		p1.add("puffed rice");
		p1.add("puffed rice");  
		System.out.println(p1);
		
		/*Collections.sort(p1);
	    System.out.println(p1);*/
		
		PriorityQueue<Integer> p2=new PriorityQueue<Integer>();
		p2.add(123);
		p2.add(234);
		p2.add(345);
		System.out.println(p2);
		
	   //p2.addAll(p1);
	   
		System.out.println("----------------");
		boolean b1=p2.equals(p1);
		System.out.println(b1);
		/*System.out.println("--------------------");
		p1.clear();
		System.out.println(p1);*/
		
		System.out.println("--------------------");
		boolean b2=p1.isEmpty();
		System.out.println(b2);
		
		System.out.println("--------------------");
		p1.remove("puffed rice");
		System.out.println(p1);
		
		System.out.println("--------------------");
		System.out.println(p1.size());
		
		System.out.println("--------------------");
		boolean b4=p1.contains("rice");
		System.out.println(b4);
		
		System.out.println("--------------------");
		Iterator i1=p1.iterator();
		 while(i1.hasNext())
		 {
			 System.out.println(i1.next());
		 }
		 
		 System.out.println("--------------------");
		 Iterator i2=p2.iterator();
				  while(i2.hasNext())
				  {
					  System.out.println(i2.next());
				  }
	}

}
