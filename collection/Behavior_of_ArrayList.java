package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Behavior_of_ArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList(); //arraylist is class so we can create an object and access the properties
		
		a1.add(123);
		a1.add(567);     //Index -true
		a1.add(789);     // order of insertion - true 
		a1.add("age");
		a1.add("color");    // dynamic :- true
		a1.add("address");
		a1.add("pincode");   // Heterogeneous :- true
		a1.add("city");
		a1.add("rice");
		a1.add("sugar");
		a1.add("pineapple");
		a1.add(null);
		a1.add(null);
		a1.add(null);    // null :- true
		a1.add("rice");   //duplicate :- true
		System.out.println(a1);
		a1.set(5, 987); //  set(int index, object element)
		
		//a1.remove(5); // remove(int index)
		//a1.remove(a1); //remove(object o)
		
		//Collections.sort(a1);
		
	/*	Iterator i1=a1.iterator();
		
		 while(i1.hasNext())
		 {
			 System.out.println(i1.next());
			
		 }
		  
		 ListIterator l1=a1.listIterator();
		 
		 while(l1.hasPrevious())
		 {
			 System.out.println(l1.previous());
			 
		 }*/
		 ArrayList b2=new ArrayList();
		 b2.add("jagree");
		 b2.add("toordal");
		 b2.add("jeera");
		 a1.addAll(b2);
		 System.out.println(b2);
		 
		 boolean b4=b2.contains("jeera"); // contains : boolean
		 System.out.println(b4);
		 boolean b5=b2.containsAll(a1);  // containsAll : boolean
		 System.out.println(b5);
		 
		 boolean b6=b2.isEmpty();
		 System.out.println(b6);
		 
		 System.out.println(a1.size());
		 
		 b2.clear();
		 System.out.println(b2);
		 
		 
		 
		 System.out.println(b2.remove("jeera"));
		 
		 System.out.println(b2.removeAll(a1));
		 
		 System.out.println(b2);
		 
		 System.out.println(a1);
		 
		 Iterator i1=a1.listIterator();
		 while(i1.hasNext())
				 {
			 System.out.println(i1.next());
				 }
		 
		 ListIterator l9=a1.listIterator();
		 
		 while(l9.hasPrevious())
		 {
			 System.out.println(l9.previous());
		 }
		 
	}

}
