
import java.util.*;

class Rectangle {
    private float length;
    private float breadth;

    Rectangle(float x, float y) {
        length = x;
        breadth = y;
    }

    public void printArea() {
        float area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    public void printPerimeter() {
        float perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}

 class Square extends Rectangle {
    public Square(float side) {
        super(side, side);
    }
}

 class pra19 {
    public static void main(String args[]) {
        int i;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of rectangles:");
        int num = s.nextInt();
        Rectangle[] r = new Rectangle[num];

        for (i = 0; i < num; i++) {
            System.out.println("Enter length and breadth for Rectangle " + (i + 1));
            float length = s.nextFloat();
            float breadth = s.nextFloat();
            r[i] = new Rectangle(length, breadth);
			r[i] = new Square(length);
        }

        for (i = 0; i < num; i++) {
            r[i].printArea();
            r[i].printPerimeter();
            System.out.println();
        }
    }
}
