import java.lang.*;
import java.util.Scanner;
 class Employee
{


String fs;
String ls;
double salary;
 Employee()
{

}

 Employee(String f,String l,double sal)
{
fs=f;
ls=l;
salary=sal;
}
void setfs()
{
	Scanner s = new Scanner(System.in);
System.out.print("Enter the first name ");
 fs=s.nextLine();

}
void setls()
{
	Scanner s = new Scanner(System.in);
System.out.print("Enter the last name ");
 ls=s.nextLine();

}
void setsal()
{
	Scanner s = new Scanner(System.in);
System.out.print("Enter the salary");
 salary=s.nextDouble();
if( salary<=0)
{
System.out.println("0.0");
}
else{
	System.out.println(salary+(0.1f*salary));
}

}
String getfs()
{
return fs;
}
String getls()
{
return ls;
}
double getfsal()
{
return salary;
}
}
public class EmployeeTest
{
	public static void main(String args[])
	{
		Employee e1=new Employee();
		e1.setfs();
		e1.setls();
		e1.setsal();
		System.out.println(e1.getfs());
		System.out.println(e1.getls());
		System.out.println(e1.getfsal());
		System.out.println("23DCS017 khushi dadhaniya");
	}
	
	
}
