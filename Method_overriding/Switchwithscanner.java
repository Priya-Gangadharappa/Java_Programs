package Method_overriding;
import java.util.*;
public class Switchwithscanner 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("press 1 for Chrome");
		System.out.println("press 2 for FireFox");
		System.out.println("press 3 for Edge");
		
		int browser_selection=s1.nextInt();
		
		switch(browser_selection)
		{
		
		case 1: System.out.println("Launch Chrome browser");
		        break;
		        
		case 2: System.out.println("Launch FireFox browser");
		        break;
		        
		case 3: System.out.println("Launch Edge browser");
		        break;
		        
		default:
		System.out.println("sorry your selection is wrong");
		}

	}

}
