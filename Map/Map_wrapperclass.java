package Map;

import java.util.HashMap;
import java.util.Map;

public class Map_wrapperclass {

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
		

	}

}
