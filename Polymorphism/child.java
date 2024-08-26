package Polymorphism;
class Parent
{
	private String username="contact@growtechminds.com";
	private String password="priya";
	
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getUsername() // return type should be same as data type of global variable
	{
		return username; 
		
	}
	public void setUsername(String username) // here username is priya.sg1212@gmail.com
	{
		this.username=username; // assigning local value to global variable 
	}
}
public class child 
{
	

	public static void main(String[] args)
	{
		Parent p1=new Parent();
		p1.setUsername("priya.sg1212@gmail.com");
		System.out.println(p1.getUsername());
		
		p1.setPassword("Abc1233");
		System.out.println(p1.getPassword());
		

	}

}
