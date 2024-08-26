package AbstractClass;
interface Grand_Parent2
{
	void mtd1();    // implementing the interface methods in directly in the child parent should be written as abstract 
	void mtd2();
	
}
abstract class Parent2 implements Grand_Parent2
{
	static void mtd3()
	{
		System.out.println("Iam your first method in abstract class");
	}
	
	void mtd4() 
	{
		System.out.println("Iam your second method in abstract class");
	}
}
public class Interface_Abstract_class extends Parent2
{
    void mtd5() {
    	int a=2;
    	int b=2;
    	System.out.println(a+b);
    }
	

	@Override
	public void mtd1() 
	{
		System.out.println("Iam your First method in Interface");
		
	}

	@Override
	public void mtd2() 
	{
		System.out.println("Iam your second method in Interface");	
	}
	public static void main(String[] args)
	{
		Interface_Abstract_class I1=new Interface_Abstract_class();
		mtd3();
		I1.mtd1();
		I1.mtd2();
		I1.mtd4();
		I1.mtd5();

	}

}
