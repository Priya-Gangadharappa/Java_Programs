package Map;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_wrapperclass1 {

	public static void main(String[] args)
	{
	Map<String,Integer> m1=new HashMap<String,Integer>(); //upcasting
	m1.put("Rice", 50);
	m1.put("sugar", 2);
	m1.put("jaggrey", 2);
	m1.put("salt", 1);
	m1.put("dal", 5);
	m1.put("Rice", 50);
	System.out.println(m1);
	
	/*System.out.println("---------");
	m1.remove("dal");
	System.out.println(m1);

	System.out.println("------------");
	m1.remove("salt", 1);
	System.out.println(m1);*/
	
	System.out.println("-----------");
	m1.replace("dal", 8);
	System.out.println(m1);
	
	System.out.println("-------------");
	m1.replace("Rice", 50, 60);
	System.out.println(m1);
	
	Map<String,Integer> m2=new HashMap<String,Integer>();
	m2.put("Toordal", 7);
	m2.put("mong dal", 8);
	m2.put("blackseeds", 10);
	System.out.println("----------");
	System.out.println(m2);
	
	System.out.println("---------------");
	//  .
	System.out.println(m2);
	
	System.out.println("----------");
    Set<String> s1=m2.keySet();
    System.out.println(s1);
    
    System.out.println("---------");
    for(String s2:m2.keySet())
    {
    	System.out.println(s2);
    }
    
    System.out.println("-----------");
    for(Integer i1:m2.values())
    {
    	System.out.println(i1);
    }
    
    System.out.println("------------");
    for(Entry<String,Integer>  e1: m2.entrySet())
    {
    	System.out.println(e1);
    }
	
    System.out.println("--------");
    Iterator<Entry<String,Integer>> i2  = m2.entrySet().iterator();
    while(i2.hasNext())
    {
    	System.out.println(i2.next());
    }
    System.out.println("----------------");
    m1.putIfAbsent("teapowder", 1);
    System.out.println(m1);
    System.out.println("----------");
    m1.putIfAbsent("salt", 1);
    System.out.println(m1);
    
    
    System.out.println("------------");
    m1.get("teapowder");
    System.out.println(m1);
    
    m1.get("jeera");
    System.out.println(m1);
	}

}
