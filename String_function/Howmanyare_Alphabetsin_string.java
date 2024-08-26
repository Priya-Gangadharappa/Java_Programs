package String_function;

import java.util.Arrays;

public class Howmanyare_Alphabetsin_string {

	static int count_of_alphabet=0;
	
	public static void main(String[] args)
	{
		String input="kv no 01"; // take a string 
		char c1[]=input.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		System.out.println("Finding Alphabets");
		
		for(int i=0;i<input.length();i++) 
		{
		boolean answer1=Character.isAlphabetic(c1[i]);
		
		if(answer1==true)
		{
			count_of_alphabet++;
		}
	    }
		System.out.println("the total alpabets are--->" +count_of_alphabet);


}
}