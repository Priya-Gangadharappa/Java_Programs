package Automation;
class one
{
	static void add()
	{
		System.out.println("1");
	}
}
class two extends one
{
	static void sub()
	{
		System.out.println("2");
	}
}
public class MultiInheri extends two
{
	static void mul()
	{
		System.out.println("3");
	}
 public static void main(String[] args)
 {
	 add();
	 sub();
	 mul();
 }
}
