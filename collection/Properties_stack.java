package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public class Properties_stack {

	public static void main(String[] args)
	{
		List l1=new Stack();
		Stack s1=new Stack();
		
		s1.add("bench");
		 s1.add("chair");
		 s1.add("stool");
		 s1.add("table");
		 s1.add("sofa");
		 s1.add("chushion");
		 s1.add("coach");
		 s1.add("dinningtable");		 
		 s1.add("table");
		 s1.add("sofa");
		 
		 /*System.out.println(s1);
		 Collections.sort(s1);*/
		 
		 s1.pop();
		 System.out.println(s1);
		 
		 s1.peek();
		 System.out.println(s1);
		 
		 s1.push("bbbbbbbbb");
		 System.out.println(s1);
		 
		/* Stack s2=new Stack();
		 s2.add("country");
			s2.add(null);
			s2.add(null);
			s2.add(456);
			s2.add("jagree");
			s2.add("toordal");
			s2.add("jeera");*/
		 
		// System.out.println(s2);
		 
		/* s2.addAll(s1);
		 System.out.println(s2);*/
		 
		 /*s1.addAll(s2);
		 System.out.println(s1);*/
		 
		/* boolean b1=s1.equals(s2);
		 System.out.println(b1);*/
		 
		/* s2.clear();
		 System.out.println(s2);
		 boolean b2=s2.isEmpty();
		 System.out.println(b2);*/
		 
		/* System.out.println(s2.remove("jeera"));
		 System.out.println(s2);		 
		  s1.removeAll(s2);
		 System.out.println(s1);*/
		 
		 //System.out.println(s2.size());
		 
		/*boolean b3=s1.contains("sofa");
		System.out.println(b3);
		boolean b4=s1.containsAll(s2);
		System.out.println(b4); */
		 
		/* Iterator i1=s2.iterator();
		  while(i1.hasNext())
		  {
			  System.out.println(i1.next());
		  }
		  
		  ListIterator l2=s2.listIterator();
		  
		  while(i1.hasNext())
		  {
			  System.out.println(i1.next());
		  }
		  while(l2.hasPrevious())
		  {
			  System.out.println(l2.previous());
		  }*/
	}
}
