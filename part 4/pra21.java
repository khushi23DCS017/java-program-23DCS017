import java.util.Scanner;

class Degree{
    void getDegree() {
        System.out.println("I got a degree");
    }
}


class Undergraduate extends Degree {
   
    void getDegree() {
        System.out.println("I am an Undergraduate");
    }
	

}
class Postgraduate extends Degree  {
   
    void getDegree() {
        System.out.println("I am a Postgraduate");
    }
}

public class pra21{
	public static void main(String args[])
	{
		Degree D=new Degree();
		D.getDegree();
		
		Undergraduate U=new Undergraduate();
		U.getDegree();
		
		Postgraduate P=new Postgraduate();
		P.getDegree();
	}
	
}
