package String_function;

public class Reversestringby_manish {

	public static void main(String[] args) 
	{
		String input="Manish";
		//String input="Anurag";
		String output=" ";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			output=output+c1;
			
			//System.out.println("reversing the string ->" +output); //c1 will print the string vertically 
		}
		System.out.println("reversing the string ->" +output); // output will print the string horizontally 
	}

}
