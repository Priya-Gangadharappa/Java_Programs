package collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Properties_vector {

	public static void main(String[] args) 
	{
		
	Vector v1=new Vector();
	v1.add(123);
	v1.add(567);     //Index -true
	v1.add(789);     // order of insertion - true 
	v1.add("age");
	v1.add("color");    // dynamic :- true
	v1.add("address");
	v1.add("pincode");   // Heterogeneous :- true
	v1.add("city");
	v1.add("rice");
	v1.add("sugar");
	v1.add("pineapple");
	v1.add(null);
	v1.add(null);
	v1.add(null);    // null :- true
	v1.add("rice");   //duplicate :- true
	System.out.println(v1);
	
	//v1.set(5, 987); 
	
	/*v1.remove(5); // remove(int index)
    v1.remove("age"); //remove(object o)*/
    
   Vector v2=new Vector();
    v2.add("jagree");
	 v2.add("toordal");
	 v2.add("jeera");
	 
	 System.out.println(v2);
	
	 /*System.out.println(v2.remove("jeera"));
	 System.out.println(v2);*/
	 
	 v1.addAll(v2);
	System.out.println(v1);
	
	/*v1.removeAll(v2);
	System.out.println(v1);*/
	
	/*Collections.sort(v1);
	System.out.println(v1);*/
	
   /* boolean b1= v1.equals(v2);
    System.out.println(b1);
    
    boolean b2=v2.isEmpty();
    System.out.println(b2);*/
			
	/*v2.clear();
	System.out.println(v2);*/
	
	 /*v1.size();
	 System.out.println(v1.size());*/
	 
	 /*boolean b5=v1.contains("rice");
	 System.out.println(b5);*/
	 
	 
	 /*boolean b6=v2.containsAll(v1);
	 System.out.println(b6);*/
			
		 System.out.println("---------------");
	Iterator i1=v1.iterator();
	
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
	  
	System.out.println("---------------");
	
	 ListIterator l1=v1.listIterator();
	 
     while(l1.hasPrevious())
       {
	     System.out.println(l1.previous());
       }
     System.out.println("---------------");
     
    Enumeration e=v1.elements();
    
    while(e.hasMoreElements())
    {
    	System.out.println(e.nextElement());
    }
	}

}
