package AbstractClass;// Abstract is the first keyword in java
abstract class Amazon // abstract class
{
	abstract void login1();
	abstract void registration1(); // abstract method 
}
public class Abstract_Class extends Amazon //concrete class
{
	void login1() 
	{
		System.out.println("Iam your abstract class first method");
		
	}

	
	void registration1() 
	{
		System.out.println("Iam your abstract class second method");
		
	}

 static void logout()      // concrete method 
 {
	 System.out.println("Iam your  first static method inside parent class");
	 int a=10;
	 int b=20;
	 System.out.println(a+b);
 }
 
 static void resetpassword()               // concrete method 
 {
	 System.out.println("Iam your  second static method inside parent class");
	 int a=20;
	 int b=10;
	 System.out.println(a-b);

 }
	public static void main(String[] args) //main method 
	{
		Abstract_Class a1=new Abstract_Class();
		a1.login1();
		a1.registration1();
		logout();
		resetpassword();

	}

	
	

}
