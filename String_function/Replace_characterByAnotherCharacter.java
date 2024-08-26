package String_function;

public class Replace_characterByAnotherCharacter //Replaces the old character by new character
{

	public static void main(String[] args)
	{
	    String s1="Rishi";
		
		System.out.println(s1.replace("s", "d")); //(var_name.replace(char oldchar,char newchar)) Return type will be String 

		String m1="manish kumar Thiwari";
		System.out.println(m1.replace('m','z'));
		// if there are two same character in a string then both with replace by newchar
		
		System.out.println(m1.replace("ma", "ku"));
		
		System.out.println(m1.replace(" ","0")); // space can also be replaced with any character
		
		System.out.println(m1.replace("manish", "Rakesh")); // accepts the string not only single character  
		
		System.out.println(m1.replace("m", " "));
		
		System.out.println(m1.replace(" ", " "));// Replace with nothing gives you Same String 
	}

}
