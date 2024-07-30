import java.util.Scanner;
class Parent
{
void parentclass()
{
	System.out.println("This is a parent class");
	
}
}
class Child extends Parent
{
	void childclass()
	{
		System.out.println("This is a child class");
		
	}
	
}

public class Parentchild
{
	public static void main(String args[]){
	Parent p= new Parent();
	Child c=new Child();
	p.parentclass();
	
}
}
