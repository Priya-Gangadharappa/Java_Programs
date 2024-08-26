package String_Builder_Buffer;

public class StringBuffer_Method {

	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("Manish ");//  1st string 
             s1.append("tiwari"); // modifier string 
             System.out.println(s1);
         // mutable in nature   
             System.out.println("----------------------");
             StringBuffer s2=new StringBuffer("Manish Kumar Tiwari");
     		System.out.println(s2.capacity());
     		System.out.println("----------------------");
     		StringBuffer s3=new StringBuffer("Manish Kumar Tiwari");
    		System.out.println(s3.charAt(7));
    		System.out.println("----------------------");
    		/*StringBuffer s4=new StringBuffer("Manish Kumar Tiwari");
    	       s4.delete(0, 7);
    	       System.out.println(s4);*/
    	   System.out.println("----------------------");
    	   StringBuffer s5=new StringBuffer("Manish Kumar Tiwari");
   		s5.ensureCapacity(50);
   		System.out.println(s5);
   		System.out.println("----------------------");
   		StringBuffer s6=new StringBuffer("Manish Tiwari");
		s6.insert(7, "Kumar ");
		System.out.println(s6);
		System.out.println("----------------------");
           StringBuffer s7=new StringBuffer("Manish Kumar Tiwari");
		System.out.println(s7.length());
		System.out.println("----------------------");
		StringBuffer s8=new StringBuffer("Manish Kumar Tiwari");
		s8.replace(0, 6, "Abhishek");
		System.out.println(s8);
		System.out.println("----------------------");
		StringBuffer s9=new StringBuffer("Manish Kumar Tiwari");
		s9.reverse();
		System.out.println(s9);
		System.out.println("----------------------");
		StringBuffer s10=new StringBuffer("Manish Kumar Tiwari");
		System.out.println(s10.substring(7));
		System.out.println("----------------------");
		StringBuffer s11=new StringBuffer("Manish Kumar Tiwari");
		System.out.println(s11.substring(0, 12));

		
		
             
	}

}
