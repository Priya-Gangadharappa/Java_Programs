package Map;

import java.util.HashMap;
import java.util.Map;

public class Map_Interface_methods {

	public static void main(String[] args) 
	{
Map<String,String> m1=new HashMap<String,String>(); // upcasting
		
		
		m1.put("empid","GC004");      
		m1.put("studenid","12cusb2050");
		m1.put("orderid", "emailid");
		m1.put("ordername", "mobileno");
		m1.put("stdname", "priya");
		m1.put("course", "PCMB");
		System.out.println(m1);
		
		/*m1.clear();  // clears the map and it becomes empty 
		System.out.println(m1);*/
		
		System.out.println(m1.isEmpty()); // boolean  it check if map is empty or not
		
		boolean b1=m1.containsKey("empid");// it checks if the key is present in the map
		System.out.println(b1);
		
		boolean b2=m1.containsValue("priya");//it checks if the value is present in the map
		System.out.println(b2);
		
		Map<String,String> m2=new HashMap<String,String>();
		
		m2.put("state1", "karnataka");
		m2.put("state2", "Maharastra");
		m2.put("state3", "kashmir");
		m2.put("state4", "madyapradesh");
		m2.put("state5", "uttarpradesh");
		m2.put("state6", "goa");
		System.out.println(m2);
		System.out.println("------------------");
		m2.putAll(m1); // adding one map to another map 
		System.out.println(m2);
		System.out.println("------------");
		boolean b4=m1.equals(m2); // it checks if both the map are equal 
		System.out.println(b4);
		
		//System.out.println(m1.size()); it gives 0 size
		
		if(m1.size()==m2.size())
		{
			System.out.println("size of m1 and m2 are  same");
		}
		else
		{
			System.out.println("size is different");
		}

	}

}
