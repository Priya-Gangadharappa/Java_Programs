package String_function;
import java.util.Arrays;
public class Special_String // program by manish 
{
	static int count_of_alphabet=0;
	static int count_of_numeric=0;
	static int count_of_space=0;
	static int count_of_specialcharacter=0;

	public static void main(String[] args) {
		String input="kv no- 8976 - bangalore";
		char []c1=		input.toCharArray();	
	//	System.out.println(Arrays.toString(c1));
		System.out.println("Finding Alphabet:");
		for(int i=0;i<input.length();i++)
		{
		boolean answer1=	Character.isAlphabetic(c1[i]);
	//	System.out.println(answer1);                                                    
		if(answer1==true)
		{
			count_of_alphabet++;
		}
		}
		System.out.println("The Total Alphabets are -> "+count_of_alphabet);

		System.out.println("Finding Numeric:");
		for(int i=0;i<input.length();i++)
		{
		boolean answer1=	Character.isDigit(c1[i]);
	//	System.out.println(answer1);
		if(answer1==true)
		{
			count_of_numeric++;
		}
	}
		System.out.println("The Total numeric count is -> "+count_of_numeric);

		System.out.println("Finding space:");
		for(int i=0;i<input.length();i++)
		{
		boolean answer1=	Character.isSpaceChar(c1[i]);
	//	System.out.println(answer1);
		if(answer1==true)
		{
			count_of_space++;
		}
	
	}
		System.out.println("The Total space count is -> "+count_of_space);
		
		/*System.out.println("Finding Special characters");
		for(int i=0;i<input.length();i++)
		{
			boolean  answer1= Character.isAlphabetic(c1[i]) - Character.isDigit(c1[i]) - Character.isSpaceChar(c1[i]);
			
			 if(answer1==true)
			 {
				 count_of_specialcharacter++;
			 }
			 
		}
System.out.println("The Total special character count is ->" +count_of_specialcharacter);*/
	}
}

