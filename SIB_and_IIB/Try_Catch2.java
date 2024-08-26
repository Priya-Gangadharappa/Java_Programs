package SIB_and_IIB;

public class Try_Catch2 {

	public static void main(String[] args) 
	{
		int rollno[]= new int[4];
		 rollno[0]=85;
		 rollno[1]=96;
		 rollno[2]=55;
		 rollno[3]=98;
		 try
		 {
		 rollno[4]=21;
		 }
		 catch(ArrayIndexOutOfBoundsException a1)
		 {
			 System.out.println("exception handeled");
		 }
		 System.out.println("The rollnos are ");
	}		 
}
