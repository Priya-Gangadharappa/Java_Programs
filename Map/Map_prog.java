package Map;

import java.util.HashMap;
import java.util.Map;

public class Map_prog {

	public static void main(String[] args)
	{
	Map m1=new HashMap(); // upcasting
	m1.put("empid","GC004");      // (key ,value)
	m1.put("studenid","12cusb6050");//m1.put(object key, object value);
	m1.put("orderid", "emailid");
	m1.put("ordername", "mobileno");
	m1.put("stdname", "priya");
	m1.put("course", "PCMB");
	System.out.println(m1);
	System.out.println("--------------");
	System.out.println(m1.get("empid"));
	
	}
}
