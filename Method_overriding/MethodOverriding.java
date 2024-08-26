package Method_overriding;// developing a method in the parent class with same name and signature as in the child class but different implementation
class parent
{
	void login() // this method is getting overridden
	{
		System.out.println("login using email id");
	}
}

public class MethodOverriding extends parent
{
	void login()
	{
		super.login(); // super keyword is used in the concept of methodoverriding 
		// to call parent class implementation with the child class implementation 
		//utilized in only non static methods 
		// can be first line or second line or anyline in the non static method                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
		System.out.println("login using mobile no");
	}
	public static void main(String[] args)
	{
		MethodOverriding m1=new MethodOverriding();
		m1.login();	
		/* or 
		new parent().login();*/ // another way to create an object and call the method  for polymorphism 
		
	}
}
