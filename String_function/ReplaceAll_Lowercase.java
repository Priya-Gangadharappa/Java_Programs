package String_function;

public class ReplaceAll_Lowercase {

	public static void main(String[] args)
	{
		String s1="Manish Kumar Thiwari";
		
		System.out.println(s1.replaceAll("[a-z]", " "));
		
		System.out.println(s1.replaceAll("[a-z]", ""));
	}

}
