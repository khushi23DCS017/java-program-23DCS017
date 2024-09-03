import java.util.*;

class student{
int rollno;
String name;

student(int rollno,String name)
{
	this.rollno=rollno;
	this.name=name;
	
}
}

class exam extends student{
int marks[] = new int[6];

exam(int rollno,String name)
{
	super(rollno,name);
	
}
void setmarks(int marks[])
{
	this.marks=marks;
}
}

class result extends exam{
	
	int total_marks;
	
	result(int rollno,String name)
	{
		super(rollno,name);
		
	}
	
	void totalmarks()
	{
	total_marks = 0;
	for (int mark : marks) {
		total_marks += mark;
	}
	}



void display()
{
	 System.out.println("Roll Number: " + rollno);
        System.out.println("Name: " + name);
		for (int i=0;i<=5;i++)
		{
			System.out.println("Subject " + (i + 1) + ": " + marks[i]);
		}
	System.out.println("Total Marks: " + total_marks);
}
}

public class Extrainheri{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter roll number:");
        int rollno = s.nextInt();
        s.nextLine(); 
		
		
		System.out.println("Enter name:");
        String name = s.nextLine();
		
		result result = new result(rollno, name);
		System.out.println("Enter marks for 6 subjects:");
        int[] marks = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("Subject " + (i + 1) + ":");
            marks[i] = s.nextInt();
        }
		
		result.setmarks(marks);
        result.totalmarks();
        result.display();
		
	}
	
}
