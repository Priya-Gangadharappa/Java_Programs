package String_function;
import java.util.Arrays;
public class string_tocharAt 
{
	public static void main(String[] args) {
		String input="kv no 1";
		char c1[]=		input.toCharArray();	
		System.out.println(Arrays.toString(c1));
		
		System.out.println("Finding Alphabet:");
		for(int i=0;i<input.length();i++)
		{
		boolean answer1=	Character.isAlphabetic(c1[i]);
		System.out.println(answer1);
		}
		
		
		System.out.println("Finding Numeric:");
		for(int i=0;i<input.length();i++)
		{
		boolean answer1=	Character.isDigit(c1[i]);
		System.out.println(answer1);
	
	}
		
		System.out.println("Finding space:");
		for(int i=0;i<input.length();i++)
		{
		boolean answer1=	Character.isSpaceChar(c1[i]);
		System.out.println(answer1);
	
	}
	}
}
