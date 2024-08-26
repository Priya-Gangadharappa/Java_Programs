package Math_class;

public class Mathcassfxn {

	public static void main(String[] args)
	{
		System.out.println(Math.addExact(22,12)); // adding two number with integer type of value 
		System.out.println(Math.addExact(6255221, 21335112)); // adding two number with long type of value
		 
		System.out.println(Math.subtractExact(10, 5)); // subtract int value
		System.out.println(Math.subtractExact(311552, 1122112)); // long value
		
		System.out.println(Math.multiplyExact(2, 2));// multiply int value
		System.out.println(Math.multiplyExact(13254, 1232));// long value
				System.out.println(Math.multiplyExact(13335, 2));// long x, int y
				
				System.out.println(Math.max(1,126)); // int 
				System.out.println(Math.max(12.23, 32.23));//double
				System.out.println(Math.max(235.233, 3265.1244)); //float
				System.out.println(Math.max(1235112, 02356));// long
				
		System.out.println(Math.min(12.23, 23.566));//double
		System.out.println(Math.min(12.36, 32.56));//float
		System.out.println(Math.min(25, 02));//int 
		System.out.println(Math.min(1224124, 32512112));//long value
		
		System.out.println(Math.sqrt(81)); // gives squareroot of double value
		
		System.out.println(Math.random()); // gives you unique value each time you run it between 0 and 1
		//and its answer will be double digit , Return type is double 
				
		System.out.println(Math.abs(231.36)); //will always give positive value //double value
		System.out.println(Math.abs(-23.25)); // double value
		System.out.println(Math.abs(236.23));// float value
		System.out.println(Math.abs(-126)); // integer value 
		System.out.println(Math.abs(-2344265)); // long value
		
		System.out.println(Math.PI); //double value
			
				}

}
