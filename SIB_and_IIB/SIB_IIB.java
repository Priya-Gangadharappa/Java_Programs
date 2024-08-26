package SIB_and_IIB;

public class SIB_IIB
{
 static 
 {
	 System.out.println("SIB"); // first order of execution 
 }
 
 SIB_IIB()
 {
	 System.out.println("cONSTRUCTOR1"); //constructor is 4th order of execution
 }
 
 SIB_IIB(int a)
 {
	 System.out.println("cONSTRUCTOR2");
 }
 {
	 System.out.println("IIB1");  // iib third execution 
 }
 {
	 System.out.println("IIB2");
 }
	public static void main(String[] args) // second order 
	{
		 System.out.println("MAIN METHOD");
		 SIB_IIB s1=new SIB_IIB(); // iib and constructor will both be called when we create the object 
		 new SIB_IIB();  //every time when we create the object constructor will also be called with IIB
		 new SIB_IIB(10);
		 new SIB_IIB(10);
	}

}
