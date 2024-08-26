package String_function;

public class Palindrome {

	public static void main(String[] args)
	{
		String input="madam"; // take a string
		String output="";
		
		for(int i=input.length()-1;i>=0;i--) // reverse the string
		{
			char c1=input.charAt(i);
			output=output+c1;
		}
         System.out.println(output);
         
         if(input.equals(output))  //check if input equals to output
         {
        	 System.out.println("String is a Palindrome");
         }
         else
         {
        	 System.out.println("String is not Palindrome");
         }
	}
       
}
