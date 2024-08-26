package Automation;

public class ParameterizedConstructor
{

	ParameterizedConstructor() // this is the constructor
	 {
		System.out.println("this is the constructor"); 
	 }
	
	ParameterizedConstructor(int a) // this is the parameterized constructor
	 {
		System.out.println("this is the  parameterized constructor"); 
	 }
	
	 public static void main(String[] args)
	 {
		//  new Amazon();
		 new ParameterizedConstructor(); //non parameterized 
		 new ParameterizedConstructor(100); // parameterized
	 }
}
                                     