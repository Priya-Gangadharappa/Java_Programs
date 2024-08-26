package Automation;

public class Variables_LGF

{
	void LoadGlobal()
	{
		String name="priya";//Local variable	
		System.out.println(name);	
	}
	
static void sub()
{
	int age =90;
	// variable -> any variable that is declared inside any method 
	int age2 =1;
	int sub=age-age2;
	
	System.out.println(sub);
}
	void add()
	{
		double pi=3.14;
		System.out.println(pi);
	}
	
public static void main(String[] args)
{
	int a=10;
	System.out.println(a);
	
	sub(); // static method _ local variable
	
	Variables_LGF l1=new Variables_LGF();
	l1.LoadGlobal(); // non static local variable
	l1.add();
}


}
