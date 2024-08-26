package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Behaviour_of_set {

	public static void main(String[] args) 
	{
    Set s1= new HashSet();
		
		s1.add("swathi");
		s1.add("rahmya");
		s1.add("utkarsh");
		s1.add("sandhya");
		s1.add(null);
		s1.add(12);
		System.out.println(s1);
	//	Collections.sort(s1); // homogeneous value
		
		Iterator i1=s1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		}
	}


