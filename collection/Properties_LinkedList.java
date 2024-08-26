package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Properties_LinkedList {

	public static void main(String[] args) {
		List c1=new LinkedList();
		LinkedList l1=new LinkedList();
		 l1.add("bench");
		 l1.add("chair");
		 l1.add("stool");
		 l1.add("table");
		 l1.add("sofa");
		 l1.add("chushion");
		 l1.add("coach");
		 l1.add("dinningtable");
		 
		 l1.add("table");
		 l1.add("sofa");
		 
		 /*l1.add(null);  
		 
		 l1.add(1234);
		 l1.add(2345);
		 l1.add(654);
		 l1.add(876);*/
		 
		 //l1.add(null);
		 System.out.println(l1);
		 
		/* Collections.sort(l1);
		 System.out.println(l1); //null will not be taken for sort */
		 
		 LinkedList l2=new LinkedList();
		 l2.add(987654);
		 l2.add("beanbag");
		 l2.add("chape");
		 l2.add("bed");
		 l2.add("stool");
		 
		 l2.addAll(l1);
		 System.out.println(l2);
		 
		 /*boolean b1=l1.equals(l1);
		 System.out.println(b1);*/
		 
		 /*boolean b2=l2.isEmpty();
		 System.out.println(b2);*/
		 
		/* l2.clear();
		 System.out.println(l2);*/
		 
		 
		/*// System.out.println(l2.remove("bed"));		 
		 //System.out.println(l2.removeAll(l1));
		 
		//System.out.println(l1);
		// System.out.println(l2);*/
		 
		 //System.out.println(l1.size());
		 
		/* boolean b4=l1.contains("chushion");
		 System.out.println(b4);*/
		 
		/* boolean b6=l1.containsAll(l2);
		 
		 System.out.println(b6);*/
		/* System.out.println("--------------");
		 Iterator i1=l2.listIterator();
		 
		 while(i1.hasNext())
		 {
			 System.out.println(i1.next());
		 }
		  System.out.println("------------");
		 ListIterator i2=l1.listIterator();
		 
		 while(i2.hasPrevious())
		 {
			 System.out.println(i2.previous());
		 }*/
		 System.out.println("-----------------");
		 l1.addFirst("fffffffffffffffff");
		 System.out.println(l1);
		 
		 System.out.println("-----------");
		 l1.addLast("lastllllllll");
		 System.out.println(l1);
		 
		 System.out.println("-----------");
		 l1.getFirst();
		 System.out.println(l1);
		 
		 System.out.println("------------");
		 l2.getLast();
		 System.out.println(l2);
		 
		 System.out.println("-----------");
		 l1.removeFirst();
		 System.out.println(l1);
		 
		System.out.println("---------");
		l1.removeLast();
		System.out.println(l1);
		
		System.out.println("-------------");
		l1.pollFirst();
		System.out.println(l1);
		
		System.out.println("----------");
		l1.pollLast();
		System.out.println(l1);

		 
		 	 

	}

}
