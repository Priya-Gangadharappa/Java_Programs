package collection;

import java.util.ArrayList;
import java.util.Collection;

public class collection_methods {

	public static void main(String[] args) {
		Collection c1=new ArrayList(); // conerting child class object to super class type
		c1.add("age");
		c1.add("color");
		c1.add("address");
		c1.add("pincode");
		c1.add("city");
		//c1.add(24);
		//c1.add(6788);
		//c1.add(560091);
		c1.add("01");
		System.out.println(c1);
		
		Collection c2=new ArrayList();
		c2.addAll(c1);
		c2.add("rice");
		c2.add("sugar");
		System.out.println(c2);
		
		boolean b1=c2.equals(c1);
		System.out.println(b1);
		
		boolean b2=c1.isEmpty();
        System.out.println(b2);
        
   /*     c2.clear();
        System.out.println(c2);
        
        System.out.println(c1.remove(01));
        
        c1.removeAll(c2);
        System.out.println(c1);*/
        
        boolean b3=c2.containsAll(c1);
        
        System.out.println(b3);
        
        
	}

}
