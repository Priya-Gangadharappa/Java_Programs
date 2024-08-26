package String_function;

import java.util.Arrays;

public class Howmanyare_numericinString {
 static int count_of_numeric=0;
 
	public static void main(String[] args) 
	{
		String input="kv no 9876 Bangalore";
		char c1[]=input.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		System.out.println("Finding Numeric value in given string");
		
		for(int i=0;i<input.length();i++)
		{
		boolean answer1=Character.isDigit(c1[i]);
		
		if(answer1==true)
		{
			count_of_numeric++;
		}
		
		}
		System.out.println("the total numeric are-->" +count_of_numeric);
	}

}
