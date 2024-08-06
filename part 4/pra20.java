import java.util.Scanner;
class Shape {
    void getshape() {
        System.out.println("this is shape");
    }
}


class Rectangle extends Shape {

    void getrect() {
        System.out.println("This is rectangular shape");
    }
	

}
class Circle extends Shape {
    
    void getcircle() {
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle{
	void getsquare()
	{
		 System.out.println("Square is a rectangle");
	}
	
}

 class pra20
{
	public static void main(String args[])
	{
		Square s=new Square();
		s.getshape();
		s.getrect();
		s.getsquare();
		
	}
	
}
