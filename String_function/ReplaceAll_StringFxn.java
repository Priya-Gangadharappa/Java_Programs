package String_function;

public class ReplaceAll_StringFxn {

	public static void main(String[] args)
	{
		String s1="Avinash Yadhav";
		
		System.out.println(s1.replaceAll("[A-Z]", " ")); // just Removes the uppercase 
		
		System.out.println(s1.replaceAll(" ", " Avinash Yadhav ")); // Replace space with the string

	}

}
