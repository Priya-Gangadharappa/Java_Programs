package String_function;

import java.util.Arrays;

public class Finding_Spaces {

	public static void main(String[] args)
	{
		String input="kv no 01";
		char[] c1=input.toCharArray();
		
	System.out.println(Arrays.toString(c1));
	
	for(int i=0;i<input.length();i++)
	{
		boolean answer1=Character.isSpaceChar(c1[i]);
		System.out.println(answer1);
	}
		
	}

}
