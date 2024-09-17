class First extends Thread {
   

    public void run() {
        
           
            System.out.println("first" );
        
    }
}

class Second extends Thread {
    public void run() {
        
           
            System.out.println("second" );
        
    }
}
class Third extends Thread {

    public void run() {
        
            
            System.out.println("third");
        
    }
}

public class Pra36 {
    public static void main(String[] args) {
	First f1 = new First();
	Second s1 = new Second();
	Third t1 = new Third();


f1.getPriority();
s1.getPriority();
t1.getPriority();



f1.setPriority(5);
s1.setPriority(4);
t1.setPriority(8);
	
	f1.start(); 
    s1.start(); 
    t1.start();
	
	}
}
