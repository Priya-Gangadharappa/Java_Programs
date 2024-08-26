package AbstractClass;
abstract class Grand_parent // abstract class
{
	abstract void add();
	abstract void sub();
	
	static void multi() // abstract class can have concrete methods in it 
	{
		int a=10;
		int b=20;
		System.out.println(a*b);
	}
	
}
class Parent extends Grand_parent // concrete class
{
	static void div()
	{
	int a=20;
	int b=10;
	System.out.println(a/b);
	}

	void add() 
	{
		System.out.println("iam your First abstract method");
		
	}

	void sub() 
	{
		System.out.println("iam your second abstract method");
		
	}
	
}

public class Abstract_Class_Multilevel extends Parent //concrete class
{
	void mod()
	{
		System.out.println("iam your child method");
	}

	public static void main(String[] args) 
	{
		Abstract_Class_Multilevel a1=new Abstract_Class_Multilevel();
		a1.add();
		a1.sub();
		multi();
		div();
		a1.mod();	
	}
}
