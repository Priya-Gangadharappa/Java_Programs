package AbstractClass;

interface grand_parent1  //interface-class-class
{
	void method1(); //abstract methods
	void method2();
}

class parent1 implements grand_parent1
{
	static void method3()
	{
		System.out.println("Iam your first parent class method");
	}
	
	void method4()
	{
		System.out.println("Iam your second patent class method");
	}

	
	public void method1() 
	{
		
		System.out.println("Iam your first Interface Method");
	}

	
	public void method2() 
	{
		System.out.println("Iam your second Interface Method");
		
	}
}

public class Child1 extends parent1
{
	void method5()
	{
		System.out.println("Iam your first child method");
	}
	
	void method6()
	{
		System.out.println("Iam your second child method");
	}

	public static void main(String[] args) 
	{
		Child1 c1=new Child1();
		c1.method1();
		c1.method2();
		method3();
		c1.method4();
		c1.method5();
		c1.method6();

	}

}
