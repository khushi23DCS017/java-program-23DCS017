import java.util.Scanner;


public class Area {
    private int length;
    private int breadth;

public Area()
{
	
}
    
    public Area(int l, int b) {
        length=l;
        breadth=b;
    }

    
    public double returnArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        System.out.print("Enter the length of the rectangle: ");
        int length = s.nextInt();

        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = s.nextInt();

        
        Area rectangle = new Area(length, breadth);
		Area rectangle1 = new Area();

       
        System.out.printf("The area of the rectangle is: " + rectangle.returnArea());
		

       
    }
}
