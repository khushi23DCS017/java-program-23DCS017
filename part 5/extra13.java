class MyException extends Exception
{
	
	
}

public class extra13
{
	public static void main(String args[])
	{
		try{
		
		throw new MyException();
	}
	catch(MyException e)
	{
		System.out.println(e.getMessage());
		System.out.println("exception caught sucessfully");
		
	}
		
	}
	
}
