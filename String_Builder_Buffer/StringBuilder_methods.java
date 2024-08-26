package String_Builder_Buffer;

public class StringBuilder_methods {

	public static void main(String[] args) 
	{
		StringBuilder s1=new StringBuilder("Abhishek Kumar Tiwari");
		System.out.println(s1.substring(9));
		System.out.println("-----------------");
		
		StringBuilder s2=new StringBuilder("Manish Kumar Tiwari");
		System.out.println(s2.substring(0, 12));
		System.out.println("-----------------");
		
		StringBuilder s3=new StringBuilder("Manish Kumar Tiwari");
		s3.reverse();
		System.out.println(s3);
		System.out.println("-----------------");
		
		StringBuilder s4=new StringBuilder("Manish Kumar Tiwari");
		s4.replace(0, 6, "Abhishek");
		System.out.println(s4);
		System.out.println("-----------------");
		
		StringBuilder s5=new StringBuilder("Manish Kumar Tiwari");
		System.out.println(s5.length());
		System.out.println("-----------------");
		
		StringBuilder s6=new StringBuilder("Manish Tiwari");
		s6.insert(7, "Kumar ");
		System.out.println(s6);
		System.out.println("-----------------");
		
		StringBuilder s7=new StringBuilder("Manish Kumar Tiwari");
		s7.ensureCapacity(50);
		System.out.println(s7);
		System.out.println("-----------------");
		
		StringBuilder s8=new StringBuilder("Manish Kumar Tiwari");
		s8.delete(0, 7);
	    System.out.println(s8);
	    System.out.println("-----------------");
	    
	    StringBuilder s9=new StringBuilder("Manish Kumar Tiwari");
	    System.out.println(s9.charAt(7));
	    System.out.println("-----------------");
	    
	    StringBuilder s10=new StringBuilder("Manish Kumar Tiwari");
	    System.out.println(s10.capacity());
	    System.out.println("-----------------");
	    
	    StringBuilder sb1=new StringBuilder("Abhishek ");
		sb1.append("Tiwari");
		System.out.println(sb1);
	}

}
