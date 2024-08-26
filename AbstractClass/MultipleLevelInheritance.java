package AbstractClass;
interface A
{
	void add();
	void sub();
	}
interface B
{
	void multi();
	void div();
}

public class MultipleLevelInheritance implements A , B

{
	void mod()
	{
		int a=5;
		int b=2;
		System.out.println(a%b);
	}
	

	
	public void multi() 
	{
		int a=5;
		int b=2;
		System.out.println(a*b);
	}

	
	public void div() {
		int a=5;
		int b=2;
		
		System.out.println(a/b);
	}

	
	public void add() 
	{
		int a=5;
		int b=2;
		System.out.println(a+b);
		
	}

	
	public void sub() {
		int a=5;
		int b=2;
		System.out.println(a-b);
	}
public static void main(String[] args) 
	{
	MultipleLevelInheritance m1=new MultipleLevelInheritance();
	m1.add();
	m1.sub();
	m1.multi();
	m1.div();
	m1.mod();

	}
}
