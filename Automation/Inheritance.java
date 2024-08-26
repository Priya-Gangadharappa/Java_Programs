package Automation;


class Amazon1   // parent class static in nature 
{
	static void loginwithmobileno()
	{
		System.out.println("Mbile no");
	}
	
	void registration()
	{
		System.out.println("registration no");
	}
}
public class Inheritance extends Amazon1
{
	static void logiwithemailid()
	{
		System.out.println("Email id ");
	} 
	
	void logout()
	{
		System.out.println("logout");
	}

	public static void main(String[] args) 
	{
		loginwithmobileno();
		logiwithemailid();
		Inheritance i1=new Inheritance();
		i1.registration();
		i1.logout();
		
	}

	
	}

