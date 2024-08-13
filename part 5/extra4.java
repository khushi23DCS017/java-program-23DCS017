import java.lang.*;
import java.util.Scanner;

class extra4 
{
	
	public static void main(String []args) throws InterruptedException
	{ test t=new test();
	t.m1();
	}
}

class test 
{
	void m1() throws InterruptedException
	{
		m2();
	}
	void m2() throws InterruptedException
	
	{
		m3();
	     
	
	}
	void m3() throws InterruptedException
	{
		System.out.println("hi");
	
		Thread.sleep(2000);
		
		
		
		System.out.println("hello");
	}
}
