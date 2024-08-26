package SIB_and_IIB;

public class StringIndexOutOfBoundException {

	public static void main(String[] args) 
	{
		String name="priya";
		for(int i=0;i<=name.length();i++)
		{
			
			char c1=name.charAt(i);
			
			System.out.println(c1);
		}
		try
		{
			String n1="priya";
		}
		catch(StringIndexOutOfBoundsException a1)
		{
			System.out.println("StringIndexOutOfBoundsException handled");
		}
		finally
		{
			System.out.println("String should be within the range of index length");
		}
	}

}
