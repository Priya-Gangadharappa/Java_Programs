package AbstractClass;
interface Amazon11
{
	void add1();  //Abstract methods 
	void sub1();  // non static method (only non static can be overriden 
	
}
public class Flipkart implements Amazon11
{
	public void add1() 
	{
		int a=10;
		int b=7;
		System.out.println(a+b);
		
	}

	public void sub1() 
	{
		int a=10;
		int b=7;
		System.out.println(a-b);
	}
	public static void main(String[] args) 
	{
		Flipkart f1=new Flipkart();
		f1.add1();
		f1.sub1();

	}

	

}
