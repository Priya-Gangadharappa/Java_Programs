package String_function;

import java.util.Arrays;

public class Reverse_Array {

	public static void main(String[] args) 
	{
		int oldArray[]=new int[3];
		oldArray[0]=71;
		oldArray[1]=6;
		oldArray[2]=78;
		int revers_Array[]=new int[3];
		
		 /*revers_Array[2]=oldArray[0];
		  revers_Array[1]=oldArray[1];
		  revers_Array[0]=oldArray[2];*/
		 
		
		for(int i=0,k=revers_Array.length-1;i<oldArray.length;i++,k--)
		{
		 revers_Array[k] = oldArray[i];
			
		}
   System.out.println(Arrays.toString(oldArray));
   System.out.println(Arrays.toString(revers_Array));
	}

}
