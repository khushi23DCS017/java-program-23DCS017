
import java.util.Scanner;
class Date
{

Scanner s=new Scanner(System.in);

int d;
int m;
int y;

     Date()
     {
	
     }
     Date(int date,int month,int year)
     {
	    d=date;
	    m=month;
	    y=year;
     }
     void setd()
     {
	    System.out.println("Enter date");
	     d=s.nextInt();
	
     }
     void setm()
     {
	    System.out.println("Enter month");
	     m=s.nextInt();
	
      }
      void sety()
     {
	   System.out.println("Enter year");
	     y=s.nextInt();
	}
	int getd()
	{
		return d;
	}
	
	int getm()
	{
		return m;
	}
	
	int gety()
	{
		return y;
	}
     void displaydate()
     {
	    System.out.println(d+"/"+m+"/"+y);
     }
}

class datetest
{
	
	public static void main(String args[])
	{
		Date d1=new Date();
		d1.setd();
		d1.setm();
		d1.sety();
		System.out.println("Date");
		d1.displaydate();
		System.out.println("23DCS017 Khushi Dadhaniya");
	}
	
	
}

