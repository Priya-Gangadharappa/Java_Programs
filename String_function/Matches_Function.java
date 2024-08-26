package String_function;

public class Matches_Function 
{ // Multi characters matching search (.*)

	public static void main(String[] args) 
	{
		String a="Ramu";
		System.out.println(a.matches("R(.*)")); // boolean value / write the logic to display name starts with R
		
		System.out.println(a.matches("...."));// write the logic to display name with 4 letter
		
		System.out.println(a.matches("(.*)u"));// write the logic to display name ends with u 
		
		System.out.println(a.matches("(.*)m(.*)")); // write the logic to display name anywhere with m
	}

}
