package SIB_and_IIB;

public class Basic_program_trycatch {

	public static void main(String[] args) {
		try
		{
		int c=1/0; // c=b/a
		
		System.out.println(c);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Handled the exception");
		}

	}

}
