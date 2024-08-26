package Automation;


public class Constructor2 
{
	 
	
		Constructor2()// no parameter
		{
			System.out.println("this is constructor program");
		}

		Constructor2(int a)//  1 parameter
		{
			System.out.println("this is constructor program a");
		}
		
		Constructor2(int a,double b)// 2 parameter
		{
			System.out.println("this is constructor program b");
		}
		public static void main(String[] args)
		{
			Constructor2 c1=new Constructor2(19,3.14);
			new Constructor2();
			new Constructor2(10);
		

			
		}

	

}
