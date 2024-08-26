package SIB_and_IIB;

public class Throws1 {

	public static void main(String[] args)throws InterruptedException
	{
String a1="Rishi";		
		
for(int i=0;i<=a1.length();i++)
{
	
	char c1=a1.charAt(i);//making to sleep program for every 2 seconds for every iteration 
	Thread.sleep(2000);
	System.out.println(c1);
}
	}

}
