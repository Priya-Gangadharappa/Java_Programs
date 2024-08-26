package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Properties_Treeset {

	public static void main(String[] args) 
	{
		Set s1=new TreeSet();
		TreeSet t1=new TreeSet();
		
		 t1.add("bench");
		 t1.add("chair");
		 t1.add("stool");
		 t1.add("table");
		 t1.add("sofa");
		 t1.add("chushion");
		 t1.add("coach");
		 t1.add("dinningtable");		 
		 t1.add("table");
		 t1.add("sofa");
		 
		 System.out.println(t1);
		 
		/* Collections.sort(t1);
		 System.out.println(t1);*/
		 System.out.println("-----------------");
		 TreeSet t2=new TreeSet();
		 t2.add(6789);
		 t2.add(2365);
		 t2.add(456);
		 t2.add(2365);
		 System.out.println(t2);
		 
		 System.out.println("-----------------");
		 
		/* t2.addAll(t1);
			System.out.println(t2);*/
		 
		 Iterator i1=t1.iterator();
			
			while(i1.hasNext())
			{
				System.out.println(i1.next());
			}
		 
			System.out.println("-----------------");
			System.out.println(t1.contains("table"));
			
			/*System.out.println("-----------------");
			System.out.println(t2.containsAll(t1));*/
			
			System.out.println("-----------------");
			System.out.println(t1.size());
			
			System.out.println("-----------------");
			System.out.println(t1.isEmpty());
			
			System.out.println("-----------------");
			System.out.println(t1.remove("table"));
			
			System.out.println("-----------------");
			boolean b1=t1.equals(t2);
			System.out.println(b1);
			
			System.out.println("-----------------");
			t2.clear();
			System.out.println(t2);

	}

}
