package SIB_and_IIB;

public class IIB //always order of execution will not be changes
{
	{   //iib
		System.out.println("IIB"); //child
	}
	static // sib
	{
		System.out.println("SIB"); // father -> first 
	}

	public static void main(String[] args) //mother -> main method 
	{
		
		System.out.println("IAM YOUR MAIN METHOD");
		new IIB(); // iib will be called when we create an object 
        
	}

}
