package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Properties_LinkedHashSet {

	public static void main(String[] args) 
	{
		Set s1=new LinkedHashSet();
		LinkedHashSet l1=new LinkedHashSet();
		
		l1.add("rice");
		l1.add("wheat");
		l1.add("Ragi");
		l1.add("jowar");
		l1.add("puffed rice");
		//l1.add(null);
		//l1.add("puffed rice");
		System.out.println(l1);
		
		LinkedHashSet l2=new LinkedHashSet();
		l2.add("sugar");
		l2.add("salt");
		l2.add("45679");
		l2.add("890876");
		l2.add(null);
		l2.add("jaggrey");
		System.out.println(l2);
		
		/*System.out.println("----------------");
		Collections.sort(l1);*/
		
		System.out.println("--------------------");
		l2.addAll(l1);
		System.out.println(l2);
		
		System.out.println("---------------");
		boolean b1=l1.equals(l2);
		System.out.println(b1);
		
		System.out.println("----------------");
		boolean b2=l1.isEmpty();
		System.out.println(b2);
		
		/*System.out.println("--------------");
		l2.clear();
		System.out.println(l2);*/
		
		System.out.println("-------------");
		System.out.println(l2.remove("rice"));
		
		System.out.println("------------");
		l2.removeAll(l1);
		System.out.println(l2);
		
		System.out.println("----------");
		System.out.println(l2.size());
		
		System.out.println("------------------");
		boolean b4=l2.contains("jaggrey");
		System.out.println(b4);
		
		System.out.println("--------------");
		boolean b5=l2.containsAll(l1);
		System.out.println(b5);
		
		System.out.println("-------------");
		Iterator i1=l2.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
