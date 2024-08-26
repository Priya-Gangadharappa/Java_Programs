package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Ass_behavior_of_collection {

	public static void main(String[] args) {
		Collection c1=new ArrayList(); // Converting child class object to super class type
		c1.add("age");
		c1.add("color");
		c1.add("address");
		c1.add("pincode");
		c1.add("city");
		//c1.add(24);
		//c1.add(6788);
		//c1.add(560091);
		//c1.add("01");
		c1.add("apple");
		//c1.add(null);
		c1.add("rice");
		c1.add("sugar");
		c1.add("pineapple");
		c1.add(null);
		c1.add("elephant1");
		c1.add("home");
		c1.add("rice");
		c1.add("mobile");
		c1.add("television098765");
		c1.add("@#$%^&*(");
		//c1.add(null);
		
	
		System.out.println(c1);
		//Collections.sort(c1);
		
		Iterator i1=c1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
			
		}
		
		
	}

}
