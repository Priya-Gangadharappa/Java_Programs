package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Properties_hashSet {

	public static void main(String[] args) 
	{
		Set s1=new HashSet();
		HashSet h1=new HashSet();
		
		h1.add("rice");
		h1.add("wheat");
		h1.add("Ragi");
		h1.add("jowar");
		h1.add("puffed rice");
		h1.add(null);
		h1.add("puffed rice");
		System.out.println(h1);
		
		HashSet h2=new HashSet();
		h2.add("sugar");
		h2.add("salt");
		h2.add("jaggrey");
		h2.add("45679");
		h2.add("890876");
		h2.add(null);
		
		System.out.println(h2);
		
		h2.addAll(h1);
		System.out.println(h2);
		
		System.out.println("------------------------------");
		
		Iterator i1=h2.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("-----------");
		System.out.println(h2.contains("rice"));
		
		System.out.println("------------");
		System.out.println(h2.containsAll(h1));
		
		System.out.println("-----------");
		System.out.println(h1.size());
		
		System.out.println("-------------");
		System.out.println(h1.isEmpty());
		
		System.out.println("-------------");
		//Collections.sort(h1);
		/*h1.clear();
		System.out.println(h1);*/
		System.out.println("-----------");
		System.out.println(h1.remove("puffed rice"));
		System.out.println(h1);
		
		System.out.println("---------");
		boolean b1=h1.equals(h2);
		System.out.println(b1);
		
		System.out.println("--------------");
		h2.removeAll(h1);
		System.out.println(h2);
		
		System.out.println("---------");
		boolean b2=h1.contains("puffed rice");
		System.out.println(b2);
		
		System.out.println("-----------------");
		boolean b3=h1.containsAll(h2);
		System.out.println(b3);
	}

}
