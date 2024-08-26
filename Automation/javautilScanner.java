package Automation;

import java.util.Scanner;

public class javautilScanner {

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		String a=s1.next();
		byte b=s1.nextByte();// value greater than +127 , true ,string ,char will give run time exception 
		float c=s1.nextFloat();//type casting int value gets covert into double or float automatically 
		double d=s1.nextDouble();
		long e=s1.nextLong();
		boolean f=s1.nextBoolean();
		short g=s1.nextShort();
		int h=s1.nextInt();

	}

}
 