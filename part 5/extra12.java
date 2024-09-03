import java.lang.*;
import java.util.Scanner;

class extra12
{
	
public static void main(String args[])
{
	System.out.println("hello");
	try{
		
		throw new ArithmeticException();
	}
	catch(ArithmeticException e)
	{
		System.out.println(e.getMessage());
		
	}
		
	
}
	
}
