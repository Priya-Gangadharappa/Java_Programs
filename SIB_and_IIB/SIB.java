package SIB_and_IIB;

public class SIB 
{
	static
	{
		System.out.println("SIB"); //Sib will be executed first when it is present 
	}

	public static void main(String[] args) 
	{
		
       System.out.println("iAM your main method"); // when Sib will be absent at that time main method will be executed first  
	}

}
