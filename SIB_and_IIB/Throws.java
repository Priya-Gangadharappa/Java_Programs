package SIB_and_IIB;

public class Throws {

	public static void main(String[] args) throws NullPointerException, InterruptedException
	{
		Thread.sleep(2000);
        throw new NullPointerException("sorry the file is empty");
	}

} // sleep is a static method 
// throws keyword is used to declare the exception -> can declare any number of exception with throws keyword
 // syntax:- method name throws exception name 
