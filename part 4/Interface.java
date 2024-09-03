import java.util.*;
interface A
{
	void abstractmethode();
	
	static void defaultmethode()
	{
		System.out.println("Khushi");
		
	}
	
}


class B implements A
{
	public void abstractmethode(){
		
		System.out.println("hello");
	}
	public void defaultmethode(){
		
		System.out.println("ertesrgdsfgrty4tr");
	}
	
}

/*class C implements A
{
	
	public void defaultmethode(){
		
		System.out.println("i am fine");
	}
	
	
}*/

public class Interface{
	
	public static void main(String args[])
	{
	 
	 B obj=new B();
	 obj.abstractmethode();
	 obj.defaultmethode();
	 A.defaultmethode();
	 //C ob=new C();
	 //ob.defaultmethode();
	 
	}
}
