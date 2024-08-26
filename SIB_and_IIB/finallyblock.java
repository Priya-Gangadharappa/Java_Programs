package SIB_and_IIB;

import java.util.InputMismatchException;

public class finallyblock {

	public static void main(String[] args) {
		int rollno[]= new int[3];
		 rollno[0]=85;
		 rollno[1]=96;
		 rollno[2]=55;
		 try
		 {
			
		 rollno[3]=21;
		 }
		 catch(ArrayIndexOutOfBoundsException a1)  // whatever exception we will get that catch block will get executed
		 {
			 System.out.println("exception handeled 1");
		 }
		 catch(InputMismatchException b1)
		 {
			 System.out.println("exception handeled 2");
		 }
		 catch(NullPointerException c1)
		 {
			 System.out.println("exception handeled 3");
		 }
      finally
      {
    	  System.out.println("Thank you for using the application have a great day");
      }
	}

}
