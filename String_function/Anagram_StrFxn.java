package String_function;

import java.util.Arrays;

public class Anagram_StrFxn {

	public static void main(String[] args) 
	{
		String s1="face";
		String s2="cafe";
		
		if(s1.length()!=s2.length())
		{
			System.out.println("Not Anagram");
		}
		else
		{
			
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray(); // Converting the given string into Array
			Arrays.sort(c1);
			Arrays.sort(c2); // sort the array 
			
		    System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
		
		
		boolean a1=Arrays.equals(c1,c2);  // Compare the string after sorting
		System.out.println(a1);
		
		if(a1=true) // if the sorted string is equal then print true
		{
			System.out.println("It is an Anagram");
		}
		else 
		{
			System.out.println("Its not an Anagram");
		}
	}

	}
}
