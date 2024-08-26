package String_Builder_Buffer;

public class Creating_string 
{

	public static void main(String[] args) 
	{
		String s="Manish"; // stored in string object in String class
		String s1=new String("Manish");
		System.out.println(s1);
		
		StringBuilder s2=new StringBuilder("Abhishek"); // stored in StringBuilder class
		System.out.println(s2);
		
		StringBuffer s3=new StringBuffer("Manish tiwari");// Stored in String buffer class
		System.out.println(s3);
		
	}// they are different from each other because of their methods
	 // bcz of version 1.2 and not safe to use 
	// both havde 3 same constructor 

}
