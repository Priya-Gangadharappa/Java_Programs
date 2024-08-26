package Map;

import java.util.HashMap;
import java.util.Map;

public class Map_Wrapperclass2 {

	public static void main(String[] args) {
		Map<String,Double> m1=new HashMap<String,Double>(); //upcasting
		m1.put("Rice", 50.50);
		m1.put("sugar", 2.34);
		m1.put("jaggrey", 2.09);
		m1.put("salt", 1.05);
		m1.put("dal", 5.67);
		System.out.println(m1);
		

	}

}
