package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Behavior_of_list {  // list is interface hence it is abstract methods

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
		l1.add(null);
		l1.add(null);
		l1.add(456);
		System.out.println(l1);
		//Collections.sort(l1); // ascending // autosorting is not possible should do explicitly
		
		Iterator i1=l1.listIterator();
		 while(i1.hasNext())
				 {
			 System.out.println(i1.next());
				 }
		 
		 ListIterator l9=l1.listIterator();
		 
		 while(l9.hasPrevious())
		 {
			 System.out.println(l9.previous());
		 }
	}
	

}
