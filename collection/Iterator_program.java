package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator_program {

	public static void main(String[] args) {
	
			List l1=new ArrayList();
			l1.add("age");
			l1.add("color");
			l1.add("address");
			l1.add("pincode");
			l1.add("city");
			l1.add("state");
			l1.add("country");
			l1.add("country");
			l1.add("country");
			l1.add("country");
			//l1.add(null);
			//l1.add(null);
			//l1.add(456);
			
			Collections.sort(l1); // ascending  auto sorting is not possible should do explicitly
			
			System.out.println(l1);
			
			// Iteration forward
			Iterator i1=l1.iterator();
			
			while(i1.hasNext())
			{
				System.out.println(i1.next()); // return type is object
				
			}
			// forward list iterator using list iterator
			ListIterator l4=l1.listIterator();
			
			while(l4.hasNext())
			{
				System.out.println(l4.next());
			}
			
			// backward iterator using list iterator
			while(l4.hasPrevious())
			{
				System.out.println(l4.previous());
			}
		}
	}


