package String_function;

public class AverageValue_ofArray {

	public static void main(String[] args) 
	{
	 int value[]=new int[4];
	 
	 value[0]=17;
	 value[1]=35;
	 value[2]=81;
	 value[3]=42;
	 
	 double sum=0;
	 for(int i=0;i<value.length;i++)
	 {
		 sum=sum+value[i];
		 
	 }
       double average=sum/4;
       System.out.println("average of 4 number->" +average);
	}

}
