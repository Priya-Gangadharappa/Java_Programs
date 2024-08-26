package String_function;

import java.util.Arrays;

public class Howmanyare_Spaceinstring {
 static int count_of_spaces=0;
	public static void main(String[] args) 
	{
		String input="kv no 8765 Bangalore";
		char c1[]=input.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		System.out.println("Finding Sapces");
		for(int i=0;i<input.length();i++)
		{
			boolean answer1=Character.isSpaceChar(c1[i]);
			
			if(answer1==true)
			{
				count_of_spaces++;
			}
	}
System.out.println("sapces found are --->" +count_of_spaces);

}
}
