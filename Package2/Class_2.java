package Package2;

import Package1.Class_1; //Class_1 is the parent class

public class Class_2 extends Class_1 // Class_2 is a child class
{

	public static void main(String[] args) // we can access only public and protected
	{
		Class_1 c1=new Class_1();
		c1.add();
		c1.substraction();

	}

}
