class MyException extends Exception
{
	MyException(String s)
	{
		super(s);
	}
	
}

public class extra14
{
	public static void main(String args[])
	{
		try{
		
		throw new MyException("java user defined exception");
	}
	catch(MyException e)
	{
		System.out.println(e.getMessage());
		System.out.println("exception caught sucessfully");
		
	}
		
	}
	
}
