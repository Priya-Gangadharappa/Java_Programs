package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collection_methods_2 
{

	public static void main(String[] args) 
	{
		Collection c1=new ArrayList(); // converting child class object to super class type
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
		
		Iterator i1=c1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		System.out.println(c1.size());
		
		boolean b1=c1.contains("color");
		System.out.println(b1);
		
	
		}

	}


