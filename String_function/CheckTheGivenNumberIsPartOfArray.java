package String_function;

public class CheckTheGivenNumberIsPartOfArray {

	public static void main(String[] args) 
	{
		int rollno[]=new int[5];
		rollno[0]=100;
		rollno[1]=500;
		rollno[2]=200;
		rollno[3]=300;
		rollno[4]=400;
		
		int Given_no=200;
		
		for(int i=0;i<=rollno.length;i++)
		{
			if(Given_no==rollno[i])
			{
				System.out.println("Given number is part of Array at the index position-> "+i);
			}
			else
			{
			 System.out.println("sorry not Found");	
			}
		}
		

	}

}
